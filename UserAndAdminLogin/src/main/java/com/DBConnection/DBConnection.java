package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection con;
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##chandan1","Chandan9621");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static Connection getCon()
	{
	 return con;
	}

	}
