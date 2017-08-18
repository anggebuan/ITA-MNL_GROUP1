
Ext.application({
          launch: function() {
              var b1= Ext.get('b1').select('div');
             
              Ext.each(images.elements, function(el) {
            	    var dd = Ext.create('Ext.dd.DD', el, 'imagesDDGroup', {
                        dragable: true
                    });
            	  ;
              });
          }
       }); 
      var mainTarget = Ext.create('Ext.dd.DDTarget', 'mainRoom', 'imagesDDGroup', {
         ignoreSelf: true
      });