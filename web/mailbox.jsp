
<%@page import="java.sql.*,myconn.conn"%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Employee | Mailbox</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="../css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap wysihtml5 - text editor -->
        <link href="../css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <!-- iCheck for checkboxes and radio inputs -->
        <link href="../css/iCheck/minimal/blue.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="../css/AdminLTE.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="../index.html" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
               Employee
            </a>
            <!-- Header Navbar: style can be found in header.less -->

        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->


            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header no-margin">
                    <h1 class="text-center">

                        Mailbox
                    </h1>
                </section>

                <!-- Main content -->
                <section class="content">
                    <!-- MAILBOX BEGIN -->
                    <div class="mailbox row">
                        <div class="col-xs-12">
                            <div class="box box-solid">
                                <div class="box-body">
                                    <div class="row">
                                        <div class="col-md-3 col-sm-4">
                                            <!-- BOXES are complex enough to move the .box-header around.
                                                 This is an example of having the box header within the box body -->
                                            <div class="box-header">
                                                <i class="fa fa-inbox"></i>
                                                <h3 class="box-title">INBOX</h3>
                                            </div>
                                            <!-- compose message btn -->
        <a class="btn btn-block btn-primary" data-toggle="modal" href="mailbox.jsp?pagename=composeofe.jsp"><i class="fa fa-pencil"></i> Compose Message</a>
                                            <!-- Navigation - folders-->
                                            <div style="margin-top: 15px;">
                                                <ul class="nav nav-pills nav-stacked">
                                                    <li class="header">Folders</li>
                                                <%     String e=(String)session.getAttribute("euser");
                                                 String id=null;
Connection con=conn.c();
int c=0;
PreparedStatement pst1=con.prepareStatement("select * from employee INNER JOIN inbox ON employee.empid=inbox.receiver_id where employee.username=?");
pst1.setString(1, e);
ResultSet rst=pst1.executeQuery();
if(rst.next()){
 id=rst.getString("employee.empid");
 }
 PreparedStatement ps2=con.prepareStatement("select msgid  from inbox where receiver_id=? and status=?");
ps2.setString(1, id);
ps2.setString(2, "unread");
 ResultSet rs3=ps2.executeQuery();
while(rs3.next())
       {

   c++;
}

                                                %>

                                                <li class="active"><a href="mailbox.jsp"><i class="fa fa-inbox"></i> Inbox &nbsp; <% if(c!=0) { %> <font color="green"><b>(<%=c%>)</b></font><% } %></a></li>
                                                    <li><a href="seedraft.jsp"><i class="fa fa-pencil-square-o"></i> Drafts</a></li>
                                                    <li><a href="viewsent.jsp"><i class="fa fa-mail-forward"></i> Sent</a></li>
                                                    <li><a href="#"><i class="fa fa-star"></i> Starred</a></li>
                                                    <li><a href="#"><i class="fa fa-folder"></i> Junk</a></li>
                                                </ul>
                                            </div>
                                        </div><!-- /.col (LEFT) -->
                                        <div class="col-md-9 col-sm-8">
                                            <%
                                            String page1=request.getParameter("pagename");

                                            if(page1!=null)
                                                   {%>

                                             <jsp:include page='<%=page1%>'></jsp:include>

                                             <%
                                            }
else{
PreparedStatement ps=con.prepareStatement("select * from inbox where receiver_id=?");
ps.setString(1, id);

ResultSet rs=ps.executeQuery();

    %>
                                            <div class="row pad">
                                                <div class="col-sm-6">    </div>

                                            </div><!-- /.row -->
<%
String m=request.getParameter("msg");
if(m!=null)
       {%>

                                            <%=m%>

<%}
%>
                                            <div class="table-responsive">
                                                  <!-- THE MESSAGES -->

                                                <table class="table table-mailbox">
                                                    <th>Select</th>
                                                    <th>Sender</th>
                                                    <th>Subject</th>
                                                    <th>Date</th>
                                                    <th>View</th>

                                                     <form action="delinbox.jsp" method="post">
                                                         <input type="submit" value="DELETE"/>
                                                   <% while(rs.next()){ %>


                                                    <tr>
                         <td class="small-col"><input type="checkbox"  name="chk" value='<%=rs.getInt("msgid")%>'/></td>
                         <%    if(rs.getString("status").equalsIgnoreCase("unread")) { %>

                                                        <td class="name"><b><%=rs.getString("sender_id")%></b></td>
                                                        <td class="subject"><b><%=rs.getString("subject")%></b></td>
                                                        <td class="time"><b><%=rs.getString("date")%></b></td>

                                                        <td class="name"><a href="sentemails.jsp?message=<%=rst.getString("message")%>&msgid=<%=rs.getInt("msgid")%>"><b>View Message</b></a>
                                                        </td>
                                                    <%}
else {     %>
                                                     <td><%=rs.getString("sender_id")%></td>
                                                        <td class="subject"><%=rs.getString("subject")%></td>
                                                        <td class="time"><%=rs.getString("date")%></td>

                                                        <td><a href="sentemails.jsp?message=<%=rst.getString("message")%>&msgid=<%=rs.getInt("msgid")%>">View Message</a>
                                                        </td>

<%   }
%>

                                                    </tr>
                                                    <% } %>
                                                    </form>
                                                </table>

                                            </div><!-- /.table-responsive -->

                                        </div><!-- /.col (RIGHT) -->
                                    </div><!-- /.row -->
                                </div><!-- /.box-body -->

                                <div class="box-footer clearfix">
                                    <div class="pull-right">
                                        <small>Showing 1-12/1,240</small>
                                        <button class="btn btn-xs btn-primary"><i class="fa fa-caret-left"></i></button>
                                        <button class="btn btn-xs btn-primary"><i class="fa fa-caret-right"></i></button>
                                    </div>
                                    <% } %>
                                </div><!-- box-footer -->
                            </div><!-- /.box -->
                        </div><!-- /.col (MAIN) -->
                    </div>
                    <!-- MAILBOX END -->

                </section><!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->

        <!-- COMPOSE MESSAGE MODAL -->

        <script type="text/javascript">
            </script>

    </body>
</html>
