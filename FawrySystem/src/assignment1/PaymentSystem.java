package assignment1;

import java.util.Scanner;

public class PaymentSystem {
	
	public Payment payment;
	public static String method;
	private static Scanner input = new Scanner(System.in);
	
	public void PayMethod(int amount) {
		System.out.println("Enter your payment method: ");
		System.out.println("1.credit card  2.cash  3.wallet");
		method = input.nextLine();
		this.payment = PaymentFactory.choosePayment(method);
		System.out.println("Enter your  method: "+ method);
		if(method.equals("credit card") ) {
			System.out.println("Enter your card number: ");
			String cardNumber = input.nextLine();
			System.out.println("Enter expires date: ");
			String date = input.nextLine();
			payment = new CreditCard(date , cardNumber);
			payment.pay(amount);
		}
		else if(method == "cash") {
			
		}
		else if(method == "wallet") {
			
		}
		else System.out.println("Enter your  method: "+ method);
	}

}
