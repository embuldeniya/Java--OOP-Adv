package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.dto.Employee;

@WebServlet("/DisplayEmpServlet")
public class DisplayEmpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int empId = Integer.parseInt(request.getParameter("empId"));
		EmployeeDao empDao = new EmployeeDao();
		Employee employee = empDao.getEmployee(empId);

		if (employee != null) {
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage");
			rd.include(request, response);
			out.print("<table border=2 align=center >");
			out.print("<tr>");
			out.print("<th>Employee ID</th> <th>Name</th><th>Salary</th>");
			out.print("</tr>");
			
			out.print("<tr>");
			out.print("<td>"+employee.getEmpId() +"</td>");
			out.print("<td>"+employee.getEmpName()+"</td>");		
			out.print("<td>"+employee.getSalary()+"</td>");		
			out.print("</tr>");   
			out.print("</table>");
			
			
		} else {
			
			out.print("<h3><center>Invalid ID</center></h3>");
			RequestDispatcher rd = request.getRequestDispatcher("DisplayEmp.html");
			rd.include(request, response);
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
