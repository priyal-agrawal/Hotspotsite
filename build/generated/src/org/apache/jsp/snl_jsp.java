package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class snl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\tvar pythons=new Array(26,35);\n");
      out.write("\t\tvar doors=new Array(6,41);\n");
      out.write("\t\tvar snakes=new Array([46,31],[15,2],[19,11]);\n");
      out.write("\t\tvar ladders=new Array([9,22],[34,47],[13,28]);\n");
      out.write("\t\tvar playersteps;\n");
      out.write("\n");
      out.write("\t\t//this function draws the game board dynamically.\n");
      out.write("\t\tfunction draw(num)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar str=\"<table border=\\\"1\\\" bgcolor=\\\"#FFF6BF\\\">\";\n");
      out.write("\t\t\tvar x=num*num,y;\n");
      out.write("\t\t\tfor(i=1;i<=num;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tstr+=\"<tr height=\\\"70\\\">\";\n");
      out.write("\t\t\t\tif(num%2==0)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tif(i%2!=0)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tx=x-num+1;\n");
      out.write("\t\t\t\t\t\tfor(j=0;j<num;j++,x++)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<td width=\\\"70\\\" align=\\\"center\\\" id=\\\"\"+x+\"\\\">\"+x+\"</td>\";\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tx=x-num-1;\n");
      out.write("\t\t\t\t\t\tfor(j=0;j<num;j++,x--)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<td width=\\\"70\\\" align=\\\"center\\\" id=\\\"\"+x+\"\\\">\"+x+\"</td>\";\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tif(i%2!=0)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tif(i!=1)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tx=x-num-1;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\tfor(j=0;j<num;j++,x--)\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<td width=\\\"70\\\" align=\\\"center\\\" id=\\\"\"+x+\"\\\">\"+x+\"</td>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tx=x-num+1;\n");
      out.write("\t\t\t\t\t\tfor(j=0;j<num;j++,x++)\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<td width=\\\"70\\\" align=\\\"center\\\" id=\\\"\"+x+\"\\\">\"+x+\"</td>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tstr+=\"</tr>\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tstr+=\"</table>\";\n");
      out.write("\n");
      out.write("\t\t\tdocument.getElementById(\"board\").innerHTML=str;\n");
      out.write("\t\t\tdocument.getElementById(num*num).innerHTML=\"<img src=\\\"images/snl/star.gif\\\" width=\\\"70\\\" height=\\\"70\\\"></img>\";\n");
      out.write("\n");
      out.write("\t\t\t//Loop to generate pythons.\n");
      out.write("\t\t\tfor(i=0;i<pythons.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(pythons[i]%2!=0)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tdocument.getElementById(pythons[i]).innerHTML=\"<img src=\\\"images/snl/python1.gif\\\" width=\\\"70\\\" height=\\\"70\\\"></img>\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tdocument.getElementById(pythons[i]).innerHTML=\"<img src=\\\"images/snl/python2.gif\\\" width=\\\"70\\\" height=\\\"70\\\"></img>\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//Loop to generate Magic doors.\n");
      out.write("\t\t\tfor(i=0;i<doors.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t\tdocument.getElementById(doors[i]).innerHTML=\"<img src=\\\"images/snl/door1.gif\\\" width=\\\"70\\\" height=\\\"70\\\"></img>\";\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t//loop to mark the ladders and snakes.\n");
      out.write("\t\t\tfor(i=0;i<ladders.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tdocument.getElementById(ladders[i][0]).innerHTML=\"L\"+ladders[i][0];\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tfor(i=0;i<snakes.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tdocument.getElementById(snakes[i][0]).innerHTML=\"S\"+snakes[i][0];\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t//this function populates buttons based on the total number of players.\n");
      out.write("\t\tfunction loadbuttons()\n");
      out.write("\t\t{\n");
      out.write("\t\t\ttotalplayers=document.snl.players.value;\n");
      out.write("\t\t\tif(isNaN(totalplayers))\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\talert(\"Invalid input.\");\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(totalplayers>4)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\talert(\"Maximum 4 players can play.\");\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tstr=\" \";\n");
      out.write("\t\t\tfor(i=0;i<totalplayers;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(i==0)\n");
      out.write("\t\t\t\t\tstr+=\"<img src=\\\"images/snl/coin\"+(i+1)+\".gif\\\"></img><input type=\\\"button\\\" value=\\\"player \"+(i+1)+\" roll dice\\\" id=\\\"btn\"+i+\"\\\" onclick=\\\"startplay(7,\"+i+\")\\\"><br/>\";\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\tstr+=\"<img src=\\\"images/snl/coin\"+(i+1)+\".gif\\\"></img><input type=\\\"button\\\" value=\\\"player \"+(i+1)+\" roll dice\\\" id=\\\"btn\"+i+\"\\\" onclick=\\\"startplay(7,\"+i+\")\\\" disabled=\\\"true\\\"><br/>\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tdocument.getElementById(\"playerbtn\").innerHTML =str;\n");
      out.write("\t\t\tplayersteps=new Array(totalplayers);\n");
      out.write("\t\t\tfor(i=0;i<totalplayers;i++)\n");
      out.write("\t\t\t\tplayersteps[i]=0;\n");
      out.write("\t\t\tdocument.getElementById(\"okbtn\").disabled=true;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// this function does the work of a dice.\n");
      out.write("\t\tfunction rolldice()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar t=Math.floor((Math.random() * 10));\n");
      out.write("\t\t\tdice=(t%6)+1;\n");
      out.write("\t\t\tdocument.getElementById(\"dice\").innerHTML =\"<img src=\\\"images/snl/dice\"+dice+\".gif\\\" width=\\\"50\\\" height=\\\"50\\\" ></img>\";\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t//the main function which is used to play the game executed by each player button.\n");
      out.write("\t\tfunction startplay(num,playernum)\n");
      out.write("\t\t{\n");
      out.write("\t\t\trolldice();\n");
      out.write("\t\t\toldstep=playersteps[playernum];\n");
      out.write("\t\t\tplayersteps[playernum]+=dice;\n");
      out.write("\n");
      out.write("\t\t\t//To enable the next players button\n");
      out.write("\t\t\tdocument.getElementById(\"btn\"+playernum).disabled=true;\n");
      out.write("\t\t\tchk=-1;\n");
      out.write("\t\t\ti=playernum;\n");
      out.write("\t\t\tdo\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\ti++;\n");
      out.write("\t\t\t\tif(i==playersteps.length)\n");
      out.write("\t\t\t\t\ti=0;\n");
      out.write("\t\t\t\tif(playersteps[i]>=0)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"btn\"+i).disabled=false;\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"btn\"+i).disabled=true;\n");
      out.write("\t\t\t}while(i!=playernum);\n");
      out.write("\n");
      out.write("\t\t\t//Loop to handle the execution if the block reached is a magic door.\n");
      out.write("\t\t\tfor(i=0;i<doors.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(playersteps[playernum]==doors[i])\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tvar t=Math.floor((Math.random() * 100));\n");
      out.write("\t\t\t\t\tprevblock=playersteps[playernum];\n");
      out.write("\t\t\t\t\tplayersteps[playernum]=(t%(num*num))+1;\n");
      out.write("\n");
      out.write("\t\t\t\t\t//this loop checks if the player reaches again a teleport place then increase its position by 1.\n");
      out.write("\t\t\t\t\tfor(j=0;j<doors.length;j++)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tif(playersteps[playernum]==doors[i])\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tplayersteps[playernum]++;\n");
      out.write("\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\talert(\"Magic Door:Player\"+(playernum+1)+\" teleported to block-\"+playersteps[playernum]+\" from block-\"+prevblock);\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//Loop to handle the execution if the block reached is a ladder.\n");
      out.write("\t\t\tfor(i=0;i<ladders.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(playersteps[playernum]==ladders[i][0])\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tprevblock=playersteps[playernum];\n");
      out.write("\t\t\t\t\tplayersteps[playernum]=ladders[i][1];\n");
      out.write("\t\t\t\t\talert(\"Player\"+(playernum+1)+\": Climbed to block-\"+playersteps[playernum]+\" from block-\"+prevblock);\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//Loop to handle the execution if the block reached is a snake.\n");
      out.write("\t\t\tfor(i=0;i<snakes.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(playersteps[playernum]==snakes[i][0])\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tprevblock=playersteps[playernum];\n");
      out.write("\t\t\t\t\tplayersteps[playernum]=snakes[i][1];\n");
      out.write("\t\t\t\t\talert(\"Player\"+(playernum+1)+\": Eaten by snake to block-\"+playersteps[playernum]+\" from block-\"+prevblock);\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//Loop to handle the execution if the block reached is a python.\n");
      out.write("\t\t\tfor(i=0;i<pythons.length;i++)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(playersteps[playernum]==pythons[i])\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Game Over: Player\"+(playernum+1)+\" got swallowed by a python.\");\n");
      out.write("\t\t\t\t\tstr=oldstep;\n");
      out.write("\t\t\t\t\tfor(i=0;i<playersteps.length;i++)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tif(playersteps[i]==oldstep)\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<img src=\\\"images/snl/coin\"+(i+1)+\".gif\\\"></img>\"\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tdocument.getElementById(oldstep).innerHTML=str;\n");
      out.write("\t\t\t\t\tplayersteps[playernum]=-1;\n");
      out.write("\t\t\t\t\tchk=0;\n");
      out.write("\t\t\t\t\tfor(i=0;i<playersteps.length;i++)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tif(playersteps[i]>0)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tchk=1;\n");
      out.write("\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tif(chk==0)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tdraw(7);\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"playerbtn\").innerHTML =\"\";\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"players\").value =\"1\";\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"dice\").innerHTML =\"\";\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"okbtn\").disabled=false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//Updating the board based on the players position\n");
      out.write("\t\t\tif(playersteps[playernum]<(num*num))\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif(oldstep!=0)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tstr=oldstep;\n");
      out.write("\t\t\t\t\tfor(i=0;i<playersteps.length;i++)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tif(playersteps[i]==oldstep)\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<img src=\\\"images/snl/coin\"+(i+1)+\".gif\\\"></img>\"\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tdocument.getElementById(oldstep).innerHTML=str;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tstr=playersteps[playernum];\n");
      out.write("\t\t\t\tfor(i=0;i<playersteps.length;i++)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tif(playersteps[i]==playersteps[playernum])\n");
      out.write("\t\t\t\t\t\tstr+=\"<img src=\\\"images/snl/coin\"+(i+1)+\".gif\\\"></img>\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tdocument.getElementById(playersteps[playernum]).innerHTML=str;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse if(playersteps[playernum]==(num*num))\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\talert(\"Congrats: Player\"+(playernum+1)+\" Won.\");\n");
      out.write("\t\t\t\tdraw(7);\n");
      out.write("\t\t\t\tdocument.getElementById(\"playerbtn\").innerHTML =\"\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"players\").value =\"1\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"dice\").innerHTML =\"\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"okbtn\").disabled=false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\tplayersteps[playernum]=oldstep;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t#s1{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 57%;\n");
      out.write("\t\t\ttop: 74%;\n");
      out.write("\t\t}\n");
      out.write("\t\t#s2{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 72%;\n");
      out.write("\t\t\ttop: 120%;\n");
      out.write("\t\t}\n");
      out.write("\t\t#s3{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 53.5%;\n");
      out.write("\t\t\ttop: 112%;\n");
      out.write("\t\t}\n");
      out.write("\t\t#l1{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 41%;\n");
      out.write("\t\t\ttop: 107%;\n");
      out.write("\t\t}\n");
      out.write("\t\t#l2{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 45.25%;\n");
      out.write("\t\t\ttop: 64.5%;\n");
      out.write("\t\t}\n");
      out.write("\t\t#l3{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft:70%;\n");
      out.write("\t\t\ttop: 106.5%;\n");
      out.write("\t\t}\n");
      out.write("\t\ttd{\n");
      out.write("\t\t\tfont-size:20px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
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
      out.write("<body onload=\"draw(7)\" bgcolor=\"#8AB8E6\">\n");
      out.write("\t<center>\n");
      out.write("\t<h2>Snakes and ladder game</h2>\n");
      out.write("\n");
      out.write("\t<table>\n");
      out.write("\t\t<form name=\"snl\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><div id=\"board\"></div></td>\n");
      out.write("\t\t\t<td width=\"71px\">\n");
      out.write("\t\t\t\t<div id=\"playerbtn\"></div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td width=\"50px\" height=\"50px\"><div id=\"dice\"></div></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"center\"><br/>Select number of Players:\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"1\" name=\"players\" id=\"players\" size=\"1\" maxlength=\"1\">\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"OK\" onclick=\"loadbuttons()\" id=\"okbtn\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<!--\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"center\"><br/>Total Players:\n");
      out.write("\t\t\t<input type=\"radio\" name=\"players\" value=\"1\" checked=\"checked\" id=\"players\" onchange=\"loadbuttons()\">1 Player\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;<input type=\"radio\" name=\"players\" value=\"2\" id=\"players\" onchange=\"loadbuttons()\">2 Players\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t-->\n");
      out.write("\t\t</form>\n");
      out.write("\t</table>\n");
      out.write("\t</center>\n");
      out.write("\t<div id=\"s1\">\n");
      out.write("\t<img src=\"images/snl/snake1.gif\"></img>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"s2\">\n");
      out.write("\t<img src=\"images/snl/snake2.gif\" width=\"105\" height=\"165\"></img>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"s3\">\n");
      out.write("\t<img src=\"images/snl/snake3.gif\"></img>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"l1\">\n");
      out.write("\t<img src=\"images/snl/ladder1.gif\"></img>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"l2\">\n");
      out.write("\t<img src=\"images/snl/ladder2.gif\"></img>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"l3\">\n");
      out.write("\t<img src=\"images/snl/ladder3.gif\"></img>\n");
      out.write("\t</div>\n");
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
