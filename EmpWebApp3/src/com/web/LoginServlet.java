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


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if(loginId.equalsIgnoreCase("HR") && password.equalsIgnoreCase("HR")){
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage");
			rd.forward(request, response);
		} else {
			EmployeeDao empDao = new EmployeeDao();
			Employee employee = empDao.getEmployee(loginId, password);
			if(employee!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage");
				rd.forward(request, response);
			} else {
				out.print("<body bgcolor=yellow text=red>");
				out.print("<h3><center>Invalid Credentials..</center></h3>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				out.print("</body>");
			}
		}
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
