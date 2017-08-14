Ext.onReady(function(){
	
	
Ext.define('TransactionRecords',{
	fields: ['id',{
		name:'TransactionType',
		type:'string'	
		},{
		name:'Amount',
		type:'float'	
		},{
		name:'previousBalance',
		type:'float'	
		},{
		name:'Balance',
		type:'float'	
		}],
	extend: 'Ext.data.Model',
	proxy: {
		type: 'localstorage',
		id:'TransRec'
	}	

})	
	
var store = Ext.create('Ext.data.Store', {
         model: "TransactionRecords"
    });	
Ext.define('TotalRecords',{
	fields: ['id',{
		name:'TransactionType',
		type:'string'	
		},{
		name:'TotalBalance',
		type:'float'	
		}],
	extend: 'Ext.data.Model',
	proxy: {
		type: 'localstorage',
		id:'TotalRecordsChart'
	}	

})	
	
var summarystore = Ext.create('Ext.data.Store', {
         model: "TotalRecords"
    });	

	
	
Ext.create('Ext.Panel',{
			renderTo: 'Banking',
            height: 115,
            width: 300,
            title: 'Bank Account',
			items: [
            {
						fieldLabel: 'Balance',
                        xtype     : 'textfield',
                        value : '50000.00',
                        anchor    : '100%',
						decimalPrecision: 2,
						id: 'balance',
						maskRe: /[0-9.]/,
						readOnly: true
						
            },{
						fieldLabel: 'Amount',
                        xtype     : 'textfield',
						id      : 'amount',
                        emptyText : 'Enter Amount',
                        anchor    : '100%',
						minValue: 0,
						hideTrigger: true,
						decimalPrecision: 2,
						maskRe: /[0-9.]/
			},{	 
						xtype: 'button',
                        text: 'Withdraw',
						anchor : '100%',
						id: 'withdrawbtn',
						
						handler: function(){
							var balance = parseFloat(Ext.getCmp('balance').getValue());
							var amount = parseFloat(Ext.getCmp('amount').getValue());
							if(balance>amount){
							Ext.MessageBox.alert('Success', 'Withdraw successful!');
							prevbalance=balance;
							balance-=amount;
							Ext.getCmp('balance').setValue(balance);
							store.add({TransactionType: 'Withdraw',Amount:amount,previousBalance:prevbalance,Balance:balance});
							}else{
								Ext.MessageBox.alert('Failed', 'Withdraw failed!');
							}
						}
			},{	 
						xtype: 'button',
                        text: 'Deposit',
						anchor : '100%',
						id: 'depositbtn',
						
						handler: function(){
							var balance = parseFloat(Ext.getCmp('balance').getValue());
							var amount = parseFloat(Ext.getCmp('amount').getValue());
							var prevbalance;
							if(amount<=25000){
							Ext.MessageBox.alert('Success', 'Deposit successful!');
							prevbalance=balance;
							balance+=amount;
							Ext.getCmp('balance').setValue(balance);
							store.add({TransactionType: 'Deposit',Amount:amount,previousBalance:prevbalance,Balance:balance});
							
							}else{
								Ext.MessageBox.alert('Failed', 'Deposit failed!, cannot deposit > 25000');
							}
						}
			},{	 
						xtype: 'button',
                        text: 'Transaction History',
						anchor : '100%',
						id: 'showHistory'
			},{	 
						xtype: 'button',
                        text: 'Show Chart',
						anchor : '100%',
						id: 'showChart'
			}
        ]
            });
			
	var withdrawtip = Ext.create('Ext.tip.ToolTip', {
    target: 'withdrawbtn',
    html: 'Withdraw Amount' 
});
	var deposittip = Ext.create('Ext.tip.ToolTip', {
    target: 'depositbtn',
    html: 'Deposit Amount' 
});
	var showcharttip = Ext.create('Ext.tip.ToolTip', {
    target: 'showHistory',
    html: 'Show Transaction History' 
});
	var showcharttip = Ext.create('Ext.tip.ToolTip', {
    target: 'showChart',
    html: 'Show Balance Chart' 
});
	
	var showHistory = Ext.getCmp('showHistory');
	var win;
	showHistory.on('click',function(){
		if(!win){
			
		win = Ext.create('widget.window', {
                title: 'Transaction History',
                header: {
                    titlePosition: 2,
                    titleAlign: 'center'
                },
                closable: true,
                closeAction: 'hide',
                width: 500,
                minWidth: 150,
                height: 350,
                tools: [{type: 'pin'}],
                layout: {
                    type: 'border',
                    padding: 5
                },
                items: [{
					xtype: 'gridpanel',
					store: store,
                    region: 'west',
                    width: '100%',
                    split: true,
                    floatable: false,
					 columns: [{
            text: 'Transaction Type',
            flex: 20,
            dataIndex: 'TransactionType'
        },{
            text: 'Amount',
            dataIndex: 'Amount',
            align: 'right',
            flex: 15
        },{
            text: 'Previous Balance',
            dataIndex: 'previousBalance',
            align: 'right',
            flex: 15
        },{
            text: 'Current Balance',
            dataIndex: 'Balance',
            align: 'right',
            flex: 15
        }]
		}]
            });
			}
			if (win.isVisible()) {
            win.hide(this, function() {
            });
			} else {
            win.show(this, function() {
            });
			}
	});
var showChart = Ext.getCmp('showChart');
var winChart;

showChart.on('click',function(){
		summarystore.removeAll();
		var deposittotal = 0;
		var withdrawtotal = 0;
		store.load;
		store.each(function(rec){
		if(rec.raw.TransactionType=='Withdraw'){
			withdrawtotal+=parseFloat(rec.raw.Amount);
		}else if(rec.raw.TransactionType=='Deposit'){
			deposittotal+=parseFloat(rec.raw.Amount);
		}
 	
	});
	summarystore.add({TransactionType:'Withdraw',TotalBalance: withdrawtotal},{TransactionType:'Deposit',TotalBalance: deposittotal});
		if(!winChart){

		winChart = Ext.create('widget.window', {
                title: 'Chart History',
                header: {
                    titlePosition: 2,
                    titleAlign: 'center'
                },
                closable: true,
                closeAction: 'hide',
                width: 500,
                minWidth: 150,
                height: 350,
                tools: [{type: 'pin'}],
                layout: {
                    type: 'border',
                    padding: 5
                },
                items: [{
					xtype: 'chart',
					store: summarystore,
                    region: 'west',
                    width: '100%',
                    split: true,
                    floatable: false,
					axes: [{
            type: 'Numeric',
            position: 'bottom',
            fields: ['TotalBalance'],
           
            title: 'Total',
            grid: true,
            minimum: 0
        }, {
            type: 'Category',
            position: 'left',
            fields: ['TransactionType'],
            title: 'Total Transaction'
        }],
		series: [{
            type: 'bar',
            axis: 'bottom',
            highlight: true,
           
            xField: 'name',
            yField: ['TotalBalance']
        }]
					
		}]
            });
			}
			if (winChart.isVisible()) {
            winChart.hide(this, function() {
            });
			} else {
            winChart.show(this, function() {
            });
			}
	});
});