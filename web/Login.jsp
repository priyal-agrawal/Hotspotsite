

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script language="javascript">
function chkMain()
{
    var a=document.getElementById("txtuserid");
 var p=document.getElementById("txtuserpass");
	 if(a.value == "")
 	{
 		alert("enter the username");
  		 a.focus();
		   return false;
	   }

	 if(p.value == "")
 	{
 		alert("enter the password");
  		 p.focus();
		   return false;
	   }

	else if((p.value.length)<6 )
	{
	 alert("password should contain atleast 6 characters ");
	 p.focus();
 return false;
	 }


   }
	
function changeImage()
{
	var im=document.getElementById("img1");
	im.src="pic/login1.png";
}
function rollimage ()
{
	var im=document.getElementById("img1");
	im.src="pic/Login.png";
	}
function welcome()
{
alert("You are sucessfully Login");
}

</script>

        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <style type="text/css">
            .rc{ border-style: solid; ; font-size: 25px;
}
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
                <td align="center"><a href="index.jsp" >Home</a></td>
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
                            <h3 align="right"><a href="Login.jsp">BOOKS</a></h3>
                            <ul>

                                 <li>   <a href="Login.jsp">drama</a></li>
                                   <li><a href="Login.jsp">romantic</a></li>

                                    <li><a href="Login.jsp">fiction</a></li>


                            </ul>
					</ul>
				</div>
                <div style="clear: both;">
                    <br />
                    <br />
                </div>
                </td>
                <td bgcolor="#ffffff" width="1000">
                    <h2>Login Here<br></h2>
                       <h3> Before Proceeding Please Log in</h3>


<%String ms=request.getParameter("msg") ;%>
<hr>
<div style="float: left; margin-top: 100px;margin-left: 150px;">

<form  action="/Hotspotsite/Login" method="post" onsubmit="return chkMain()">
<table>
<tr><td style="font-style:italic; font-size:medium">USER ID</td><td><input  type="text" name="txtuserid" id="txtuserid" size="20" maxlength="30" class="rc"></td></tr>
<tr><td style="font-style:italic; font-size:medium">USER PASSWORD</td><td><input type="password" id="txtuserpass" name="txtuserpass" class="rc"></td></tr>
<tr><td colspan="2" align="center" align="center">
 <input type="submit" value="Submit"  align="center" onclick="return chkMain()">
 </td></tr>
<h3 id="msg"></h3>
</table>
<a href="Registration.jsp" style="font:900 10pt verdana;font-size: 20px;">I Am New User</a>
</form>
</div>
<% if(ms!=null)
	{%>
	<div style="float: left;margin-left: 100px;height: 200px;width: 500px;">
	<h3 style="color: red;"><%=ms%></h3></div>
<%}%>
<div style="float: right;margin-top: 100px;height: 400px;width: 400px;margin-right: 100px;">
<img src="pic/login1.png" height="400px" width="400" id="img1" onmouseover="changeImage()" onmouseout="rollimage()">
</div>



                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>
