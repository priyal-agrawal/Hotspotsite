package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>hotspot</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        .newStyle1 {\n");
      out.write("            font-family: \"Matura MT Script Capitals\";\n");
      out.write("            text-decoration: blink;\n");
      out.write("            font-size: 75px;\n");
      out.write("            font-weight: lighter;\n");
      out.write("            font-style: normal;\n");
      out.write("            color: #FAD68C;\n");
      out.write("        }\n");
      out.write("        h1, h2, h3 {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\tcolor: #FF3000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("\tfont-size: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("\tfont-size: 2.8em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h3 {\n");
      out.write("\tfont-size: 1.6em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p, ul, ol {\n");
      out.write("\tmargin-top: 0;\n");
      out.write("\tline-height: 180%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul, ol {\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor:#241F1B;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("}\n");
      out.write("h4 {color:black;font:700 11pt verdana}\n");
      out.write("\n");
      out.write(".rc{ border-style: solid; font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".style{background-color: #ffffff; font-size: 30px;font-family: verdana;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    function changeImage()\n");
      out.write("{\n");
      out.write("\tvar im=document.getElementById(\"img1\");\n");
      out.write("\tim.src=\"pic/registration.jpg\";\n");
      out.write("}\n");
      out.write("function rollimage ()\n");
      out.write("{\n");
      out.write("\tvar im=document.getElementById(\"img1\");\n");
      out.write("\tim.src=\"pic/keyboard-register.jpg\";\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("function docheck()\n");
      out.write("{\n");
      out.write("  var u=document.getElementById(\"a\");\n");
      out.write("  var p=document.getElementById(\"b\");\n");
      out.write("  var c=document.getElementById(\"c\");\n");
      out.write("  var n=document.getElementById(\"name\");\n");
      out.write("  var a=document.getElementById(\"e\");\n");
      out.write("  var pi=document.getElementById(\"pincode\");\n");
      out.write("  var ph=document.getElementById(\"f\");\n");
      out.write("  var e=document.getElementById(\"d\");\n");
      out.write("  var v=document.getElementById(\"village\");\n");
      out.write("  var t=document.getElementById(\"taluk\");\n");
      out.write("  var d=document.getElementById(\"district\");\n");
      out.write("  var s=document.getElementById(\"state\");\n");
      out.write("\n");
      out.write("  if(u.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the username\");\n");
      out.write("\tu.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    if(p.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the password\");\n");
      out.write("\tp.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\telse if((p.value.length)<6)\n");
      out.write("\t{\n");
      out.write("\t alert(\"password should contain atleast 6 characters \");\n");
      out.write("\t p.focus();\n");
      out.write(" return false;\n");
      out.write("\t }\n");
      out.write("\n");
      out.write("  if(c.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the confirm password\");\n");
      out.write("\tc.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\t   if((c.value)!=(p.value))\n");
      out.write("\t\t   {\n");
      out.write("\t\t   alert(\"Re-enter the password\");\n");
      out.write("\t\t   c.focus();\n");
      out.write("\t\t   return false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  if(n.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the name\");\n");
      out.write("    n.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\t  if(a.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the address\");\n");
      out.write("\ta.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("  if(pi.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the pincode\");\n");
      out.write("\tpi.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t else if(!parseInt(pi.value))\n");
      out.write("\t\t{\n");
      out.write("                    alert(\"Enter Integer\");\n");
      out.write("\t\t    return false;\n");
      out.write("\t\t}\n");
      out.write("              else if(((pi.value.length)>6))\n");
      out.write("\t        {\n");
      out.write("\t               alert(\"Pin no: should contain 6 integers \");\n");
      out.write("\t               pi.focus();\n");
      out.write("\t               return false;\n");
      out.write("                 }\n");
      out.write("\n");
      out.write("  if(ph.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the phone number\");\n");
      out.write("\n");
      out.write("\tph.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("   else if(!parseInt(ph.value))\n");
      out.write("\t\t{\n");
      out.write("                    alert(\"Enter valid Phone number \");\n");
      out.write("\t\t    return false;\n");
      out.write("\t\t}\n");
      out.write("            else if(((ph.value.length)<6) || ((ph.value.length)>11))\n");
      out.write("\t                     {\n");
      out.write("\t               alert(\"Phone no should contain atleast 6 integers \");\n");
      out.write("\n");
      out.write("\t               ph.focus();\n");
      out.write("                        return false;\n");
      out.write("\t                  }\n");
      out.write("\n");
      out.write("    if(e.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the email\");\n");
      out.write("\te.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t else if(e.value.indexOf('@')==-1)\n");
      out.write("\t\t      {\n");
      out.write("\t\t       alert(\"Use @ email correctly\");\n");
      out.write("\t\t       e.focus();\n");
      out.write("\t\t       return false;\n");
      out.write("\t\t      }\n");
      out.write("\n");
      out.write("\t  else if(e.value.indexOf('.')==-1)\n");
      out.write("\t\t       {\n");
      out.write("\t\t        alert(\"Use . email correctly\");\n");
      out.write("\t\t        e.focus();\n");
      out.write("\t\t        return false;\n");
      out.write("\t\t       }\n");
      out.write("\n");
      out.write("\n");
      out.write("    if(v.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the village\");\n");
      out.write("\tv.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\t  if(t.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the taluk\");\n");
      out.write("\tt.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("  if(d.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the district\");\n");
      out.write("\td.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("    if(s.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the state\");\n");
      out.write("\ts.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground: #776D54 url(images/img01.jpg) repeat;\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: #566761;\">\n");
      out.write("        <table  width=\"1300\"  bgcolor=\"#241F1B\" >\n");
      out.write("            <tr height=\"120 px\" >\n");
      out.write("            <td width=\"500\" align=\"center\"><h1><span class=\"newStyle1\">hotspot</span></h1><br>\n");
      out.write("                <p style=\"margin: 0;\n");
      out.write("\tpadding: 0px 0 0 2px;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tcolor: #999966;\n");
      out.write("    font-variant: normal;\n");
      out.write("    font-weight: normal;\n");
      out.write("    font-size: large;\n");
      out.write("    line-height: normal;\n");
      out.write("    font-family: Georgia;\"> way to easy access ......</p><td>\n");
      out.write("        <td width=\"500\"></td>\n");
      out.write("        <td width=\"1500\" align=\"right\">\n");
      out.write("            <a href=\"Login.jsp\" style=\"color: #999966;\">Login|</a>|<a href=\"Registration.jsp\" style=\"color: #999966;\">Register</a>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"0\" bgcolor=\"#AB0D06\" fontfamily=\"font-family: Arial, Helvetica, sans-serif;\" width=\"1300\" align=\"center\">\n");
      out.write("            <tr >\n");
      out.write("                <td align=\"center\"><a href=\"index.jsp\" >Home</a></td>\n");
      out.write("                    <td align=\"center\"><a href=\"Login.jsp\" align=\"center\">Shopping</a><td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"Login.jsp\" align=\"center\">Mailing</a></td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"Login.jsp\" align=\"center\">Gaming</a></td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"Login.jsp\" align=\"center\">Feedback</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"1300\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"sidebar\">\n");
      out.write("                    <ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<h2><br>Top Searches<br> </h2>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">Gaming</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">Mailing</a></li>\n");
      out.write("                                <li><a href=\"Login.jsp\">shopping</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><h2>Shopping</h2>\n");
      out.write("                            <h3 align=\"right\"><a href=\"login.jsp\">MEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">casual wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">formal wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                       <li>  <h3 align=\"right\"><a href=\"login.jsp\">ELECTRONICS</a></h3><ul>\n");
      out.write("                            <li><a href=\"login.jsp\">computer and asseccories</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">kitchen ware</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">washing machine</a></li>\n");
      out.write("                        </ul></li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"login.jsp\">WOMEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("                                <li><a href=\"login.jsp\">jeans and skirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">tops</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\">ethinic wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">accessories</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                        <li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"login.jsp\">BOOKS</a></h3>\n");
      out.write("                            <ul>\n");
      out.write("\n");
      out.write("                                 <li>   <a href=\"login.jsp\">drama</a></li>\n");
      out.write("                                   <li><a href=\"login.jsp\">romantic</a></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"login.jsp\">fiction</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <div style=\"clear: both;\">\n");
      out.write("                    <br />\n");
      out.write("                    <br />\n");
      out.write("                </div>\n");
      out.write("                </td>\n");
      out.write("                <td bgcolor=\"#ffffff\" width=\"1000\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2>Register here</h2>\n");
      out.write("\n");
      out.write("<div style=\"float: right;margin-left: 50px;margin-right: 600px; margin-top: 10px;\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form action=\"/Hotspotsite/Registration1\" method=\"post\">\n");
      out.write("<div style=\"float: left;margin-left: 10px; clear: both;\">\n");
      out.write("<table bgcolor=\"#fffff\" >\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">\n");
      out.write("User Id\n");
      out.write("<td>\n");
      out.write("<input type=text name=\"txtid\"size=20 class=\"rc\" id=\"a\">*\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">\n");
      out.write("Password\n");
      out.write("<td>\n");
      out.write("<input type=password name=\"txtpass\" size=20 class=\"rc\" id=\"b\">*\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">\n");
      out.write("Confirm Password\n");
      out.write("<td>\n");
      out.write("<input type=password name=\"txtpass2\" size=20 class=\"rc\" id=\"c\">*\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">\n");
      out.write("Email Address\n");
      out.write("<td>\n");
      out.write("<input type=text name=\"txtarea\" size=30 class=\"rc\" id=\"d\">*\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">Mailing Address\n");
      out.write("<td>\n");
      out.write("<textarea name=\"txtaddress\" rows=3 cols=30 class=\"rc\" id=\"e\"></textarea>*\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"style\">\n");
      out.write("Phone Number\n");
      out.write("<td>\n");
      out.write("<input type=number  name=\"txtphone\"  size=30 class=\"rc\" id=\"f\">\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<p>\n");
      out.write("<br>\n");
      out.write("<input type=submit value=\"Register\"  style=\"color:#FAD68C; background-color: #776D54  ;\" class=\"style\" onclick=\"return docheck()\" >\n");
      out.write("<input type=reset value=\"Clear All\"  style=\"color:#FAD68C;background-color:  #776D54;\" class=\"style\">\n");
      out.write("<p>\n");
      out.write("<a href=\"index.jsp\" class=\"h4\">Go Back</a>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write(" <div style=\"float: right;margin-right: 10px;\">\n");
      out.write(" <img src=\"pic/keyboard-register.jpg\" height=\"500px\" width=\"400px\"  id=\"img1\" onmouseover=\"changeImage()\" onmouseout=\"rollimage()\">\n");
      out.write(" </div>\n");
      out.write(" </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("\t<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
