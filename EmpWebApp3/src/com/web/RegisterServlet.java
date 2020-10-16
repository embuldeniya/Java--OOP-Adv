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


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setSalary(salary);
		employee.setLoginId(loginId);
		employee.setPassword(password);

		EmployeeDao empDao = new EmployeeDao();

		int x = empDao.register(employee);
		if(x > 0) {
			out.print("<h3><center>Registration Success..</center></h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		} else {
			out.print("<body bgcolor=yellow text=red>");
			out.print("<h3><center>Registration Failure..</center></h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Register.html");
			rd.include(request, response);
			out.print("</body>");
		}
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
