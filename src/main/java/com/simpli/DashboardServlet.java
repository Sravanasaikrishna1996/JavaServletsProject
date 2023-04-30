package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
 
		

		HttpSession session = request.getSession(false);// false = don't create a new session
		
		
		//Check the session object is there.
		if (session == null) {
			out.println("Http session not found!");
			response.sendRedirect("index.html");
		}

		else {
			if(session.getAttribute("userid")!=null) {
				response.sendRedirect("LoginSuccess.html");
				//out.println("<a href=\"LogoutServlet\" >LOG OUT HERE </a>");
			}
		}
			

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
