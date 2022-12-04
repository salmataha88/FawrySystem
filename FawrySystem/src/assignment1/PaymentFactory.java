package assignment1;

public class PaymentFactory {
	
	public static Payment choosePayment(String method) {
		if(method == "credit card") {
			return new CreditCard();
		}
		
		return null;
	}

}
