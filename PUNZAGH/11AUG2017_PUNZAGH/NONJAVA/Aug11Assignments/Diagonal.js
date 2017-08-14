function draw () {
var canvas = document.getElementById('myCanvas');
if (canvas.getContext) {
var ctx = canvas.getContext('2d'),
X = 0,
Y = 0,
R = 20,
colors = ['#FFFFFF', '#D5D8DC', '#BDBDBD', '#A4A4A4', '#585858','#2E2E2E'];

for (var i = 0; i < 6; i++) {
ctx.beginPath();
ctx.arc(X = X+40,Y = Y+40,R,0,Math.PI*2);
ctx.fillStyle = colors[i];
ctx.fill();
ctx.stroke();
ctx.closePath();
}
}
}