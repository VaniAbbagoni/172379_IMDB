package com.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegistrationDAO {

	public int register(String uname,String psw )  throws SQLException 
	{ 
		 //boolean status=false;
		    Connection con =Db_connection.getConnection();
		    String sql ="insert into users values (?,?)";
			  PreparedStatement pst =con.prepareStatement(sql);
			  pst.setString(1,uname);
			  pst.setString(2,psw);
			
	int res=pst.executeUpdate();
			
		return res;
	}
}