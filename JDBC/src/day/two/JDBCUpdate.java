package day.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBCcon.MyConnection;

public class JDBCUpdate {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		Scanner sc = new Scanner(System.in);
		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement("update employee set salary = ? where empId = ? ");
			String choice = null; 
			
			do {
				System.out.println("Enter the employee id by look up ");
				int id = sc.nextInt();
				pst.setInt(2, id);
				System.out.println("Enter  new salray");
				double salary = sc.nextDouble();
				pst.setDouble(1,salary);
				int x = pst.executeUpdate();
				System.out.println(x + " rows updates");
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
