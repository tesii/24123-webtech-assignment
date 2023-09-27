package com.auca.service;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{
	private static final String myusername = "patience";
	private static final String mypassword = "123";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String eusername = request.getParameter("username");
		String epassword = request.getParameter("password");
		if (eusername.equals(myusername)&&epassword.equals(mypassword)){
			response.sendRedirect("Home.html");
			
		}
		else {
			response.sendRedirect("ForgetPassword.html");
		}
	}
}
