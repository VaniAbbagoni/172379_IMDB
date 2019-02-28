package com.imdb.review;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.imdb.Db_connection;

import java.sql.Connection;


public class RatingDAO {


	public void  insertComments(RatingPojo rating) throws SQLException
	{
		String query="insert into rating values(?)";
		Connection conn =Db_connection.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, rating.getComment());
	     pStatement.executeUpdate();
		
	}	
	
}
