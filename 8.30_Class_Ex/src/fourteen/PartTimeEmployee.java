package fourteen;

public class PartTimeEmployee extends Employee {
	
	private double amountPerHour;
	private int hoursWorked;
	
	
	public PartTimeEmployee() {}


	public PartTimeEmployee(String firstName, String lastName, String address, String mobile, String email ,double amountPerHour, int hoursWorked) {
		super(firstName, lastName, address, mobile, email);
		this.amountPerHour = amountPerHour;
		this.hoursWorked = hoursWorked;
	}
	
	public double computeSal() {
		return amountPerHour * hoursWorked;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Gross Salary : " + computeSal());
	}
	

}
