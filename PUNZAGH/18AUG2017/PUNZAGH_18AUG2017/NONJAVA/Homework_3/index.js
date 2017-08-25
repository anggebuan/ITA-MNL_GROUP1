 Ext.onReady(function() {
 Ext.create('Ext.Panel', {
            renderTo: 'ExtJSAssignment',
			title: 'AutoSum',
			draggable:true,
			height : 110,
			width : 300,
			items:[{
				xtype:'textfield',
				fieldLabel: 'Num 1',
				decimalPrecision: 2,
				maskRe: /[0-9.]/,
				anchor    : '100%',
				min:0,
				emptyText : 'Enter Amount',
				enableKeyEvents: true,
				id:'num1',
				 listeners: {
					keyup: function(form, e) {
					var numbersum = Ext.getCmp('sum');
					numbersum.fireEvent('autosum');
        }
    }
			},{
				xtype:'textfield',
				fieldLabel: 'Num 2',
				decimalPrecision: 2,
				maskRe: /[0-9.]/,
				min:0,
				 anchor    : '100%',
				emptyText : 'Enter Amount',
				id:'num2',
				enableKeyEvents: true,
				 listeners: {
					keyup: function(form, e) {
					var numbersum = Ext.getCmp('sum');
					numbersum.fireEvent('autosum');
        }
    }
			},{
				xtype:'textfield',
				fieldLabel: 'Sum',
				decimalPrecision: 2,
				min:0,
				maskRe: /[0-9.]/,
				anchor    : '100%',
				readOnly:true,
				id:'sum',
				listeners:{
					autosum:function(){
						var x = parseFloat(Ext.getCmp('num1').getValue());
						var y = parseFloat(Ext.getCmp('num2').getValue());
						Ext.getCmp('sum').setValue(x+y);
					}
				}		
			}]
			});
			 });