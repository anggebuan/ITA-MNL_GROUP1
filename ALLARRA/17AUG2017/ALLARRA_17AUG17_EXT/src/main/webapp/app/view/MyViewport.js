Ext.define('testApp.view.MyViewport', {
    extend: 'Ext.container.Viewport',

    requires: [
        'Ext.panel.Panel',
        'Ext.Img'
    ],

    layout: 'absolute',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'panel',
                    x: 10,
                    y: 20,
                    height: 350,
                    width: 1180,
                    layout: 'absolute',
                    title: 'Panel2',
                    items: [
                        {
                            xtype: 'panel',
                            x: -7,
                            y: -54,
                            height: 380,
                            width: 600,
                            layout: 'absolute',
                            title: 'Panel1',
                        },
                        {
                            xtype: 'panel',
                            x: 610,
                            y: -40,
                            height: 380,
                            width: 520,
                            layout: 'absolute',
                            title: 'Panel1'
                        },
                        {
                            xtype: 'image',
                            x: 10,
                            y: 30,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img1.jpg'
                        },
                        {
                            xtype: 'image',
                            x: 160,
                            y: 30,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img2.jpg'
                        },
                        {
                            xtype: 'image',
                            x: 320,
                            y: 30,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img3.jpg',
                            listeners: {
                                move: {
                                    fn: me.onImageMove,
                                    scope: me
                                }
                            }
                        },
                        {
                            xtype: 'image',
                            x: 320,
                            y: 160,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img1.jpg'
                        },
                        {
                            xtype: 'image',
                            x: 30,
                            y: 160,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img4.jpg'
                        },
                        {
                            xtype: 'image',
                            x: 170,
                            y: 160,
                            draggable: true,
                            height: 80,
                            width: 100,
                            src: 'app/view/img5.jpg'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    },

    onImageMove: function(component, x, y, eOpts) {
        console.log(x,y);
    }

});