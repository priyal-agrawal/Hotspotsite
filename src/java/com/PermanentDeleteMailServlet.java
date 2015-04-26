/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PermanentDeleteMailServlet extends HttpServlet {
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

			String id=request.getParameter("email");

			try{
				Connection con=ConProvider.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from company_mailer_message where sender=?");
				ps.setString(1,email);
				int i=ps.executeUpdate();
				if(i>0){
					request.setAttribute("msg","Mail successfully deleted permanently!");
					request.getRequestDispatcher("TrashServlet").forward(request, response);
				}
				con.close();
			}catch(Exception e){out.print(e);}
		}



		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();

	}

}
