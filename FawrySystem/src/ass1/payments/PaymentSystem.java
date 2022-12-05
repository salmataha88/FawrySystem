package ass1.payments;

import java.util.Scanner;

public class PaymentSystem {
	
	public Payment payment;
	public static String method;
	private static Scanner input = new Scanner(System.in);
	
	public void PayMethod(int amount) {
		System.out.println("Write your payment method: ");
		System.out.println("1.credit card  2.cash  3.wallet");
		method = input.nextLine();
		this.payment = PaymentFactory.choosePayment(method);
		
		if(method.equals("credit card") ) {
			System.out.println("Enter your card number: ");
			String cardNumber = input.nextLine();
			System.out.println("Enter expires date: ");
			String date = input.nextLine();
			payment = new CreditCard(date , cardNumber);
			payment.pay(amount);
		}
		else if(method.equals("cash")) {
			payment = new Cash();
			payment.pay(amount);
		}
		else if(method.equals("wallet")) {
			payment = new Wallet();
			payment.pay(amount); 
		}
	}

}
