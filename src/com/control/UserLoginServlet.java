package com.control;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
         //http://192.168.159.1:8080/USerLogin/
		
             
 			String password = request.getParameter("password");
 			String     username    = request.getParameter("username");
 			if (username.equals(password))
 			{
 				request.getRequestDispatcher("/loginOk.jsp").forward(request, response);
 			} else
 			{
 				request.getRequestDispatcher("/loginFall.jsp").forward(request, response);
 			}

     
	}


}
