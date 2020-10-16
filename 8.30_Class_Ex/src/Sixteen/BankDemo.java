package Sixteen;

public class BankDemo {

	public static void main(String[] args) {

		CurrentAccount cur1 = new CurrentAccount("John", "Doe", "12/05/1989", 500.00);

		cur1.showBalance();
		cur1.withdrawAmount(50.00);
		cur1.showBalance();
		cur1.depositAmount(600.00);
		cur1.showBalance();

		System.out.println("\n");
		SavingAccount sav1 = new SavingAccount("Jane", "Doe", "9/12/1972");
		sav1.showBalance();
		sav1.withdrawAmount(500.00, 20);
		sav1.showBalance();
		sav1.depositAmount(500.00);
		sav1.showBalance();

	}

}
