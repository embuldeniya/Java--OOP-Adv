package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db.MyConnection;
import com.dto.Employee;


public class EmployeeDao {
	
	public static Employee getEmployee(String loginId, String password) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Scanner sc = new Scanner(System.in);
			con = MyConnection.getConnection();
			pst = con.prepareStatement("select * from employee where loginId = ? and password = ?");


			pst.setString(1, loginId);
			pst.setString(2, password);

			rs  = pst.executeQuery();
			if(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setLoginId(rs.getString(4));
				employee.setPassword(rs.getString(5));
				return employee;
			}	

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int register(Employee employee) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setDouble(3, employee.getSalary()); 
			pst.setString(4, employee.getLoginId()); 
			pst.setString(5, employee.getPassword()); 
			
			int x = pst.executeUpdate();
			return x;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	public static Employee getEmployee(int loginId) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			con = MyConnection.getConnection();
			pst = con.prepareStatement("select * from employee where empId = ?");


			pst.setInt(1, loginId);
		

			rs  = pst.executeQuery();
			if(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setLoginId(rs.getString(4));
				employee.setPassword(rs.getString(5));
				return employee;
			}	

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<Employee> getEmployee() {
	
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		List <Employee> empList = new ArrayList<Employee>();
		try {
			
			con = MyConnection.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
		
			
			

			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setLoginId(rs.getString(4));
				employee.setPassword(rs.getString(5));
				empList.add(employee);
				
			}	

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empList;
	}

	

	
}
