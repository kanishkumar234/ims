package ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InventoryManagementSystem {

	private static String jdbcurl = "oracle.jdbc.driver.OracleDriver" ;
	private static String connString = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String username = "anish";
	private static String password = "pass";
	
	static Connection conn;
	
	public static void main(String[] args) {
		
		
	try {
		
		//loading the driver 
		Class.forName(jdbcurl);
		//creating the connection
		conn = DriverManager.getConnection(connString, username, password);

		System.out.println("Connection Successful");
				
		UserCreationandAuthentication.Userlogin();
		
		System.out.println("Success!!");
		
		conn.close();
		
		System.out.println("Connection closed!!");
		
	}catch(ClassNotFoundException e)
	{
		e.printStackTrace();
		
	}
	catch(SQLException e) 
	{
		e.printStackTrace();
	}
		
		
		
	}
		
		
	
	

}
