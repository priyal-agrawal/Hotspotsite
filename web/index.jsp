

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOTSPOT</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />\
        <script type="text/javascript">

var arr = [];

arr[0]= new Image();
arr[0].src = "pic/f11.jpg";

arr[1]= new Image();
arr[1].src = "pic/men1.jpg";

arr[2]= new Image();
arr[2].src = "g/g1.jpg";

var i=0;

function slide(){
 document.getElementById("image1").src= arr[i].src;
 i++;
 if(i==arr.length){
  i=0;
 }
 setTimeout(function(){ slide(); },2000);
}

</script>
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
            <a href="Login.jsp" style="color: #999966;">Login|</a>|<a href="Registration.jsp" style="color: #999966;">Register</a>
            </tr>
            </table>
            <table border="0" bgcolor="#AB0D06" fontfamily="font-family: Arial, Helvetica, sans-serif;" width="1300" align="center">
            <tr >
                <td align="center"><a href="index.html" >Home</a></td>
                    <td align="center"><a href="Login.jsp" align="center">Shopping</a><td>
					<td align="center"><a href="Login.jsp" align="center">Mailing</a></td>
					<td align="center"><a href="Login.jsp" align="center">Gaming</a></td>
					<td align="center"><a href="Login.jsp" align="center">Feedback</a></td>
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
								<li><a href="Login.jsp">Gaming</a></li>
								<li><a href="Login.jsp">Mailing</a></li>
                                <li><a href="Login.jsp">shopping</a></li>
							</ul>
						</li>

						<li><h2>Shopping</h2>
                            <h3 align="right"><a href="Login.jsp">MEN WEAR</a></h3>
							<ul>
								<li><a href="Login.jsp">casual wear</a></li>
								<li><a href="Login.jsp">formal wear</a></li>
								<li><a href="Login.jsp">footwear</a></li>
								<li><a href="Login.jsp">accessories</a></li>
							</ul>
						</li>
                       <li>  <h3 align="right"><a href="Login.jsp">ELECTRONICS</a></h3><ul>
                            <li><a href="Login.jsp">computer and asseccories</a></li>
                            <li><a href="Login.jsp">kitchen ware</a></li>
                            <li><a href="Login.jsp">washing machine</a></li>
                        </ul></li>
						<li>
                            <h3 align="right"><a href="Login.jsp">WOMEN WEAR</a></h3>
							<ul>
                                <li><a href="Login.jsp">jeans and skirt</a></li>
								<li><a href="Login.jsp">tops</a></li>
                                <li><a href="Login.jsp">ethinic wear</a></li>
								<li><a href="Login.jsp">footwear</a></li>
								<li><a href="Login.jsp">accessories</a></li>

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
                <td bgcolor="#ffffffff" width="950">

                 <body onLoad="slide('image1',arr);">
                 <div id="img"><img id="image1" height="500px" width="950px" border="0"  /></div>
                 </body>
                 <table width="950"><tr>
                     <td>
<b><h1 style="font-family:Showcard Gothic;align:center;font-size:22pt;color:orange; width:408px;"> A multipurpose website where you have every thing at one place<br>
    YOU CAN SHOP...PLAY GAMES...MAIL YOUR FRIEND</h1></b>
    <b><h1 style="font-family:Showcard Gothic;align:center;font-size:22pt;color:red; width:408px;">WELCOME<br>
        Lets get ready to start</h1></b>
                     </td>
                     <td>
                         <a href="Login.jsp"><img src="pic/login1.png" width="500" height="300" alt="login page"/>
                         </a>
                     </td></tr>    </table>
<marquee repeat gap="0" width="950">
    <img src="pic/i1.png" width="300" height="300"/>
    <img src="pic/i2.png" width="300" height="300"/>
    <img src="pic/i3.png" width="300" height="300"/>
    <img src="pic/i4.jpg" width="300" height="300"/>
    <img src="pic/i5.png" width="300" height="300"/>
</marquee>


                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>
