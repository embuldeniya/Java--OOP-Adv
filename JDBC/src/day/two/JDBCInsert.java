package day.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBCcon.MyConnection;

public class JDBCInsert {
	
	
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		Scanner sc = new Scanner(System.in);
		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement("insert into employee values(?,?,?)");
			String choice = null; 
			
			do {
				System.out.println("Enter id");
				int id = sc.nextInt();
				pst.setInt(1, id);
				System.out.println("Enter name");
				String name = sc.next();
				pst.setString(2, name);
				System.out.println("Enter salray");
				double salary = sc.nextDouble();
				pst.setDouble(3,salary);
				int x = pst.executeUpdate();
				System.out.println(x + " rows updates");
				System.out.println("Do u want more (Y/N)");
				choice = sc.next();
				
			}
			while(choice.equalsIgnoreCase("Y"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}

}
