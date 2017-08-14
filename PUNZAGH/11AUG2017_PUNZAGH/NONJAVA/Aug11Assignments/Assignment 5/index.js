 Ext.onReady(function() {
         Ext.create('Ext.Panel', {
            renderTo: 'ExtJSAssignment',
            height: 115,
            width: 300,
            title: 'Login Page',
			items: [
            {
						fieldLabel: 'Username',
                        xtype     : 'textfield',
                        emptyText : 'Enter Username',
                        anchor    : '100%',
						id: 'Username'
            },{
						fieldLabel: 'Password',
                        xtype     : 'textfield',
						id      : 'Password',
						inputType: 'password',
                        emptyText : 'Enter Password',
                        anchor    : '100%'
			},{	 
						xtype: 'button',
                        text: 'Login',
						anchor : '100%',
						handler: function(){
							var username = Ext.getCmp('Username').getValue();
							var password = Ext.getCmp('Password').getValue();
							if(username=='admin'&&password=='admin'){
							Ext.MessageBox.alert('Login Successful', 'Welcome!',showResult);
							}else{
								Ext.MessageBox.alert('Login Failed', 'Username/Password is incorrect.');
							}
						}
			}
        ]
            });
			
				function showResult(){
			 window.location.href = ('banking.html');
		 }
         }
		 
		 
		 
		 );