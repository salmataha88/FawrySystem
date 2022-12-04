package assignment1;

public class Vodafone implements ServiceProviders{
	int amount ;
	@Override 
	public void run() {
		System.out.println("vodafone is running..");
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override 
	public void getData(String mobile , int amount) {
		setAmount(amount);
	}
	@Override 
	public void pay(Payment method) {
		System.out.println("vodafone is running..");
		int amount = getAmount();
		method.pay(amount);
	}
}
