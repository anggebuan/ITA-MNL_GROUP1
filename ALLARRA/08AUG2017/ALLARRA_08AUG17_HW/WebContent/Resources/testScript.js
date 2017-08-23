function sayHello() {
   var x = document.getElementById("usernameTb").value;
   document.getElementById("test").innerHTML = x;
}

function onLoadFunctions() {
    //some funcitons here...    
	document.getElementById("transaction").style.display = "none";
  }
window.onload = onLoadFunctions;
var success = false;
var name= "Pedro";
var pin = "1234";
var bal = 100;
function Login(){
	var x = document.getElementById("usernameTb").value;
	var y = document.getElementById("pinTb").value;
	if(x=="" && y==""){
		window.alert("Please Enter valid username and password");
	}
	else if(x==name && y == pin)
		{
		document.getElementById("test").innerHTML = "login successful";
		document.getElementById("loginForm").style.display = "none";
		document.getElementById("balTb").value = bal;
		document.getElementById("transaction").style.display = "block";
		login = true;
		}
	else{
		window.alert("username and pin mismatch");
	}
		
		
	
}
function Transact()
{
	if(login == true){
	var dep = document.getElementById("depositTb").value;
	var withdraw = document.getElementById("withdrawTb").value;
	if(dep == "")
		dep = 0;
	if(withdraw=="")
		withdraw = 0;

	deposit(dep);
	withdrawal(withdraw);
	document.getElementById("depositTb").value = "";
	document.getElementById("withdrawTb").value = "";
	}
}
function deposit(x){
	var temp = parseFloat(bal)+parseFloat(x);
	if(x > 0){
	bal = temp;
	document.getElementById("balTb").value = bal;
	document.getElementById("depositMes").innerHTML = "Deposit Successful";
	}else
		document.getElementById("depositMes").innerHTML = "";
}
function withdrawal(x){
	var temp = parseFloat(bal)-parseFloat(x);
	if(x > 0){		
		if(parseFloat(temp) <0){
			document.getElementById("withdrawMes").innerHTML = "Withdraw fail";
			window.alert("fail");
		}
		else{ 
	bal = temp;
	document.getElementById("withdrawMes").innerHTML = "Withdraw Success";
	
		}
		document.getElementById("balTb").value = bal;
	}
	else
		document.getElementById("withdrawMes").innerHTML = "";
}