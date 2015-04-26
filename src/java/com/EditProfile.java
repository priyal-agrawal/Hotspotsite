/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;


import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class EditProfile
 */

public class EditProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	HttpSession hs=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfile() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		hs=request.getSession(false);
		String ui=(String)hs.getAttribute("userinfo");

		String nm=request.getParameter("uname");
		String uadd=request.getParameter("uadd");
		String uemail=request.getParameter("uemail");
		String uphn=request.getParameter("uphn");
		String strupdate="update registration set name=?,Mail=?,Email=?,PhonNo=? where UserId=?";
		try{
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotspot","root","root");
			ps=con.prepareStatement(strupdate);
			ps.setString(1, nm);
			ps.setString(2, uadd);
			ps.setString(3, uemail);
			ps.setString(4, uphn);
			ps.setString(5, ui);
			System.out.println(ps);
			int rw=ps.executeUpdate();
			if(rw>0)
			{
				System.out.println("insered");
				response.sendRedirect("/Hotspotsite/ViewProfile.jsp");
			}

		}
		catch(Exception se)
		{
			System.out.println(se);
		}
		finally{
			try
			{
				if(ps!=null)
				{
					ps.close();
				}
			}
				catch (SQLException e)
				{
					System.out.println(e);
				}
			}




	}

}
