/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.sql.*;
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PreparedStatement ps=null;
	private ResultSet rs=null;
	HttpSession hs=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpSenrvletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String ui=request.getParameter("txtuserid");
		String upass=request.getParameter("txtuserpass");


		String strsql="select * from registration where UserId=? and Password=?";
		try{
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotspot","root","root");
			ps=con.prepareStatement(strsql);
			ps.setString(1, ui);
			ps.setString(2, upass);
			rs=ps.executeQuery();
			if(rs.next())
			{
				hs=request.getSession();
				hs.setAttribute("userinfo",ui);
				response.sendRedirect("/Hotspotsite/choose.jsp");
			}
		}
		catch(Exception se)
		{
			System.out.println(se);
		}
		finally
		{
			try
			{
				if(ps!=null)
				{
					ps.close();
				}
			}
			catch(SQLException se1)
			{
				System.out.println(se1);
			}
		}
	}
}
