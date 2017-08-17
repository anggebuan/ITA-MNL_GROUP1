Ext.application({
	launch : function() {
		var images = Ext.get('images').select('img');
		Ext.each(images.elements, function(el) {
			var dd = Ext.create('Ext.dd.DD', el, 'imagesDDGroup', {
				isTarget : false
			});
		});
	}
});
var mainTarget = Ext.create('Ext.dd.DDTarget', 'mainRoom', 'imagesDDGroup', {
	ignoreSelf : false
});
