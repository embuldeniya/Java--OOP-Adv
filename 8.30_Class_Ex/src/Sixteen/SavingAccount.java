package Sixteen;

public class SavingAccount extends BankAccount implements WithdrawAction, DepositAction {

	private double balance = 0.0;
	double initialAmount = 1000;
	private final int TIME = 30;

	public SavingAccount() {
	}

	public SavingAccount(String fName, String lName, String dob) {
		super(fName, lName, dob);
		this.balance = initialAmount;
	}

	@Override
	public void setBalance(double x) {
		this.balance = x;

	}

	@Override
	public double getBalance() {

		return this.balance;

	}

	@Override
	public void depositAmount(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance() + amount);
	}

	/*
	 * logic error
	 * 
	 * @Override public void withdrawAmount(double amount, int time) {
	 * 
	 * if (time >= MINI_TIME ) { if (getBalance () >= amount) { double withdraw =
	 * getBalance() - amount; setBalance(withdraw); } else {
	 * System.out.println("Not Enough Money left"); } } else {
	 * System.out.println("Need to wait more time before withdrawing");
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	
	public void withdrawAmount(double amount, int time ) {

		if (time>= TIME) {
			
			if (balance >= amount) {
				
				double withdraw = balance - amount ;
				this.balance = withdraw;
				
			}
			
			else {
				System.out.println("Not enough Money left ");
				
			}
		}
		else {
			System.out.println("Need to wait more time before withdrawing");
			
		}
	}

	

}
