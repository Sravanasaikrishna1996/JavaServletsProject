package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HTTPSessionDemoServlet")

	public class HTTPSessionDemoServlet extends HttpServlet {
	int counter = 1;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			 
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
	
				// Retrive the session object. 
	
				HttpSession session = request.getSession(true);   //false = dont create a new session
	           
				session.setAttribute("visiter", counter ++);
				System.out.println("session details:  " + session);
				//Check the session object is there.
				if (session == null)
					out.println("Http session not found!");
	
				else {
				  	out.println("Http session found!!");
				     }

       }

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

		}

	}
