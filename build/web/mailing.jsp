<%-- 
    Document   : mailing
    Created on : 2 Apr, 2015, 5:14:52 PM
    Author     : pppppppppppppppppppp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mailing</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<style type="text/css">
.inputform{float:left;
width:400px;border:1px ;color:navy;padding:10px;
}
.inputform table tr td input,textarea,select{width:200px;}
#gender1,#gender2{width:10px;}
#submit{margin-left:100px;width:100px;}
#reset{width:100px;}
.design{background-color:red;color:white;padding-left:100px;}

   





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


<!-- header -->
<h2>Mailcasting</h2>
<h3 style="background-color:red;color:red;">c</h3>
<!-- body -->

<div class="inputform">
<h2 class="design">Registration Form</h2>
<form action="RegisterServlet" method="post">
<table>
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"/>@mailer.com</td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td>Gender:</td><td><input id="gender1" type="radio" name="gender" value="male"/>Male
<input type="radio" id="gender2" name="gender" value="female"/>Female
</td></tr>
<tr><td>Date Of Birth:</td><td><input type="date" name="dob"/></td></tr>
<tr><td>AddressLine:</td><td><textarea name="addressLine" rows="5" cols="15"></textarea></td></tr>
<tr><td>City:</td><td><input type="text" name="city"/></td></tr>
<tr><td>State:</td><td><input type="text" name="state"/></td></tr>
<tr><td>Country:</td><td><select name="country">
<option>Select-Country:</option>
<option>India</option>
<option>Pakistan</option>
<option>China</option>
<option>Bhutan</option>
<option>USA</option>
<option>France</option>
<option>Other</option>
</select></td></tr>
<tr><td>Contact:</td><td><input type="text" name="contact"/></td></tr>
<tr><td colspan="2"><input id="submit" type="submit" value="register"/>
<input id="reset" type="reset" value="clear"/>
</td></tr>
</table>
</form>
</div>

<div class="inputform" style="float:right;">
<h2 class="design">Login Form</h2>
<form action="LoginServlet" method="post">
<table>
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td colspan="2"><input id="submit" type="submit" value="login"/>
</td></tr>
</table>
</form>
</div>




                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>

    </body>
</html>
