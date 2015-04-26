/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class CreateProfile
 */

public class CreateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private PreparedStatement ps=null;
      HttpSession hs=null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateProfile() {
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
		String uid=(String)hs.getAttribute("userinfo");
		
		String uname=request.getParameter("uname");
		String uadd=request.getParameter("uadd");
		String uemail=request.getParameter("uemail");
		String uphn=request.getParameter("uphn");
		
		try{
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotspot","root","root");
		String strinsert="insert into staff (userid,name,addr,email,phn) values (?,?,?,?,?)";
        ps=con.prepareStatement(strinsert);
			ps.setString(1, uid);
			ps.setString(2, uname);
			ps.setString(3, uadd);
			ps.setString(4, uemail);
			ps.setString(5, uphn);
			int rw=ps.executeUpdate();
			if(rw>0)
			{
				System.out.println("row inserted");
				response.sendRedirect("index.jsp");
			}


		}


		catch(Exception se)
		{
			System.out.println(se);
		}
		finally
		{
			try {
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


