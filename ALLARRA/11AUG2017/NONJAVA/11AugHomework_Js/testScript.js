window.onload = onload();
function onload(){
	//var palindromeEvent = document.getElementById("PalStrTB");
	//day();
	drawSquare();
	Exercise2();
	Exercise3();
	Exercise4();
}
function day()
{
	var date = new Date();
	document.getElementById("daytime").innerHTML = "Today is " + date.getDay("ddd");
	var dayName = new Array ("Monday","Tuesday","Wednesday","Thursday","Friday","saturday","Sunday");
	
	document.getElementById("daytime").innerHTML = "Today is " + dayName[date.getDay("ddd")-1] +"\nCurrent Time is: " + date.getTime("HH");
	
}
function button1(){
	var output = 1;
	document.getElementById("factorialExcercise").innerHTML = "Factorial of"
	for(x =1; x<= document.getElementById("numTB").value; x++){
		output = output * x;
	}
	document.getElementById("factorialExcercise").innerHTML += " " + document.getElementById("numTB").value + " is " + output ;
	day()	
}

function factorial(total, num){
	if(num==0){
		return total;
	}else
	{window.alert(total);
		factorial(parseInt(total)*parseInt(num), parseInt(num)-1);
	}	
}
function Permutation(){
	var tempString = document.getElementById("stringTB").value;

	document.getElementById("permutationExcercise").innerHTML = "Possible Combination is :"
	for(x = 0;x <= tempString.length; x++)
	{
		for(z = 0;z < x; z++)
		{
			document.getElementById("permutationExcercise").innerHTML += tempString.substring(x,z) + ", " ;
		}
	}
}
function Palindrome(){
	var temp =  document.getElementById("PalStrTB").value;
	var temp1 = " ";
	for( x = temp.length-1; x>=0;x--){
		temp1+=temp[x];
		console.log(temp1)
	}
	document.getElementById("palindromeExcercise").innerHTML = "Palindrome is: " + temp1
}
function isLeapYear(){
	var temp = document.getElementById("YearStrTB").value
	if(temp%4==0){
		document.getElementById("isLeapYearExcercise").innerHTML = "Year is: Leap Year" 
	}
	else
		document.getElementById("isLeapYearExcercise").innerHTML = "Year is: not a Leap Year" 
}


function IsNumeric(){
	var temp = document.getElementById("numericStrTB").value

	if( /^\d+$/.test(temp))
		document.getElementById("IsNumericExcercise").innerHTML = "Input is: Numeric" 
	else
	document.getElementById("IsNumericExcercise").innerHTML = "Input is: not Numeric"

	
}


function IsPrime(){
	var temp = document.getElementById("primeStrTB").value
	var temp1 = [];
	var flag = false;
	document.getElementById("isPrimeExcercise").innerHTML = "Prime Numbers are: "
	for(x=1; x<= temp; x++ ){
		flag=false;
		for(y=1; y<x;y++){
			for(z=1; z<x;z++){
				if(z*y == x){
					if(z!=1 || y!=1){
						flag=true
					}
					else
						flag = false;
				}	
			}
		}
		 	if(flag==false && x != 2){
				console.log(flag);
					temp1.push(x)
					console.log(x)
				document.getElementById("isPrimeExcercise").innerHTML += x +", "		
			}
	}
}

function CamelCase() {

var valueFromField7 = (document.getElementById("camelStrTB").value).split(" ");
//var splitten = toCamelize.split(" ");
document.getElementById("CamelCaseExcercise").innerHTML = valueFromField7[0].charAt(0).toUpperCase();
for(var i = 0; i<valueFromField7.length;i++){
valueFromField7[i] = valueFromField7[i].charAt(0).toUpperCase() + valueFromField7[i].substring(1,valueFromField7[i].length);
}
document.getElementById("CamelCaseExcercise").innerHTML = valueFromField7.join("");
}

function drawSquare(){
	var canvas = document.getElementById("Box1");
	var ctx = canvas.getContext("2d");
	ctx.lineWidth = 35;

	ctx.strokeRect(70,25,150,150);
	ctx.lineWidth = 2;
	ctx.strokeStyle = "#999999"
	ctx.strokeRect(95,50,100,100);
}
function Exercise2(){
	var canvas = document.getElementById("Box2");
	var ctx = canvas.getContext("2d");
	ctx.fillStyle = "Red"
	ctx.fillRect(70,25,100,100);
	ctx.fillStyle = "rgba(0,51,204,0.5)";
	ctx.fillRect(110,65,100,100);
}
function Exercise3(){
	var canvas = document.getElementById("Box3");
	var ctx = canvas.getContext("2d");
	ctx.beginPath();
	ctx.arc(145,100,80,0,2*Math.PI);
	ctx.stroke();
	ctx.closePath();
	ctx.beginPath();
	ctx.arc(170,80,8,0,2*Math.PI);
	ctx.stroke();
	ctx.closePath();
	ctx.beginPath();
	ctx.arc(120,80,8,0,2*Math.PI);
	ctx.stroke();
	ctx.closePath();
	ctx.beginPath();
	ctx.arc(145,95,60,0,1*Math.PI);
	ctx.stroke();
	ctx.closePath();
	ctx.beginPath();
	
	ctx.moveTo(111,80);
	ctx.lineTo(179,80);
	ctx.stroke();
}
function Exercise4(){
	var canvas = document.getElementById("Box4");
	var ctx = canvas.getContext("2d");
	var strClr = new Array("#ffffff","#bfbfbf","#808080","#404040","#1a1a1a","#000000");
	for(x=0; x<12;x+=2){
	ctx.beginPath();
	ctx.fillStyle = strClr[x/2];
	ctx.arc(25+x*(20)+x*5,25+x*(15),15,0,2*Math.PI);
	ctx.stroke();
	ctx.fill();
	ctx.closePath();	
	}
	
}

	
	

















