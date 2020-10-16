package day.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import JDBCcon.MyConnection;

public class JDBCSelect {
	
	
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement("select * from employee  where empId = ? ");
			String choice = null; 
			
			
			do {
				System.out.println("Enter the employee Input id");
				int id = sc.nextInt();
				pst.setInt(1, id);
				rs = pst.executeQuery();
				
				if (rs.next()) {
					System.out.println("Id " + rs.getInt(1));
					System.out.println("Name "+ rs.getString(2));
					System.out.println("Salary "+ rs.getDouble(3));
					
					
				}
				
				System.out.println("Do u want more (Y/N");
				choice = sc.next();
				
			}
			while(choice.equalsIgnoreCase("Y"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}

}
