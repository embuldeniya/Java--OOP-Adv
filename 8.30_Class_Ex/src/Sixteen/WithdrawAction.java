package Sixteen;

public interface WithdrawAction {

	int MINIMUM_AMOUNT = 100;
	String ERROR_MSG = "Withdrawl should be more than " + MINIMUM_AMOUNT;
	int MINI_TIME = 30;

	default void withdrawAmount(double amount) {
	}
	default void withdrawAmount(double amount, int time ) {
	}
	

}
