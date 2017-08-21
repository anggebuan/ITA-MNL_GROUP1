/**
 * 
 */
function onCreateTableClickButton(){
	
	var rowNum = document.getElementById("rowTb").value;
	var colNum = document.getElementById("colTb").value;
	var table = document.getElementById("myTable");
	z = table.rows.length
	if(table.rows.length > 0){
		for(i =0; i<z;i++){
			table.deleteRow(0);
		}
	}
	
	for(x =0; x<rowNum;x++)
	{
		row = table.insertRow();
	
		for(i=0; i<colNum; i++){
			var col = row.insertCell();
			col.innerHTML = "Row"+(x+1)+"Col"+(i+1);
		}
	}	
}
var myImg;
var imgObj;
var xflag = true;
function init(){
	var canvas = document.getElementById('myCanvas'),
	context = canvas.getContext("2d");
	make_base(context);
	imgObj = document.getElementById('img1');
	imgObj.style.position = 'relative';
	imgObj.style.left = '3px';
	document.getElementById("rightButton").addEventListener("click", toRightFunction, false); 
	document.getElementById("leftButton").addEventListener("click", toLeftFunction, false);
}
function toRightFunction(){
	var canvas = document.getElementById('myCanvas');	
	context = canvas.getContext("2d");
	for(z=0; z<300;z++){
		context.clearRect(0, 0, canvas.width, canvas.height);
		base_image = new Image(context);
		base_image.src = "./resources/pics/img2.jpg";
		myImg = context.drawImage(base_image,z,0);
		setTimeout(1000);
	}
	move();
}
	
function move() {

	if (xflag) {
		imgObj.style.left = parseInt(imgObj.style.left) + 10 + 'px';
	} else {
		imgObj.style.left = parseInt(imgObj.style.left) - 10 + 'px';
	}

	if (parseInt(imgObj.style.left) === 353) {
		xflag = false;
	}
	if (parseInt(imgObj.style.left) === 3) {
		xflag = true;
	}
	
	
	
	animate = setTimeout(move, 1); 


}

function toLeftFunction(){
	var canvas = document.getElementById('myCanvas');
	
	context = canvas.getContext("2d");
	for(z=50; z>0;z--){
		context.clearRect(0, 0, canvas.width, canvas.height);
		base_image = new Image(context);
		base_image.src = "./resources/pics/img2.jpg";
		myImg = context.drawImage(base_image,z,0);
		
	}
	move();
	
	
}


function make_base(context)
{
  base_image = new Image(context);
  base_image.src = "./resources/pics/img2.jpg";
  myImg = context.drawImage(base_image, 0, 0);
}
window.onload = init();