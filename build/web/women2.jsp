

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
                                <li><a href="women1.jsp">jeans and skirt</a></li>
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

<h2 style="font-family:Showcard Gothic;align:center;font-size:20pt;
        color:red">All Available stuff for women</h2>
        Choose a model to see a picture along with price and
availability information.
<FORM ACTION="DisplayItem">
<h2 style="font-family:Showcard Gothic;align:center;font-size:20pt;
           color:yellow">jeans and skirts</h2>
<table border="0" align="center">
               <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c1"><img src="pic/c1.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c2"><img src="pic/c2.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c3"><img src="pic/c3.jpeg" width="243" height="340" alt="formal"/><BR></td></tr>
               <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c4"><img src="pic/c4.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c5"><img src="pic/c5.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="c6"><img src="pic/c6.jpeg" width="243" height="340" alt="formal"/><BR></td></tr>
               <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d1"><img src="pic/d1.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d2"><img src="pic/d2.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d3"><img src="pic/d3.jpeg" width="243" height="340" alt="formal"/><BR></td></tr>
                <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d4"><img src="pic/d4.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d5"><img src="pic/d5.jpeg" width="243" height="340" alt="formal"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="d6"><img src="pic/d6.jpeg" width="243" height="340" alt="formal"/><BR></td></tr>
</table>



<CENTER>
<INPUT TYPE="SUBMIT" VALUE="Get Details">
</CENTER>

<h2 style="font-family:Showcard Gothic;align:center;font-size:20pt;
           color:yellow">Tops</h2>
           <table border="0" align="center">
    <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t1"><img src="pic/t1.jpeg" width="243" height="340" alt="ass1"/>
        <BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t2"><img src="pic/t2.jpeg" width="243" height="340" alt="accessory"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t3"><img src="pic/t3.jpeg" width="243" height="340" alt="accessory"/><BR></td></tr>
           <tr><td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t4"><img src="pic/t4.jpeg" width="243" height="340" alt="accessory"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t5"><img src="pic/t5.jpeg" width="243" height="340" alt="accessory"/><BR></td>
               <td><INPUT TYPE="RADIO" NAME="itemNum" VALUE="t6"><img src="pic/t6.jpeg" width="243" height="340" alt="accessory"/><BR></td></tr>
              </table>



<CENTER>
<INPUT TYPE="SUBMIT" VALUE="Get Details">
</CENTER>

</FORM>


                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>