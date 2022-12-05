package assignment1;

public class Wallet implements Payment{
	
	private int balance = 0;
	
	public int getBalance() {
		return balance;
	}

	public void addFunds(int funds) {
		balance += funds;
		System.out.println("Process is succeessed..");
	}

	@Override
	public void pay(int Amount) {
		if(Amount <= balance) {
			balance -= Amount;
			System.out.println("Process is succeessed..\n" + "Your balance becomes: " + balance);
		}
		else if(Amount > balance) {
			System.out.println("Sorry your balance is not enough to pay..\n");
		}
	}

}
