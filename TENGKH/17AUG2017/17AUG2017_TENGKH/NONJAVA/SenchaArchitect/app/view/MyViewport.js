/*
 * File: app/view/MyViewport.js
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

Ext.define('MyApp.view.MyViewport', {
    extend: 'Ext.container.Viewport',

    requires: [
        'Ext.Img'
    ],

    layout: 'absolute',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'image',
                    x: 730,
                    y: 140,
                    draggable: true,
                    height: 300,
                    width: 250,
                    src: 'app%5Cview%5Cblack.jpeg'
                },
                {
                    xtype: 'image',
                    x: 300,
                    y: 120,
                    draggable: true,
                    height: 300,
                    width: 250,
                    src: 'app%5Cview%5Cred.jpeg'
                },
                {
                    xtype: 'image',
                    draggable: true,
                    height: 300,
                    width: 250,
                    src: 'app%5Cview%5Cblack.jpeg'
                },
                {
                    xtype: 'image',
                    x: 0,
                    y: 270,
                    draggable: true,
                    height: 300,
                    width: 250,
                    src: 'app%5Cview%5Cred.jpeg'
                }
            ]
        });

        me.callParent(arguments);
    }

});