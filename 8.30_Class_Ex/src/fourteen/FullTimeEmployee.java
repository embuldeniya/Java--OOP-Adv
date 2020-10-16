package fourteen;

public class FullTimeEmployee extends Employee {
	
	
	private double basic;
	private double bonus;
	
	public FullTimeEmployee() {}
	
	
	
	
	public FullTimeEmployee( String firstName, String lastName, String address, String mobile, String email, double basic, double bonus) {
		super(firstName, lastName, address, mobile, email);
		this.basic = basic;
		this.bonus = bonus;
	}

	public double computeSal() {
		return basic +bonus;
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Gross Salary : " + computeSal());
	}
	
	

}
