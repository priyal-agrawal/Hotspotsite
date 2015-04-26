

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hotspot</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
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
<style>
table#sudoku td	{width: 2.5em; height:2.5em;
		 border-width: 1px;
		 border-style: solid;
		 border-color: black;
		 font-weight: bold;
		 text-align: center
		 }

table#sudoku {
		border-width: 3px;
		border-style: solid;
		border-color: black
		}

table#sudoku td[id=cell_2] {border-right-width: 2px}
table#sudoku td[id=cell_5] {border-right-width: 2px}
table#sudoku td[id=_2] {border-bottom-width: 2px}
table#sudoku td[id=_5] {border-bottom-width: 2px}
td.selected	{background-color: rgb(100%, 70%, 0%)}
td.tofill	{color: blue}
</style>
<script>
var current_cell = null; // the currently selected cell
function initialize() {
	var col, row;
	// Work through all the cells in the table and set
	// onclick event handlers and classNames for the empty
	// ones.
	for (row = 0; row <=8; row++) {
		for (col=0; col <= 8; col++) {
			var cell = document.getElementById('cell_' + col + '_' + row);
			if (!parseInt(cell.innerHTML)) {
				// cell is empty
				cell.onclick = selectCell;
				cell.className = 'tofill';
			}
		}
	}
	document.onkeypress = keyPress;
}

// mouse button event handler
function selectCell() {
	if (current_cell !== null) {
		current_cell.className = 'tofill';
	}
	current_cell = this;
	current_cell.className = 'selected';
}

// Capture keyboard key presses. If the key pressed is a digit
// then add it to the current cell. If it is a space then empty
// the current cell.
function keyPress(evt) {
	if (current_cell == null)
		return;
	var key;
    showErrors();
	if (evt)
		// firefox or chrome
		key = String.fromCharCode(evt.charCode);

	else
		// IE
		key = String.fromCharCode(event.keyCode);

	if (key == ' ')
		current_cell.innerHTML = '';

	else if (key >= 1 && key <= 9) {
        current_cell.innerHTML = key;
        errorCheck();
        //else
        //current_cell.innerHTML = key;
	}

function errorCheck()
{
if (cell_2_0 == cell_3_0)
    	{	cell_4_0.innerHTML = '8';
    current_cell.innerHTML = '';}
else{}
    		return null;

}


}
</script>
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

<body onload="initialize()">
<h2 align=center>Sudoku</h2>
<table align=center id="sudoku" cellspacing=0>
<tr>
<td id="cell_0_0">2</td>
<td id="cell_1_0"></td>
<td id="cell_2_0"></td>
<td id="cell_3_0"></td>
<td id="cell_4_0"></td>
<td id="cell_5_0">7</td>
<td id="cell_6_0"></td>
<td id="cell_7_0"></td>
<td id="cell_8_0"></td>
<tr>
<td id="cell_0_1"></td>
<td id="cell_1_1">5</td>
<td id="cell_2_1"></td>
<td id="cell_3_1"></td>
<td id="cell_4_1">2</td>
<td id="cell_5_1"></td>
<td id="cell_6_1"></td>
<td id="cell_7_1">1</td>
<td id="cell_8_1"></td>
<tr>
<td id="cell_0_2"></td>
<td id="cell_1_2">3</td>
<td id="cell_2_2"></td>
<td id="cell_3_2"></td>
<td id="cell_4_2">8</td>
<td id="cell_5_2"></td>
<td id="cell_6_2"></td>
<td id="cell_7_2">7</td>
<td id="cell_8_2"></td>
<tr>
<td id="cell_0_3"></td>
<td id="cell_1_3"></td>
<td id="cell_2_3">5</td>
<td id="cell_3_3">7</td>
<td id="cell_4_3"></td>
<td id="cell_5_3"></td>
<td id="cell_6_3"></td>
<td id="cell_7_3"></td>
<td id="cell_8_3">2</td>
<tr>
<td id="cell_0_4">1</td>
<td id="cell_1_4"></td>
<td id="cell_2_4"></td>
<td id="cell_3_4"></td>
<td id="cell_4_4"></td>
<td id="cell_5_4"></td>
<td id="cell_6_4"></td>
<td id="cell_7_4"></td>
<td id="cell_8_4">3</td>
<tr>
<td id="cell_0_5">9</td>
<td id="cell_1_5"></td>
<td id="cell_2_5"></td>
<td id="cell_3_5"></td>
<td id="cell_4_5"></td>
<td id="cell_5_5">6</td>
<td id="cell_6_5">1</td>
<td id="cell_7_5"></td>
<td id="cell_8_5"></td>
<tr>
<td id="cell_0_6"></td>
<td id="cell_1_6">2</td>
<td id="cell_2_6"></td>
<td id="cell_3_6"></td>
<td id="cell_4_6">7</td>
<td id="cell_5_6"></td>
<td id="cell_6_6"></td>
<td id="cell_7_6">8</td>
<td id="cell_8_6"></td>
<tr>
<td id="cell_0_7"></td>
<td id="cell_1_7">8</td>
<td id="cell_2_7"></td>
<td id="cell_3_7"></td>
<td id="cell_4_7">9</td>
<td id="cell_5_7"></td>
<td id="cell_6_7"></td>
<td id="cell_7_7">5</td>
<td id="cell_8_7"></td>
<tr>
<td id="cell_0_8"></td>
<td id="cell_1_8"></td>
<td id="cell_2_8"></td>
<td id="cell_3_8">4</td>
<td id="cell_4_8"></td>
<td id="cell_5_8"></td>
<td id="cell_6_8"></td>
<td id="cell_7_8"></td>
<td id="cell_8_8">6</td>
</table>
</body>


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
