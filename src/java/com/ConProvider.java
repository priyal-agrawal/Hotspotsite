/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.sql.*;
public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
          Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotspot","root","root");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
