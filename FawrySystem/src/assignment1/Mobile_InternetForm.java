package assignment1;

import java.util.Scanner;

public class Mobile_InternetForm implements Form{
	
	private static Scanner input = new Scanner(System.in);
	private String mobile;
	private  int amount;
	private String providerChoice;
	private ServiceProviders serviceProviders;
	
	public Mobile_InternetForm() {
		this.formHandler();
	}
	

	@Override
	public void run() {
		System.out.println("Mobile and Internet Form..");
		
	}

	@Override
	public void formHandler() {
		System.out.println("Enter your Mobile number: ");
		mobile = input.nextLine();
		System.out.println("Choose Provider:");
		System.out.println("1.Vodafone" +"\n2.WE" +"\n3.Etisalat" +"\n4.Orange");
		providerChoice = input.nextLine();
		this.serviceProviders = ProviderFactory.chooseServiceProviders(providerChoice);
		System.out.println("Enter your Amount: ");
		amount = input.nextInt();
		paymentSystem.PayMethod(amount);
		System.out.println("Enter your y or n if you want to refund: ");
		String ans = input.next();
		//refund
	}
	
	
	

}
