package fourteen;



public class EmployeeDemo {

	public static void main(String[] args) {
		
		
		FullTimeEmployee ftEmp = new FullTimeEmployee("SACHIN","TENDULKAR","10-10,EAST,MUMBAI,INDIA","9898888800","SACHIN@GMAIL.COM",99999.99,2000.00);
		ftEmp.showDetails();
		ftEmp.sendMessage();
	
		System.out.println("\n");
		
		
		PartTimeEmployee ptEmp = new PartTimeEmployee("MS","DHONI","20-20,WEST,DELHI,INDIA","8888898900","MS@GMAIL.COM",120,80);
		ptEmp.showDetails();
		ptEmp.sendMessage();
	}

}
