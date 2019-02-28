package com.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.imdb.review.RatingPojo;
public class RegistrationDAO {

	public static boolean register(String uname,String password)  throws SQLException 
	{ 
		 //boolean status=false;
		    Connection con =Db_connection.getConnection();
		    String sql =("insert into user1 values (?,?)");
			  PreparedStatement pst =con.prepareStatement(sql);
			  pst.setString(1,uname);
			  pst.setString(2,password);
			 // pst.setString(2,confirmpsw);
			
	         int res=pst.executeUpdate();

		     return true;
	}

	public int read1(RatingPojo ratingPojo) {
		
		return 0;
	}

}




