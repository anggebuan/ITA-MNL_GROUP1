/*
 * Define your custom js function Here
 * */

// the last argument in arguments is message json object
window.showName = function () {
    console.log(arguments)
}

window.customeLeftMenu = function(event, Tibbr, item){
   console.log(item)
}

window.customActionLink = function (event, Tibbr, message) {
    var $ = Tibbr.$, type = $(event.currentTarget).data().type;

    switch (type) {
        case "innovate":
            var form = $("<form target='_blank' action='http://www.tibbr.com'  method='POST' id='custom'>" +
                "<input type='hidden'  class='id' name='id'> <input type='hidden' name='content' class='content'> </form>")
            form.find(".id").val(message.get('id'));
            form.find(".content").val(message.get('content'));
            $("body").append(form);
            form.submit();

            break;
        default:
            break;
    }
}

//On tibbr app Init Do some stuff
//window.onAppInit = function(Tibbr){
//
//	Tibbr.Event.on("nav:top:rendered", function(){
//		var html = '<div id="eval-help-wrap" class="notification"><a href="" class="eval-help"></a></div>';
//		Tibbr.$("p.welcome-greet").before(html);
//	});
//}
