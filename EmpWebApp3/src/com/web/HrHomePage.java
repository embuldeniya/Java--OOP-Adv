package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HrHomePage")
public class HrHomePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginId = request.getParameter("loginId");
		
		out.print("<html>");
		out.print("<body bgcolor=yellow text=green>");
		out.print("Hi: "+loginId+"<h1><center>Welcome to HR Home Page..</center></h1>");
		out.print("<h3><center><a href='DisplayEmp.html'>Display Employee Id </a></center></h3>");
		out.print("<h3><center><a href='DisplayAllServlet'>Display All Employees</a></center></h3>");
				
		out.print("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
