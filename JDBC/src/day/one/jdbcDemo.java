package day.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {
	
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rt = null;
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db830aug", "root", "abc@1234");
			st = con.createStatement();
			//int x = st.executeUpdate("insert into employee values (2, 'Uzo', 888.88)");
			
			//System.out.println(x + " rows inserted ");
			st.executeUpdate("delete from employee where empName = 'Uzo'");
			rt = st.executeQuery("select * from employee");
			
			
			while (rt.next()) {
				System.out.println("Id " + rt.getInt(1));
				System.out.println("Name "+ rt.getString(2));
				System.out.println("Salary "+ rt.getDouble(3));
				
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
