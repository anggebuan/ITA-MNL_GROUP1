/*
 * File: app/view/com/oocl/ir4/gsp/exercise/ExerciseViewPort.js
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

Ext.define('MyApp.view.com.oocl.ir4.gsp.exercise.ExerciseViewPort', {
    extend: 'Ext.container.Viewport',

    requires: [
        'Ext.form.Panel',
        'Ext.form.field.TextArea',
        'Ext.form.RadioGroup',
        'Ext.form.field.Radio',
        'Ext.form.field.ComboBox',
        'Ext.toolbar.Toolbar',
        'Ext.button.Button',
        'Ext.grid.Panel',
        'Ext.grid.column.Number',
        'Ext.grid.column.Date',
        'Ext.grid.column.Boolean',
        'Ext.grid.View'
    ],

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    height: 400,
                    bodyPadding: 10,
                    title: 'My Form',
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Birthday'
                        },
                        {
                            xtype: 'container',
                            layout: 'column',
                            items: [
                                {
                                    xtype: 'container',
                                    items: [
                                        {
                                            xtype: 'textfield',
                                            id: 'telephoneTextField',
                                            fieldLabel: 'Telephone',
                                            listeners: {
                                                change: {
                                                    fn: me.onTelephoneTextFieldChange,
                                                    scope: me
                                                }
                                            }
                                        },
                                        {
                                            xtype: 'textfield',
                                            id: 'faxTextField',
                                            fieldLabel: 'Fax'
                                        }
                                    ]
                                },
                                {
                                    xtype: 'container',
                                    items: [
                                        {
                                            xtype: 'textareafield',
                                            fieldLabel: 'Address'
                                        }
                                    ]
                                }
                            ]
                        },
                        {
                            xtype: 'radiogroup',
                            width: 400,
                            fieldLabel: 'Gender',
                            items: [
                                {
                                    xtype: 'radiofield',
                                    boxLabel: 'Male'
                                },
                                {
                                    xtype: 'radiofield',
                                    boxLabel: 'Female'
                                }
                            ]
                        },
                        {
                            xtype: 'combobox',
                            anchor: '100%',
                            fieldLabel: 'Label',
                            displayField: 'Name',
                            store: 'dayStore',
                            valueField: 'Description'
                        },
                        {
                            xtype: 'toolbar',
                            layout: {
                                type: 'hbox',
                                pack: 'end'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    text: 'MyButton',
                                    listeners: {
                                        click: {
                                            fn: me.onButtonClick,
                                            scope: me
                                        }
                                    }
                                }
                            ]
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'gridpanel',
                            dock: 'bottom',
                            title: 'My Grid Panel',
                            columns: [
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'string',
                                    text: 'String'
                                },
                                {
                                    xtype: 'numbercolumn',
                                    dataIndex: 'number',
                                    text: 'Number'
                                },
                                {
                                    xtype: 'datecolumn',
                                    dataIndex: 'date',
                                    text: 'Date'
                                },
                                {
                                    xtype: 'booleancolumn',
                                    dataIndex: 'bool',
                                    text: 'Boolean'
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    },

    onTelephoneTextFieldChange: function(field, newValue, oldValue, eOpts) {
        var fax = null;
        fax = Ext.getCmp("faxTextField");
        fax.disable();
    },

    onButtonClick: function(button, e, eOpts) {
        Ext.Ajax.request({
            url: '/wls_prs_gsp/secured/training/testNoView',
            method: 'post',
            success: function(response, opts){
                var obj = Ext.decode(response.responseText);
                console.dir(obj);
            },
            failure: function(response, opts){
                console.log('server-side failure with status code ' + response.status);
            }
        });
    }

});