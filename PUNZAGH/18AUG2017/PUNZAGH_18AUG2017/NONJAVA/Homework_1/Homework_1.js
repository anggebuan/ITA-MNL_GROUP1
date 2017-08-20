var prevrn = 0;
var prevcn = 0; 
function createTable()
{
rn = document.getElementById("rows").value;
cn = document.getElementById("columns").value;


if(document.getElementById('theTable').rows.length>0){
 for(var ctr=0;ctr<parseInt(prevrn);ctr++){
	 document.getElementById('theTable').deleteRow(0);
 }
 }
 for(var r=0;r<parseInt(rn,10);r++)
  {	
   var x = document.getElementById('theTable').insertRow(r);
   for(var c=0;c<parseInt(cn,10);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML="Row#"+r+" Column#"+c; 
    }
   }
   prevrn = rn;
}