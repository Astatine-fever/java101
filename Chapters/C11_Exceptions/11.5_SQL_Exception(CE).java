package Chapter11_EXCEPTION; // This is only on eclipse to specify which package it belongs to 

import java.sql.*; // to use sql commands inside java program 

class AstatineJDBC 
{
public static void main(String args[]) throws Exception // Here exceptions are thrown 
{
	// This is to check whether the database is connected... using try catch
try // This will try the statements inside try method 
{
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307","root","");
	Class.forName("com.mysql.cj.jdbc.Driver");	
	// Prepared Statements execute the sql queries 
    PreparedStatement ps = con.prepareStatement("Create Database JDBC1"); 
	ps.executeUpdate();
	System.out.println("Connection Established and Database Created");
	
} 
catch (Exception e) // This will catch any exception during try session 
{
		e.printStackTrace();
}
	}
}