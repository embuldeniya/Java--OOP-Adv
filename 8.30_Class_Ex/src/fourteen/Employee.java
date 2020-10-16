package fourteen;

public class Employee {
	
	
	protected int id;
	private String firstName;
	private String lastName;
	protected String address;
	protected String mobile;
	protected String email;
	
	static  int counter = 100;
	
	public Employee() {}

	public Employee(String firstName, String lastName, String address, String mobile, String email) {
		
		this.id = counter++ ;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	public String getFullName() {
		return firstName + " " +lastName;
	}
	
	public void sendMessage() {
		System.out.println("Salary added to account :..");
	}
	
	
	public void showDetails() {
		System.out.println("ID : " + id);
		System.out.println("Full Name : "+getFullName()); 
		System.out.println("Address : " + address);
		System.out.println("Email : " + email);
		System.out.println("Mobile : " + mobile);
	}
	
	

}
