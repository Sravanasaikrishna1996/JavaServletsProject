package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userid =request.getParameter("userid");
		String password = request.getParameter("pwd");
		
		
		
		// validate the userid anfd passwrod
		if(userid.equals("admin") && password.equals("12345")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userid",userid);
			response.sendRedirect("DashboardServlet");
		}else {
			// show the login form again
			response.sendRedirect("Error.html");
	}

}
}
