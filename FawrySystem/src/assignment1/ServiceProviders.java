package assignment1;

public abstract class ServiceProviders {
	
	Payment payment;
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public  void run() {
		System.out.print("sal");
	};
	
	public void getData(String mobile , int amount) {
		System.out.print(mobile +" " + amount);
	}
	

}
