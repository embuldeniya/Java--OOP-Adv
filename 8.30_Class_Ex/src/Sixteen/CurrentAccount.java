package Sixteen;

public class CurrentAccount extends BankAccount implements WithdrawAction, DepositAction {

	private double balance = 0.0;

	public CurrentAccount() {
	}

	public CurrentAccount(String fName, String lName, String dob, double balance) {
		super(fName, lName, dob);
		this.balance = balance;
	}

	public void setBalance(double x) {
		this.balance = x;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void withdrawAmount(double amount) {

		if (amount >= MINIMUM_AMOUNT) {

			if (getBalance() >= amount) {
				double withdraw = balance - amount;
				this.balance = withdraw;
				// setBalance(withdraw);
			} else {
				System.out.println("Not Enough Money left");
			}

		} else {
			System.out.println(ERROR_MSG);
		}

	}

	@Override
	public void depositAmount(double amount) {

		setBalance(getBalance() + amount);

	}

}
