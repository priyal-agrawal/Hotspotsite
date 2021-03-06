package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sudoku_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("table#sudoku td\t{width: 2.5em; height:2.5em;\n");
      out.write("\t\t border-width: 1px;\n");
      out.write("\t\t border-style: solid;\n");
      out.write("\t\t border-color: black;\n");
      out.write("\t\t font-weight: bold;\n");
      out.write("\t\t text-align: center\n");
      out.write("\t\t }\n");
      out.write("\n");
      out.write("table#sudoku {\n");
      out.write("\t\tborder-width: 3px;\n");
      out.write("\t\tborder-style: solid;\n");
      out.write("\t\tborder-color: black\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("table#sudoku td[id=cell_2] {border-right-width: 2px}\n");
      out.write("table#sudoku td[id=cell_5] {border-right-width: 2px}\n");
      out.write("table#sudoku td[id=_2] {border-bottom-width: 2px}\n");
      out.write("table#sudoku td[id=_5] {border-bottom-width: 2px}\n");
      out.write("td.selected\t{background-color: rgb(100%, 70%, 0%)}\n");
      out.write("td.tofill\t{color: blue}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("var current_cell = null; // the currently selected cell\n");
      out.write("function initialize() {\n");
      out.write("\tvar col, row;\n");
      out.write("\t// Work through all the cells in the table and set\n");
      out.write("\t// onclick event handlers and classNames for the empty\n");
      out.write("\t// ones.\n");
      out.write("\tfor (row = 0; row <=8; row++) {\n");
      out.write("\t\tfor (col=0; col <= 8; col++) {\n");
      out.write("\t\t\tvar cell = document.getElementById('cell_' + col + '_' + row);\n");
      out.write("\t\t\tif (!parseInt(cell.innerHTML)) {\n");
      out.write("\t\t\t\t// cell is empty\n");
      out.write("\t\t\t\tcell.onclick = selectCell;\n");
      out.write("\t\t\t\tcell.className = 'tofill';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tdocument.onkeypress = keyPress;\n");
      out.write("}\n");
      out.write("\n");
      out.write("// mouse button event handler\n");
      out.write("function selectCell() {\n");
      out.write("\tif (current_cell !== null) {\n");
      out.write("\t\tcurrent_cell.className = 'tofill';\n");
      out.write("\t}\n");
      out.write("\tcurrent_cell = this;\n");
      out.write("\tcurrent_cell.className = 'selected';\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Capture keyboard key presses. If the key pressed is a digit\n");
      out.write("// then add it to the current cell. If it is a space then empty\n");
      out.write("// the current cell.\n");
      out.write("function keyPress(evt) {\n");
      out.write("\tif (current_cell == null)\n");
      out.write("\t\treturn;\n");
      out.write("\tvar key;\n");
      out.write("    showErrors();\n");
      out.write("\tif (evt)\n");
      out.write("\t\t// firefox or chrome\n");
      out.write("\t\tkey = String.fromCharCode(evt.charCode);\n");
      out.write("\n");
      out.write("\telse\n");
      out.write("\t\t// IE\n");
      out.write("\t\tkey = String.fromCharCode(event.keyCode);\n");
      out.write("\n");
      out.write("\tif (key == ' ')\n");
      out.write("\t\tcurrent_cell.innerHTML = '';\n");
      out.write("\n");
      out.write("\telse if (key >= 1 && key <= 9) {\n");
      out.write("        current_cell.innerHTML = key;\n");
      out.write("        errorCheck();\n");
      out.write("        //else\n");
      out.write("        //current_cell.innerHTML = key;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("function errorCheck()\n");
      out.write("{\n");
      out.write("if (cell_2_0 == cell_3_0)\n");
      out.write("    \t{\tcell_4_0.innerHTML = '8';\n");
      out.write("    current_cell.innerHTML = '';}\n");
      out.write("else{}\n");
      out.write("    \t\treturn null;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
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
      out.write("            <a href=\"Logout\" style=\"color: #999966;\">Logout</a>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"0\" bgcolor=\"#AB0D06\" fontfamily=\"font-family: Arial, Helvetica, sans-serif;\" width=\"1300\" align=\"center\">\n");
      out.write("            <tr >\n");
      out.write("                <td align=\"center\"><a href=\"index.jsp\" >Home</a></td>\n");
      out.write("                    <td align=\"center\"><a href=\"shopping.jsp\" align=\"center\">Shopping</a><td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"mailing.jsp\" align=\"center\">Mailing</a></td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"gaming.jsp\" align=\"center\">Gaming</a></td>\n");
      out.write("\t\t\t\t\t<td align=\"center\"><a href=\"feedback.jsp\" align=\"center\">Feedback</a></td>\n");
      out.write("<td align=\"center\"><a href=\"profile.jsp\" align=\"center\">Profile</a></td>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"gaming.jsp\">Gaming</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"mailing.jsp\">Mailing</a></li>\n");
      out.write("                                <li><a href=\"shopping.jsp\">shopping</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><h2>Shopping</h2>\n");
      out.write("                            <h3 align=\"right\"><a href=\"men.jsp\">MEN WEAR</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men2.jsp\">casual wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men3.jsp\">formal wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men4.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"men5.jsp\">accessories</a></li>\n");
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
      out.write("                                <li><a href=\"women2.jsp\">jeans and skirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women2.jsp\">tops</a></li>\n");
      out.write("                                <li><a href=\"women3.jsp\">ethinic wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women4.jsp\">footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"women5.jsp\">accessories</a></li>\n");
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
      out.write("<body onload=\"initialize()\">\n");
      out.write("<h2 align=center>Sudoku</h2>\n");
      out.write("<table align=center id=\"sudoku\" cellspacing=0>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_0\">2</td>\n");
      out.write("<td id=\"cell_1_0\"></td>\n");
      out.write("<td id=\"cell_2_0\"></td>\n");
      out.write("<td id=\"cell_3_0\"></td>\n");
      out.write("<td id=\"cell_4_0\"></td>\n");
      out.write("<td id=\"cell_5_0\">7</td>\n");
      out.write("<td id=\"cell_6_0\"></td>\n");
      out.write("<td id=\"cell_7_0\"></td>\n");
      out.write("<td id=\"cell_8_0\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_1\"></td>\n");
      out.write("<td id=\"cell_1_1\">5</td>\n");
      out.write("<td id=\"cell_2_1\"></td>\n");
      out.write("<td id=\"cell_3_1\"></td>\n");
      out.write("<td id=\"cell_4_1\">2</td>\n");
      out.write("<td id=\"cell_5_1\"></td>\n");
      out.write("<td id=\"cell_6_1\"></td>\n");
      out.write("<td id=\"cell_7_1\">1</td>\n");
      out.write("<td id=\"cell_8_1\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_2\"></td>\n");
      out.write("<td id=\"cell_1_2\">3</td>\n");
      out.write("<td id=\"cell_2_2\"></td>\n");
      out.write("<td id=\"cell_3_2\"></td>\n");
      out.write("<td id=\"cell_4_2\">8</td>\n");
      out.write("<td id=\"cell_5_2\"></td>\n");
      out.write("<td id=\"cell_6_2\"></td>\n");
      out.write("<td id=\"cell_7_2\">7</td>\n");
      out.write("<td id=\"cell_8_2\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_3\"></td>\n");
      out.write("<td id=\"cell_1_3\"></td>\n");
      out.write("<td id=\"cell_2_3\">5</td>\n");
      out.write("<td id=\"cell_3_3\">7</td>\n");
      out.write("<td id=\"cell_4_3\"></td>\n");
      out.write("<td id=\"cell_5_3\"></td>\n");
      out.write("<td id=\"cell_6_3\"></td>\n");
      out.write("<td id=\"cell_7_3\"></td>\n");
      out.write("<td id=\"cell_8_3\">2</td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_4\">1</td>\n");
      out.write("<td id=\"cell_1_4\"></td>\n");
      out.write("<td id=\"cell_2_4\"></td>\n");
      out.write("<td id=\"cell_3_4\"></td>\n");
      out.write("<td id=\"cell_4_4\"></td>\n");
      out.write("<td id=\"cell_5_4\"></td>\n");
      out.write("<td id=\"cell_6_4\"></td>\n");
      out.write("<td id=\"cell_7_4\"></td>\n");
      out.write("<td id=\"cell_8_4\">3</td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_5\">9</td>\n");
      out.write("<td id=\"cell_1_5\"></td>\n");
      out.write("<td id=\"cell_2_5\"></td>\n");
      out.write("<td id=\"cell_3_5\"></td>\n");
      out.write("<td id=\"cell_4_5\"></td>\n");
      out.write("<td id=\"cell_5_5\">6</td>\n");
      out.write("<td id=\"cell_6_5\">1</td>\n");
      out.write("<td id=\"cell_7_5\"></td>\n");
      out.write("<td id=\"cell_8_5\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_6\"></td>\n");
      out.write("<td id=\"cell_1_6\">2</td>\n");
      out.write("<td id=\"cell_2_6\"></td>\n");
      out.write("<td id=\"cell_3_6\"></td>\n");
      out.write("<td id=\"cell_4_6\">7</td>\n");
      out.write("<td id=\"cell_5_6\"></td>\n");
      out.write("<td id=\"cell_6_6\"></td>\n");
      out.write("<td id=\"cell_7_6\">8</td>\n");
      out.write("<td id=\"cell_8_6\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_7\"></td>\n");
      out.write("<td id=\"cell_1_7\">8</td>\n");
      out.write("<td id=\"cell_2_7\"></td>\n");
      out.write("<td id=\"cell_3_7\"></td>\n");
      out.write("<td id=\"cell_4_7\">9</td>\n");
      out.write("<td id=\"cell_5_7\"></td>\n");
      out.write("<td id=\"cell_6_7\"></td>\n");
      out.write("<td id=\"cell_7_7\">5</td>\n");
      out.write("<td id=\"cell_8_7\"></td>\n");
      out.write("<tr>\n");
      out.write("<td id=\"cell_0_8\"></td>\n");
      out.write("<td id=\"cell_1_8\"></td>\n");
      out.write("<td id=\"cell_2_8\"></td>\n");
      out.write("<td id=\"cell_3_8\">4</td>\n");
      out.write("<td id=\"cell_4_8\"></td>\n");
      out.write("<td id=\"cell_5_8\"></td>\n");
      out.write("<td id=\"cell_6_8\"></td>\n");
      out.write("<td id=\"cell_7_8\"></td>\n");
      out.write("<td id=\"cell_8_8\">6</td>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("\n");
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
