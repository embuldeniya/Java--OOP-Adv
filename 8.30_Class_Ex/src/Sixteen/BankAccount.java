package Sixteen;

abstract class BankAccount {

	private String fName;
	private String lName;
	private String dob;

	public BankAccount() {
	}

	public BankAccount(String fName, String lName, String dob) {

		this.fName = fName;
		this.lName = lName;
		this.dob = dob;

	}

	abstract public void setBalance(double x);

	abstract public double getBalance();

	public void showBalance() {

		System.out.println("Mr/Miss " + fName + " " + lName);

		System.out.println("Your have " + getBalance() + " in your account");

	}

}
