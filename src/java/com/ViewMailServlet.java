/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;





import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewMailServlet extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("header.html").include(request, response);
		request.getRequestDispatcher("link.html").include(request, response);

		HttpSession session=request.getSession(false);
		if(session==null){
			response.sendRedirect("mailing.jsp");
		}else{
			String email=(String)session.getAttribute("email");
			out.print("<span style='float:right'>Hi, "+email+"</span>");

			String id=request.getParameter("id");

			try{
				Connection con=ConProvider.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from company_mailer_message where sender=?");
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					out.print("<h1>"+rs.getString("subject")+"</h1><hr/>");
					out.print("<p><b>Message:</b><br/> "+rs.getString("message")+" <br/> <b>By: "+rs.getString("sender")+"</b></p>");
					out.print("<p><a href='DeleteMailServlet?id="+rs.getString(1)+"'>Delete Mail</a></p>");

				}

				con.close();
			}catch(Exception e){out.print(e);}
		}



		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

	}

