/*
 * File: app/view/MyViewport.js
 *
 * This file was generated by Sencha Architect version 3.0.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('week3.view.MyViewport', {
    extend: 'Ext.container.Viewport',

    requires: [
        'Ext.form.Label',
        'Ext.button.Button'
    ],

    id: 'viewkoto',
    layout: 'absolute',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'label',
                    x: 50,
                    y: 20,
                    id: 'label1',
                    text: 'Homework 3'
                },
                {
                    xtype: 'button',
                    x: 50,
                    y: 50,
                    draggable: true,
                    id: 'btnId',
                    text: 'Click me',
                    listeners: {
                        click: {
                            fn: me.onButtonClick,
                            scope: me
                        }
                    }
                }
            ],
            listeners: {
                myEvent: {
                    fn: me.onViewportMyEvent,
                    scope: me
                }
            }
        });

        me.callParent(arguments);
    },

    onButtonClick: function(button, e, eOpts) {
        Ext.Msg.alert("Homework 3", "Btn is Clicked, btn has evenListener");
        console.log("test");
        btn = Ext.getCmp("viewkoto");
        btn.fireEvent('myEvent');
        btn.setText	("test");
    },

    onViewportMyEvent: function(viewport) {
        lbl = Ext.getCmp("label1");
        lbl.setText("view portEvent triggered");
    }

});