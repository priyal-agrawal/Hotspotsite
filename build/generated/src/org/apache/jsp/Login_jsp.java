package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("function chkMain()\n");
      out.write("{\n");
      out.write("\tvar ui=document.getElementById(\"txtuserid\").value;\n");
      out.write("var upass=document.getElementById(\"txtuserpass\").value;\n");
      out.write("if(checkEmpty(ui)==false)\n");
      out.write("{\n");
      out.write("\n");
      out.write("\tdocument.getElementById(\"msg\").innerHTML=\"<font color='red'>User Id required</font>\";\n");
      out.write("\tdocument.getElementById(\"txtuserid\").focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\tif(checkEmpty(upass)==false)\n");
      out.write("\t\t{\n");
      out.write("\t\tdocument.getElementById(\"msg\").innerHTML=\"<font color='red'>User pass required</font>\";\n");
      out.write("\t\tdocument.getElementById(\"txtuserpass\").focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function changeImage()\n");
      out.write("{\n");
      out.write("\tvar im=document.getElementById(\"img1\");\n");
      out.write("\tim.src=\"pic/login1.png\";\n");
      out.write("}\n");
      out.write("function rollimage ()\n");
      out.write("{\n");
      out.write("\tvar im=document.getElementById(\"img1\");\n");
      out.write("\tim.src=\"pic/Login.png\";\n");
      out.write("\t}\n");
      out.write("function welcome()\n");
      out.write("{\n");
      out.write("alert(\"You are sucessfully Login\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .rc{ border-style: solid; ; font-size: 25px;\n");
      out.write("}\n");
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
      out.write("</style>\n");
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
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">Mailing</a></li>\n");
      out.write("                                <li><a href=\"Login.jsp\">shopping</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><h2>Shopping</h2>\n");
      out.write("                            <h3 align=\"right\"><a href=\"Login.jsp\">MEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">casual wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">formal wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                       <li>  <h3 align=\"right\"><a href=\"Login.jsp\">ELECTRONICS</a></h3><ul>\n");
      out.write("                            <li><a href=\"Login.jsp\">computer and asseccories</a></li>\n");
      out.write("                            <li><a href=\"Login.jsp\">kitchen ware</a></li>\n");
      out.write("                            <li><a href=\"Login.jsp\">washing machine</a></li>\n");
      out.write("                        </ul></li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"Login.jsp\">WOMEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("                                <li><a href=\"Login.jsp\">jeans and skirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">tops</a></li>\n");
      out.write("                                <li><a href=\"Login.jsp\">ethinic wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">accessories</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                        <li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"Login.jsp\">BOOKS</a></h3>\n");
      out.write("                            <ul>\n");
      out.write("\n");
      out.write("                                 <li>   <a href=\"Login.jsp\">drama</a></li>\n");
      out.write("                                   <li><a href=\"Login.jsp\">romantic</a></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"Login.jsp\">fiction</a></li>\n");
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
      out.write("                    <h2>Login Here<br></h2>\n");
      out.write("                       <h3> Before Proceeding Please Log in</h3>\n");
      out.write("\n");
      out.write("\n");
String ms=request.getParameter("msg") ;
      out.write("\n");
      out.write("<hr>\n");
      out.write("<div style=\"float: left; margin-top: 100px;margin-left: 150px;\">\n");
      out.write("\n");
      out.write("<form  action=\"/Hotspotsite/Login\" method=\"post\" onsubmit=\"return chkMain()\">\n");
      out.write("<table>\n");
      out.write("<tr><td style=\"font-style:italic; font-size:medium\">USER ID</td><td><input  type=\"text\" name=\"txtuserid\" id=\"txtuserid\" size=\"20\" maxlength=\"30\" class=\"rc\"></td></tr>\n");
      out.write("<tr><td style=\"font-style:italic; font-size:medium\">USER PASSWORD</td><td><input type=\"password\" id=\"txtuserpass\" name=\"txtuserpass\" class=\"rc\"></td></tr>\n");
      out.write("<tr><td colspan=\"2\" align=\"center\" align=\"center\">\n");
      out.write(" <input type=\"submit\" value=\"Submit\"  align=\"center\" onclick=\"return chkMain()\">\n");
      out.write(" </td></tr>\n");
      out.write("<h3 id=\"msg\"></h3>\n");
      out.write("</table>\n");
      out.write("<a href=\"Registration.jsp\" style=\"font:900 10pt verdana;font-size: 20px;\">I Am New User</a>\n");
      out.write("</form>\n");
      out.write("</div>\n");
 if(ms!=null)
	{
      out.write("\n");
      out.write("\t<div style=\"float: left;margin-left: 100px;height: 200px;width: 500px;\">\n");
      out.write("\t<h3 style=\"color: red;\">");
      out.print(ms);
      out.write("</h3></div>\n");
}
      out.write("\n");
      out.write("<div style=\"float: right;margin-top: 100px;height: 400px;width: 400px;margin-right: 100px;\">\n");
      out.write("<img src=\"pic/login1.png\" height=\"400px\" width=\"400\" id=\"img1\" onmouseover=\"changeImage()\" onmouseout=\"rollimage()\">\n");
      out.write("</div>\n");
      out.write("\n");
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
