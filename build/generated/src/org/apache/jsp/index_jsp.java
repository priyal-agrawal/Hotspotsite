package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HOTSPOT</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\\\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var arr = [];\n");
      out.write("\n");
      out.write("arr[0]= new Image();\n");
      out.write("arr[0].src = \"pic/f11.jpg\";\n");
      out.write("\n");
      out.write("arr[1]= new Image();\n");
      out.write("arr[1].src = \"pic/men1.jpg\";\n");
      out.write("\n");
      out.write("arr[2]= new Image();\n");
      out.write("arr[2].src = \"g/g1.jpg\";\n");
      out.write("\n");
      out.write("var i=0;\n");
      out.write("\n");
      out.write("function slide(){\n");
      out.write(" document.getElementById(\"image1\").src= arr[i].src;\n");
      out.write(" i++;\n");
      out.write(" if(i==arr.length){\n");
      out.write("  i=0;\n");
      out.write(" }\n");
      out.write(" setTimeout(function(){ slide(); },2000);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
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
      out.write("                <td align=\"center\"><a href=\"index.html\" >Home</a></td>\n");
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
      out.write("                            <h3 align=\"right\"><a href=\"men.jsp\">MEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men1.jsp\">casual wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men1.jsp\">formal wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men1.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men1.jsp\">accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                       <li>  <h3 align=\"right\"><a href=\"electronics.jsp\">ELECTRONICS</a></h3><ul>\n");
      out.write("                            <li><a href=\"electronics.jsp\">computer and asseccories</a></li>\n");
      out.write("                            <li><a href=\"electronics.jsp\">kitchen ware</a></li>\n");
      out.write("                            <li><a href=\"electronics.jsp\">washing machine</a></li>\n");
      out.write("                        </ul></li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"women.jsp\">WOMEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("                                <li><a href=\"women1.jsp\">jeans and skirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women1.jsp\">tops</a></li>\n");
      out.write("                                <li><a href=\"women1.jsp\">ethinic wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women1.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women1.jsp\">accessories</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                        <li>\n");
      out.write("                            <h3 align=\"right\"><a href=\"book.jsp\">BOOKS</a></h3>\n");
      out.write("                            <ul>\n");
      out.write("\n");
      out.write("                                 <li>   <a href=\"book.jsp\">drama</a></li>\n");
      out.write("                                   <li><a href=\"book.jsp\">romantic</a></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"book.jsp\">fiction</a></li>\n");
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
      out.write("                 <body onLoad=\"slide('image1',arr);\">\n");
      out.write("                 <div id=\"img\"><img id=\"image1\" height=\"500px\" width=\"1000px\" border=\"5\"  /></div>\n");
      out.write("                 </body>\n");
      out.write("\n");
      out.write("<marquee>\n");
      out.write("    <img src=\"pic/i1.png\" width=\"300\" height=\"300\"/>\n");
      out.write("    <img src=\"pic/i2.png\" width=\"300\" height=\"300\"/>\n");
      out.write("    <img src=\"pic/i3.png\" width=\"300\" height=\"300\"/>\n");
      out.write("    <img src=\"pic/i4.jpg\" width=\"300\" height=\"300\"/>\n");
      out.write("    <img src=\"pic/i5.png\" width=\"300\" height=\"300\"/>\n");
      out.write("</marquee>\n");
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
