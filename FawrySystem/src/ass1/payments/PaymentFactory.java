package ass1.payments;

public class PaymentFactory {
	
	public static Payment choosePayment(String method) {
		if(method == "credit card") {
			return new CreditCard();
		}
		else if (method == "cash")
			return new Cash();
		else if (method == "wallet")
			return new Wallet();
		
		return null;
	}

}
