package com.imdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(description = "to insert data", urlPatterns = { "/RegServlet" })
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		   String uname=request.getParameter("uname");
		   String psw=request.getParameter("psw"); 
		 
          
		 RegistrationDAO u=new RegistrationDAO();
		
		//int i=0;
	try {
		u.register(uname, psw);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
//		 if(i==1)
//		 {
//			 response.sendRedirect("login.html");
//		 }
//		 else
//		 {
//			 response.sendRedirect("Registration.html");
//		 }
	response.sendRedirect("succ.html");
	}

}