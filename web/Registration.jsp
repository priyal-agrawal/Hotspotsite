

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
h4 {color:black;font:700 11pt verdana}

.rc{ border-style: solid; font-size: 25px;
}

.style{background-color: #ffffff; font-size: 30px;font-family: verdana;
}
</style>
<script>
    function changeImage()
{
	var im=document.getElementById("img1");
	im.src="pic/registration.jpg";
}
function rollimage ()
{
	var im=document.getElementById("img1");
	im.src="pic/keyboard-register.jpg";
	}
</script>
<script language="javascript">
function docheck()
{
  var u=document.getElementById("a");
  var p=document.getElementById("b");
  var c=document.getElementById("c");
  var n=document.getElementById("name");
  var a=document.getElementById("e");
  var pi=document.getElementById("pincode");
  var ph=document.getElementById("f");
  var e=document.getElementById("d");
  var v=document.getElementById("village");
  var t=document.getElementById("taluk");
  var d=document.getElementById("district");
  var s=document.getElementById("state");

  if(u.value == "")
  {
    alert ("enter the username");
	u.focus();
	return false;
	}

    if(p.value == "")
  {
    alert ("enter the password");
	p.focus();
	return false;
	}

	else if((p.value.length)<6)
	{
	 alert("password should contain atleast 6 characters ");
	 p.focus();
 return false;
	 }

  if(c.value == "")
  {
    alert ("enter the confirm password");
	c.focus();
	return false;
	}

		   if((c.value)!=(p.value))
		   {
		   alert("Re-enter the password");
		   c.focus();
		   return false;
	}





  if(n.value == "")
  {
    alert ("enter the name");
    n.focus();
	return false;
	}
	  if(a.value == "")
  {
    alert ("enter the address");
	a.focus();
	return false;
	}

  if(pi.value == "")
  {
    alert ("enter the pincode");
	pi.focus();
	return false;
	}

	 else if(!parseInt(pi.value))
		{
                    alert("Enter Integer");
		    return false;
		}
              else if(((pi.value.length)>6))
	        {
	               alert("Pin no: should contain 6 integers ");
	               pi.focus();
	               return false;
                 }

  if(ph.value == "")
  {
    alert ("enter the phone number");

	ph.focus();
	return false;
	}
   else if(!parseInt(ph.value))
		{
                    alert("Enter valid Phone number ");
		    return false;
		}
            else if(((ph.value.length)<6) || ((ph.value.length)>11))
	                     {
	               alert("Phone no should contain atleast 6 integers ");

	               ph.focus();
                        return false;
	                  }

    if(e.value == "")
  {
    alert ("enter the email");
	e.focus();
	return false;
	}

	 else if(e.value.indexOf('@')==-1)
		      {
		       alert("Use @ email correctly");
		       e.focus();
		       return false;
		      }

	  else if(e.value.indexOf('.')==-1)
		       {
		        alert("Use . email correctly");
		        e.focus();
		        return false;
		       }


    if(v.value == "")
  {
    alert ("enter the village");
	v.focus();
	return false;
	}
	  if(t.value == "")
  {
    alert ("enter the taluk");
	t.focus();
	return false;
	}
  if(d.value == "")
  {
    alert ("enter the district");
	d.focus();
	return false;
	}


    if(s.value == "")
  {
    alert ("enter the state");
	s.focus();
	return false;
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
                            <h3 align="right"><a href="login.jsp">MEN WEAR</a></h3>
							<ul>
								<li><a href="login.jsp">casual wear</a></li>
								<li><a href="login.jsp">formal wear</a></li>
								<li><a href="login.jsp">footwear</a></li>
								<li><a href="login.jsp">accessories</a></li>
							</ul>
						</li>
                       <li>  <h3 align="right"><a href="login.jsp">ELECTRONICS</a></h3><ul>
                            <li><a href="login.jsp">computer and asseccories</a></li>
                            <li><a href="login.jsp">kitchen ware</a></li>
                            <li><a href="login.jsp">washing machine</a></li>
                        </ul></li>
						<li>
                            <h3 align="right"><a href="login.jsp">WOMEN WEAR</a></h3>
							<ul>
                                <li><a href="login.jsp">jeans and skirt</a></li>
								<li><a href="login.jsp">tops</a></li>
                                <li><a href="login.jsp">ethinic wear</a></li>
								<li><a href="login.jsp">footwear</a></li>
								<li><a href="login.jsp">accessories</a></li>

							</ul>
						</li>
                        <li>
                            <h3 align="right"><a href="login.jsp">BOOKS</a></h3>
                            <ul>

                                 <li>   <a href="login.jsp">drama</a></li>
                                   <li><a href="login.jsp">romantic</a></li>

                                    <li><a href="login.jsp">fiction</a></li>


                            </ul>
					</ul>
				</div>
                <div style="clear: both;">
                    <br />
                    <br />
                </div>
                </td>
                <td bgcolor="#ffffff" width="1000">



<h2>Register here</h2>

<div style="float: right;margin-left: 50px;margin-right: 600px; margin-top: 10px;">

</div>

<form action="/Hotspotsite/Registration1" method="post">
<div style="float: left;margin-left: 10px; clear: both;">
<table bgcolor="#fffff" >
<tr>
<td class="style">
User Id
<td>
<input type=text name="txtid"size=20 class="rc" id="a">*
</tr>
<tr>
<td class="style">
Password
<td>
<input type=password name="txtpass" size=20 class="rc" id="b">*
</tr>
<tr>
<td class="style">
Confirm Password
<td>
<input type=password name="txtpass2" size=20 class="rc" id="c">*
</tr>

<tr>
<td class="style">
Email Address
<td>
<input type=text name="txtarea" size=30 class="rc" id="d">*
</tr>

<tr>
<td class="style">Mailing Address
<td>
<textarea name="txtaddress" rows=3 cols=30 class="rc" id="e"></textarea>*
</td>
</tr>


<tr>
<td class="style">
Phone Number
<td>
<input type=number  name="txtphone"  size=30 class="rc" id="f">
</tr>

</table>
<p>
<br>
<input type=submit value="Register"  style="color:#FAD68C; background-color: #776D54  ;" class="style" onclick="return docheck()" >
<input type=reset value="Clear All"  style="color:#FAD68C;background-color:  #776D54;" class="style">
<p>
<a href="index.jsp" class="h4">Go Back</a>

 </div>
 <div style="float: right;margin-right: 10px;">
 <img src="pic/keyboard-register.jpg" height="500px" width="400px"  id="img1" onmouseover="changeImage()" onmouseout="rollimage()">
 </div>
 </form>


                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>
