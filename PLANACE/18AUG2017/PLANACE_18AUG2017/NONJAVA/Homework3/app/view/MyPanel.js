/*
 * File: app/view/MyPanel.js
 *
 * This file was generated by Sencha Architect version 3.0.4.
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

Ext.define('Homework3.view.MyPanel', {
    extend: 'Ext.panel.Panel',

    requires: [
        'Ext.button.Button',
        'Ext.form.field.Text',
        'Ext.form.field.Checkbox'
    ],

    height: 362,
    width: 548,
    title: 'Event Lists',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'button',
                    allowDepress: false,
                    text: 'Click Me',
                    listeners: {
                        click: {
                            fn: me.onButtonClick,
                            scope: me
                        }
                    }
                },
                {
                    xtype: 'textfield',
                    fieldLabel: 'Input Text',
                    listeners: {
                        change: {
                            fn: me.onTextfieldChange,
                            scope: me
                        }
                    }
                },
                {
                    xtype: 'checkboxfield',
                    fieldLabel: 'Check',
                    boxLabel: 'Check me',
                    listeners: {
                        change: {
                            fn: me.onCheckboxfieldChange,
                            scope: me
                        }
                    }
                }
            ]
        });

        me.callParent(arguments);
    },

    onButtonClick: function(button, e, eOpts) {
        Ext.Msg.alert("Button is cliked", "The button is clicked!!");
    },

    onTextfieldChange: function(field, newValue, oldValue, eOpts) {
        Ext.Msg.alert("Text Field", "Text in field is changed!");
    },

    onCheckboxfieldChange: function(field, newValue, oldValue, eOpts) {
        Ext.Msg.alert("Check Box", "Value is changed!");
    }

});