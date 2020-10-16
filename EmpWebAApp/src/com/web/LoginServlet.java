package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		if (loginId.equalsIgnoreCase("HR") && password.equalsIgnoreCase("HR") ) {
		RequestDispatcher rd = request.getRequestDispatcher("HrHomePage");
		rd.forward(request, response);
		
		}
		
		else {
							
			out.print("<body bgcolor=green text=red>");
			out.print("<h3><center>Invalid password or username </center> </h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
			out.print("</body>");
		}
		
		out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
