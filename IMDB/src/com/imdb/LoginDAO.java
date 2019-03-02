package com.imdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public static boolean validate(String uname,String password){  
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
	
		PreparedStatement ps=con.prepareStatement(  
		"select uname, password from user1");  
		
		ResultSet rs=ps.executeQuery();  
		
		while(rs.next()){
		String	uname1 = rs.getString("uname");
           String  password1 = rs.getString("password");

            if(uname.equals(uname1) && password.equals(password1))
            		{
               
                status = true;
            }
           
        }
		
		          
		}catch(Exception e)
		{System.out.println(e);}  
		return status;  
		} 

	
	}  


