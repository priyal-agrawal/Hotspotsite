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



/**
 * Servlet implementation class Registration1
 */

public class Registration1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

       private PreparedStatement ps=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration1() {
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

		String uid=request.getParameter("txtid");
		String upass=request.getParameter("txtpass");
		String cofpass=request.getParameter("txtpass2");
		String email=request.getParameter("txtarea");
		String add=request.getParameter("txtaddress");
		String phn=request.getParameter("txtphone");

		String strinsert="insert into registration (UserId,Password,ConfirmPass,Email,Mail,PhonNo) values (?,?,?,?,?,?)";

		try{
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotspot","root","root");
			ps=con.prepareStatement(strinsert);
			ps.setString(1, uid);
			ps.setString(2, upass);
			ps.setString(3, cofpass);
			ps.setString(4, email);
			ps.setString(5, add);
			ps.setString(6, phn);

			int rw=ps.executeUpdate();

			if(rw>0)
			{
				System.out.println("row inserted");
				response.sendRedirect("Login.jsp");

			}
		}
		catch(Exception se)
		{
			System.out.println(se);
		}
		finally
		{
			try{
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
