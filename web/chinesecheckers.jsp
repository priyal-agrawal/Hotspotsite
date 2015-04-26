

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hotspot</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
                <SCRIPT LANGUAGE="JavaScript">
<!-- Begin
var pos=new Array(49);
var jumps=new Array();
var boardType="Solitaire";
var numMoves=0;
var finished=false;
var selectnum=false;
var autosolve=false;
var running=false;
var basenum=0;
var destnum=0;
var destnum1=0;
var destnum2=0;
var destnum3=0;
var destnum4=0;
var delaynum=500;
if (document.images) {
blank = new Image(29,29);
blank.src = "blank.gif";
empty = new Image(29,29);
empty.src = "empty.gif";
emptysel = new Image(29,29);
emptysel.src = "emptysel.gif";
peg = new Image(29,29);
peg.src = "peg.gif";
pegact = new Image(29,29);
pegact.src = "pegact.gif";
}
function display(pos,basenum,destnum) {
selectnum=false;
if (!basenum && !destnum) {
for (var i=0; i<pos.length; i++) {
if (pos[i]==-1) document.images["img"+i].src=blank.src;
else if (pos[i]==1) document.images["img"+i].src=peg.src;
else document.images["img"+i].src=empty.src;
 }
}
else {
document.images["img"+basenum].src=empty.src;
document.images["img"+(basenum+destnum/2)].src=empty.src;
document.images["img"+(basenum+destnum)].src=peg.src;
for (var i=0; i<pos.length; i++) {
if (document.images["img"+i].src==emptysel.src)
document.images["img"+i].src=empty.src;
 }
}
if (numMoves>1) win();
}
function move(num) {
var curNumMoves=numMoves;
if (!document.images)
alert("Your browser does not support the 'document.images' property.You\n" +
"should upgrade to at least Netscape 3.0 or Internet explorer 4.0.");
else if (autosolve && running) {}
else if (autosolve && !finished) {
if (confirm('You interrupted the \'Solve\' function. Want to try it yourself?'))
newGame();
}
else if (selectnum) {
if (num!=basenum && num!=basenum+destnum1 && num!=basenum+destnum2 &&
num!=basenum+destnum3 && num!=basenum+destnum4)
alert("Select a destination or click on the original peg again!");
else if (num==basenum) {
document.images["img"+basenum].src=peg.src;
if (destnum1!=0)
document.images["img"+(basenum+destnum1)].src=empty.src;
if (destnum2!=0)
document.images["img"+(basenum+destnum2)].src=empty.src;
if (destnum3!=0)
document.images["img"+(basenum+destnum3)].src=empty.src;
if (destnum4!=0)
document.images["img"+(basenum+destnum4)].src=empty.src;
selectnum=false;
}
else if (num==basenum+destnum1) movePeg(basenum,destnum1)
else if (num==basenum+destnum2) movePeg(basenum,destnum2)
else if (num==basenum+destnum3) movePeg(basenum,destnum3)
else if (num==basenum+destnum4) movePeg(basenum,destnum4)
}
else if (pos[num]==0) {
}
else if ((num==3 || num==10) && pos[num+7]==1 && pos[num+14]==0) movePeg(num,14);
else if ((num==45 || num==38) && pos[num-7]==1 && pos[num-14]==0) movePeg(num,-14);
else if ((num==21 || num==22) && pos[num+1]==1 && pos[num+2]==0) movePeg(num,2);
else if ((num==26 || num==27) && pos[num-1]==1 && pos[num-2]==0) movePeg(num,-2);
else if (num==4 || num==11 || num==29 || num==20) {
if (pos[num-1]==1 && pos[num-2]==0 && pos[num+7]==1 && pos[num+14]==0)
selPeg(num,-2,14);
else if (pos[num-1]==1 && pos[num-2]==0) movePeg(num,-2);
else if (pos[num+7]==1 && pos[num+14]==0) movePeg(num,14);
}
else if (num==2 || num==9 || num==14 || num==15) {
if (pos[num+1]==1 && pos[num+2]==0 && pos[num+7]==1 && pos[num+14]==0)
selPeg(num,2,14);
else if (pos[num+1]==1 && pos[num+2]==0) movePeg(num,2);
else if (pos[num+7]==1 && pos[num+14]==0) movePeg(num,14);
}
else if (num==28 || num==29 || num==37 || num==44) {
if (pos[num+1]==1 && pos[num+2]==0 && pos[num-7]==1 && pos[num-14]==0)
selPeg(num,2,-14);
else if (pos[num+1]==1 && pos[num+2]==0) movePeg(num,2);
else if (pos[num-7]==1 && pos[num-14]==0) movePeg(num,-14);
}
else if (num==33 || num==34 || num==39 || num==46) {
if (pos[num-1]==1 && pos[num-2]==0 && pos[num-7]==1 && pos[num-14]==0)
selPeg(num,-2,-14);
else if (pos[num-1]==1 && pos[num-2]==0) movePeg(num,-2);
else if (pos[num-7]==1 && pos[num-14]==0) movePeg(num,-14);
}
else if (num==16 || num==17 || num==18 || num==23 || num==24 || num==25 || num==30 || num==31 || num==32) {
var cond1=(pos[num-1]==1 && pos[num-2]==0);
var cond2=(pos[num-7]==1 && pos[num-14]==0);
var cond3=(pos[num+1]==1 && pos[num+2]==0);
var cond4=(pos[num+7]==1 && pos[num+14]==0);
if ((cond1 && (cond2 || cond3 || cond4)) ||
(cond2 && (cond1 || cond3 || cond4)) ||
(cond3 && (cond1 || cond2 || cond4)))
{
basenum=num;
destnum1=destnum2=destnum3=destnum4=0;
document.images["img"+basenum].src=pegact.src;
if (cond1) {
destnum1=-2;
document.images["img"+(basenum+destnum1)].src=emptysel.src;
}
if (cond2) {
destnum2=-14;
document.images["img"+(basenum+destnum2)].src=emptysel.src;
}
if (cond3) {
destnum3=2;
document.images["img"+(basenum+destnum3)].src=emptysel.src;
}
if (cond4) {
destnum4=14;
document.images["img"+(basenum+destnum4)].src=emptysel.src;
}
selectnum=true;
}
else if (cond1) movePeg(num,-2);
else if (cond2) movePeg(num,-14);
else if (cond3) movePeg(num,2);
else if (cond4) movePeg(num,14);
}
if (curNumMoves!=numMoves) display(pos,basenum,destnum);
else if (finished) win();
}
function selPeg(num,ofset1,ofset2) {
basenum=num;
destnum1=ofset1;
destnum2=ofset2;
destnum3=destnum4=0;
document.images["img"+basenum].src=pegact.src;
document.images["img"+(basenum+destnum1)].src=emptysel.src;
document.images["img"+(basenum+destnum2)].src=emptysel.src;
selectnum=true;
}
function movePeg(num,ofset) {
pos[num+ofset]=1;
pos[num+ofset/2]=pos[num]=0
basenum=num;
destnum=ofset;
numMoves++;
}
function win() {
var cnt=0;
for(var i=0; i<pos.length; i++) {
if (pos[i]!=-1) cnt+=pos[i];
}
if (cnt==1 && autosolve) {
if (confirm('You let the \'Solve\' function do it.Want to try it yourself?'))
newGame();
}
else if (cnt==1 && pos[24]==1) {
finished=true;
if (confirm('You found the best solution! Do you want to restart?')) newGame();
}
else if (cnt==1) {
finished=true;
if (confirm('You did it! Do you want to restart?')) newGame();
}
else {
var legalMoves=false;
var num=0;
while (num<pos.length && !legalMoves) {
if (pos[num]==1 &&
(((num==2 || num==9 || num==14 || num==15 || num==16 || num==17 ||
num==18 || num==23 || num==24 || num==25 || num==30 || num==31 ||
num==32 || num==21 || num==22 || num==28 || num==29 || num==37 ||
num==44) && pos[num+1]==1 && pos[num+2]==0) ||
((num==4 || num==11 || num==29 || num==20 || num==16 || num==17 ||
num==18 || num==23 || num==24 || num==25 || num==30 || num==31 ||
num==32 || num==26 || num==27 || num==33 || num==34 || num==39 ||
num==46) && pos[num-1]==1 && pos[num-2]==0) ||
((num==2 || num==9 || num==14 || num==15 || num==16 || num==17 ||
num==18 || num==23 || num==24 || num==25 || num==30 || num==31 ||
num==32 || num==4 || num==11 || num==29 || num==20 || num==3 ||
num==10) && pos[num+7]==1 && pos[num+14]==0) ||
((num==33 || num==34 || num==39 || num==46 || num==16 || num==17 ||
num==18 || num==23 || num==24 || num==25 || num==30 || num==31 ||
num==32 || num==45 || num==38 || num==28 || num==29 || num==37 ||
num==44) && pos[num-7]==1 && pos[num-14]==0)))
legalMoves=true;
num++;
}
if (!legalMoves) {
finished=true;
if (confirm('No more valid moves! Do you want to restart?')) newGame();
      }
   }
}
function newGame() {
if (autosolve && running) {}
else if (document.images) {
autosolve=false;
finished=false;
if (boardType=="Cross") {
for (var i=0; i<pos.length; i++) pos[i]=0;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[10]=pos[16]=pos[17]=pos[18]=pos[24]=pos[31]=1;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Plus") {
for (var i=0; i<pos.length; i++) pos[i]=0;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[10]=pos[17]=pos[22]=pos[23]=pos[24]=1;
pos[25]=pos[26]=pos[31]=pos[38]=1;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Fireplace") {
for (var i=0; i<pos.length; i++) pos[i]=0;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[2]=pos[3]=pos[4]=pos[9]=pos[10]=1;
pos[11]=pos[16]=pos[17]=pos[18]=1;
pos[23]=pos[25]=1;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Up Arrow") {
for (var i=0; i<pos.length; i++) pos[i]=0;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[3]=pos[9]=pos[10]=pos[11]=pos[15]=1;
pos[16]=pos[17]=pos[18]=pos[29]=1;
pos[24]=pos[31]=pos[37]=pos[38]=1;
pos[39]=pos[44]=pos[45]=pos[46]=1;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Pyramid") {
for (var i=0; i<pos.length; i++) pos[i]=0;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[10]=pos[16]=pos[17]=pos[18]=pos[22]=1;
pos[23]=pos[24]=pos[25]=pos[26]=1;
pos[28]=pos[29]=pos[30]=pos[31]=1;
pos[32]=pos[33]=pos[34]=1;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Diamond") {
for (var i=0; i<pos.length; i++) pos[i]=1;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[2]=pos[4]=pos[14]=pos[20]=pos[24]=0;
pos[28]=pos[34]=pos[44]=pos[46]=0;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
else if (boardType=="Solitaire") {
for (var i=0; i<pos.length; i++) pos[i]=1;
pos[0]=pos[1]=pos[5]=pos[6]=-1;
pos[7]=pos[8]=pos[12]=pos[13]=-1;
pos[24]=0;
pos[35]=pos[36]=pos[40]=pos[41]=-1;
pos[42]=pos[43]=pos[47]=pos[48]=-1;
}
numMoves=0;
running=true;
changeBoard();
running=false;
solveArray();
display(pos);
}
else
alert("Your browser does not support the 'document.images' property.You\n" +
"should upgrade to at least Netscape 3.0 or Internet explorer 4.0.");
}
function initArray() {
this.length=initArray.arguments.length;
for (var i=0; i<this.length; i++) {
this[i] = initArray.arguments[i];
   }
}
function drawPreview(start,end) {
i=start;
j=end;
baseref=jumps[start];
offset=jumps[start+1];
pos[baseref]=pos[baseref+offset/2]=0;
pos[baseref+offset]=1;
document.images["img"+baseref].src=pegact.src;
document.images["img"+(baseref+offset)].src=emptysel.src;
solveRunning=setTimeout('drawJump(i,j)',delaynum);
}
function drawJump(start,end) {
i=start; j=end;
baseref=jumps[start];
offset=jumps[start+1];
document.images["img"+baseref].src=empty.src;
document.images["img"+(baseref+offset/2)].src=empty.src;
document.images["img"+(baseref+offset)].src=peg.src;
if (start+2==end) {
document.buttonsform.solve.value="Solve";
running=false;
finished=true;
setTimeout('win()',delaynum);
}
else solveRunning=setTimeout('drawPreview(i+2,j)',delaynum);
}
function solve() {
if (!document.images)
alert("Your browser does not support the 'document.images' property.You\n" +
"should upgrade to at least Netscape 3.0 or Internet explorer 4.0.");
else if (autosolve && running) {
clearTimeout(solveRunning);
document.buttonsform.solve.value="Solve";
running=false;
}
else {
document.buttonsform.solve.value=" Stop ";
newGame();
autosolve=true;
running=true;
solveRunning=setTimeout('drawPreview(0,jumps.length)',delaynum);
   }
}
function changeBoard() {
formName=document.buttonsform;
if (!running) {
boardType=formName.options[formName.options.selectedIndex].value;
newGame();
}
else {
optlength=formName.options.length;
for (var m=0; m<optlength; m++) {
if (formName.options[m].value==boardType) {
formName.options.selectedIndex=m;
break;
         }
      }
   }
}
function solveArray() {
if (boardType=="Cross") {
jumps = new initArray(17,-2,31,-14,18,-2,15,2,10,14);
}
else if (boardType=="Plus") {
jumps = new initArray(23,-2,25,-2,10,14,24,-2,21,2,
38,-14,23,2,26,-2);
}
else if (boardType=="Fireplace") {
jumps = new initArray(17,2,4,14,25,-14,2,2,4,14,
29,-2,10,14,24,-2,9,14,22,2);
}
else if (boardType=="Up Arrow") {
jumps = new initArray(46,-14,31,2,45,-14,44,-14,30,2,33,-2,
18,-14,4,-2,16,2,2,14,15,2,18,-2,31,
-14,16,2,29,-2,10,14);
}
else if (boardType=="Pyramid") {
jumps = new initArray(23,14,25,14,28,2,34,-2,37,-14,39,-14,
16,14,18,-2,31,-2,29,-14,15,2,17,14,
26,-2,31,-14,10,14);
}
else if (boardType=="Diamond") {
jumps = new initArray(30,14,44,2,32,2,34,-14,18,-14,4,-2,
16,-2,14,14,46,-14,20,-2,2,14,28,2,
38,-14,17,-2,15,14,29,2,31,2,33,-14,
29,-2,24,-2,10,14,25,-2,22,2);
}
else if (boardType=="Solitaire") {
jumps = new initArray(38,-14,33,-2,46,-14,25,14,44,2,46,-14,
11,14,20,-2,17,2,34,-14,20,-2,
15,2,2,14,23,-14,4,-2,2,14,
37,-14,28,2,31,-2,14,14,28,2,
17,-2,15,14,29,2,31,2,33,-14,29,-2,
24,-2,10,14,25,-2,22,2);
   }
}
// End -->
</SCRIPT>
        <style type="text/css">
        .newStyle1 {
            font-family: "Matura MT Script Capitals";
            text-decoration: blink;
            font-size: 75px;
            font-weight: lighter;
            font-style: normal;
            color: #FAD68C;
        }
        h1, h2, h3 {
	margin: 0;
	padding: 0;
	font-weight: normal;
	color: #FF3000;
}

h1 {
	font-size: 2em;
}

h2 {
	font-size: 2.8em;
}

h3 {
	font-size: 1.6em;
}

p, ul, ol {
	margin-top: 0;
	line-height: 180%;
}

ul, ol {
}

a {
	text-decoration: none;
	color:#241F1B;
    font-size: 20px;
}

a:hover {
}
</style>
    </head>
    <body style="margin: 0;
	padding: 0;
	background: #776D54 url(images/img01.jpg) repeat;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #566761;">
        <table  width="1300"  bgcolor="#241F1B" >
            <tr height="120 px" >
            <td width="500" align="center"><h1><span class="newStyle1">hotspot</span></h1><br>
                <p style="margin: 0;
	padding: 0px 0 0 2px;
	font-style:italic;
	color: #999966;
    font-variant: normal;
    font-weight: normal;
    font-size: large;
    line-height: normal;
    font-family: Georgia;"> way to easy access ......</p><td>
        <td width="500"></td>
        <td width="1500" align="right">
            <a href="Logout" style="color: #999966;">Logout</a>
            </tr>
            </table>
            <table border="0" bgcolor="#AB0D06" fontfamily="font-family: Arial, Helvetica, sans-serif;" width="1300" align="center">
            <tr >
                <td align="center"><a href="index.jsp" >Home</a></td>
                    <td align="center"><a href="shopping.jsp" align="center">Shopping</a><td>
					<td align="center"><a href="mailing.jsp" align="center">Mailing</a></td>
					<td align="center"><a href="gaming.jsp" align="center">Gaming</a></td>
					<td align="center"><a href="feedback.jsp" align="center">Feedback</a></td>
<td align="center"><a href="profile.jsp" align="center">Profile</a></td>
            </tr>
        </table>
        <table width="1300">
            <tr>
                <td>
                    <div id="sidebar">
                    <ul>
						<li>
							<h2><br>Top Searches<br> </h2>
							<ul>
								<li><a href="gaming.jsp">Gaming</a></li>
								<li><a href="mailing.jsp">Mailing</a></li>
                                <li><a href="shopping.jsp">shopping</a></li>
							</ul>
						</li>

						<li><h2>Shopping</h2>
                            <h3 align="right"><a href="men.jsp">MEN WEAR</a></h3>
							<ul>
								<li><a href="men2.jsp">casual wear</a></li>
								<li><a href="men3.jsp">formal wear</a></li>
								<li><a href="men4.jsp">footwear</a></li>
								<li><a href="men5.jsp">accessories</a></li>
							</ul>
						</li>
                       <li>  <h3 align="right"><a href="electronics.jsp">ELECTRONICS</a></h3><ul>
                            <li><a href="electronics.jsp">computer and asseccories</a></li>
                            <li><a href="electronics.jsp">kitchen ware</a></li>
                            <li><a href="electronics.jsp">washing machine</a></li>
                        </ul></li>
						<li>
                            <h3 align="right"><a href="women.jsp">WOMEN WEAR</a></h3>
							<ul>
                                <li><a href="women2.jsp">jeans and skirt</a></li>
								<li><a href="women2.jsp">tops</a></li>
                                <li><a href="women3.jsp">ethinic wear</a></li>
								<li><a href="women4.jsp">footwear</a></li>
								<li><a href="women5.jsp">accessories</a></li>

							</ul>
						</li>
                        <li>
                            <h3 align="right"><a href="book.jsp">BOOKS</a></h3>
                            <ul>

                                 <li>   <a href="book.jsp">drama</a></li>
                                   <li><a href="book.jsp">romantic</a></li>

                                    <li><a href="book.jsp">fiction</a></li>


                            </ul>
					</ul>
				</div>
                <div style="clear: both;">
                    <br />
                    <br />
                </div>
                </td>
                <td bgcolor="#ffffff" width="1000">

<BODY onLoad="window.newGame()">

<!-- STEP THREE: Put the last coding in the BODY of your HTML document  -->
<CENTER>
<SCRIPT LANGUAGE="JavaScript">
<!-- Begin
document.write(
"<center>\n"+
"<table width=\"600\" height=\"600\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"+
"<tr><td valign=\"middle\" align=\"center\">\n"+
"<table bgcolor=\"#ffffff\" border=\"0\">\n"+
"<tr><td align=\"center\">\n"+
"<h2 align=\"center\"><font face=\"Verdana, Arial, Helvetica\" color=\"#000080\">\n"+
"Chinese Checkers!\n"+
"</h2></font>\n"+
"<p>\n"+
"<table width=\"400\" height=\"400\" border=\"1\" bgcolor=\"#007777\" cellpadding=\"15\" cellspacing=\"0\">\n"+
"<tr><td align=\"center\">");
if (navigator.appName != "Microsoft Internet Explorer") {
document.write(
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img0\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img1\">\n"+
"<a href=\"#\" onClick=\"window.move(2);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img2\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(3);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img3\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(4);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img4\"></A>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img5\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img6\"><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img7\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img8\">\n"+
"<a href=\"#\" onClick=\"window.move(9);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img9\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(10);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img10\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(11);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img11\"></A>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img12\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img13\"><BR>\n"+
"<a href=\"#\" onClick=\"window.move(14);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img14\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(15);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img15\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(16);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img16\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(17);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img17\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(18);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img18\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(19);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img19\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(20);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img20\"></A><BR>\n"+
"<a href=\"#\" onClick=\"window.move(21);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img21\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(22);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img22\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(23);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img23\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(24);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"empty.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img24\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(25);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img25\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(26);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img26\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(27);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img27\"></A><BR>\n"+
"<a href=\"#\" onClick=\"window.move(28);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img28\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(29);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img29\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(30);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img30\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(31);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img31\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(32);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img32\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(33);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img33\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(34);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img34\"></A><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img35\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img36\">\n"+
"<a href=\"#\" onClick=\"window.move(37);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img37\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(38);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img38\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(39);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img39\"></A>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img40\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img41\"><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img42\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img43\">\n"+
"<a href=\"#\" onClick=\"window.move(44);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img44\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(45);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img45\"></A>\n"+
"<a href=\"#\" onClick=\"window.move(46);return false\" onMouseOver=\"window.status='';\n"+
"return true\"><img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img46\"></A>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img47\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img48\"><BR>")
}
else {
document.write(
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img0\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img1\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img2\" \n"+
"onClick=\"window.move(2);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img3\" \n"+
"onClick=\"window.move(3);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img4\" \n"+
"onClick=\"window.move(4);return false\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img5\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img6\"><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img7\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img8\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img9\" \n"+
"onClick=\"window.move(9);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img10\" \n"+
"onClick=\"window.move(10);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img11\" \n"+
"onClick=\"window.move(11);return false\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img12\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img13\"><BR>\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img14\" \n"+
"onClick=\"window.move(14);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img15\" \n"+
"onClick=\"window.move(15);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img16\" \n"+
"onClick=\"window.move(16);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img17\" \n"+
"onClick=\"window.move(17);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img18\" \n"+
"onClick=\"window.move(18);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img29\" \n"+
"onClick=\"window.move(19);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img20\" \n"+
"onClick=\"window.move(20);return false\"><BR>\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img21\" \n"+
"onClick=\"window.move(21);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img22\" \n"+
"onClick=\"window.move(22);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img23\" \n"+
"onClick=\"window.move(23);return false\">\n"+
"<img src=\"empty.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img24\" \n"+
"onClick=\"window.move(24);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img25\" \n"+
"onClick=\"window.move(25);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img26\" \n"+
"onClick=\"window.move(26);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img27\" \n"+
"onClick=\"window.move(27);return false\"><BR>\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img28\" \n"+
"onClick=\"window.move(28);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img29\" \n"+
"onClick=\"window.move(29);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img30\" \n"+
"onClick=\"window.move(30);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img31\" \n"+
"onClick=\"window.move(31);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img32\" \n"+
"onClick=\"window.move(32);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img33\" \n"+
"onClick=\"window.move(33);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img34\" \n"+
"onClick=\"window.move(34);return false\"><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img35\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img36\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img37\" \n"+
"onClick=\"window.move(37);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img38\" \n"+
"onClick=\"window.move(38);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img39\" \n"+
"onClick=\"window.move(39);return false\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img40\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img41\"><BR>\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img42\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img43\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img44\" \n"+
"onClick=\"window.move(44);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img45\" \n"+
"onClick=\"window.move(45);return false\">\n"+
"<img src=\"peg.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img46\" \n"+
"onClick=\"window.move(46);return false\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img47\">\n"+
"<img src=\"blank.gif\" border=\"0\" width=\"29\" height=\"29\" name=\"img48\"><BR>\n");
}
document.write(
"</td></tr>\n"+
"</table>\n"+
"<p>\n"+
"<form name=\"buttonsform\">\n"+
"<input type=\"button\" name=\"new\" value=\"New Game\" onClick=\"window.newGame()\">\n"+
"<input type=\"button\" name=\"solve\" value=\"Solve\" onClick=\"window.solve()\">\n"+
"<select name=\"options\" onChange=\"(window.changeBoard())\">\n"+
"<option value=\"Cross\">Cross\n"+
"<option value=\"Plus\">Plus\n"+
"<option value=\"Fireplace\">Fireplace\n"+
"<option value=\"Up Arrow\">Up Arrow\n"+
"<option value=\"Pyramid\">Pyramid\n"+
"<option value=\"Diamond\">Diamond\n"+
"<option selected value=\"Solitaire\">Solitaire\n"+
"</select>\n"+
"</form>\n"+
"<p>\n"+
"<table width=\"400\" border=\"0\">\n"+
"<tr><td>\n"+
"<font face=\"Verdana, Arial, Helvetica\" SIZE=\"-1\" color=\"#000080\">\n"+
"<P align=\"justify\">\n"+
"Try to clear the board by jumping pegs over other pegs.  \n"+
"The \"jumped\" peg will be removed from the field.\n"+
"If there's more then one move available, just choose\n"+
"which move you would like to do.  You win by getting it down to \n"+
"just one peg (The best solution is with this peg in the center).\n"+
"</font>\n"+
"</td></tr>\n"+
"</table>\n"+
"</td></tr>\n"+
"</table>\n"+
"</td></tr>\n"+
"</table>\n"+
"</center>");
newGame();
// End -->
</SCRIPT>
<NOSCRIPT>
<table width="100 %" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td valign="middle" align="center">
<table border="0" bgcolor="#FFFFBB" cellpadding="15" cellspacing="0">
<tr><td align=center>
<font face="Verdana, Arial, Helvetica" color="#000080" SIZE=-1 /B>
<font SIZE=+2>JavaScript Solitaire!</font>
<p><BR>
You probably disabled JavaScript in your browser's settings or are running a <BR>
JavaScript incompatible browser.<p>
This game needs JavaScript 1.1 to run properly.
</td></tr></table></td></tr></table>
</NOSCRIPT>


</CENTER>
<center>
<form action="gaming.jsp">


<input type="submit" value="back" name="BACK" size="3"   />
</form></center>
<marquee>
    <img src="g/t2.png" width="200" height="200"/>
     <img src="g/s2.png" width="200" height="200"/>
      <img src="g/d2.jpg" width="200" height="200"/>
       <img src="g/c1.jpg" width="200" height="200"/>

</marquee>
                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>
