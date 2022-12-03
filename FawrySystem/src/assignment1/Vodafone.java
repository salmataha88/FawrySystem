package assignment1;

public class Vodafone extends ServiceProviders{

	public void run() {
		System.out.print("vodafone is running..");
	}
	public void getData(String mobile , int amount) {
		setPayment(new CreditCard());
	}
	
}
