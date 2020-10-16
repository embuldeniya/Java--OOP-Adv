package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.dto.Employee;

@WebServlet("/DisplayAllServlet")
public class DisplayAllServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		EmployeeDao empDao = new EmployeeDao();
		List<Employee> employ = empDao.getEmployee();
		request.setAttribute("empList", employ);
		

		if (employ != null) {
			RequestDispatcher rd = request.getRequestDispatcher("DisplayAll.jsp");
			rd.include(request, response);

			
		} else {

			out.print("<h3><center>Invalid ID</center></h3>");
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.include(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
