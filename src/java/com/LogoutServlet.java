/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutServlet extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("header.html").include(request, response);

		request.getSession().invalidate();
		out.print("<p>You are successfully logged out!</p>");

		request.getRequestDispatcher("login.html").include(request, response);

		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();

	}

}
