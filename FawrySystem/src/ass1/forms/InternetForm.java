package ass1.forms;

import java.util.Scanner;

import ass1.User;
import ass1.providers.ProviderFactory;
import ass1.providers.ServiceProviders;

public class InternetForm implements Form{
	
	private static Scanner input = new Scanner(System.in);
	private String homeNumber;
	private  int amount;
	private String providerChoice;
	public ServiceProviders serviceProviders;
	
	public InternetForm() {
		this.formHandler();
	}
	

	@Override
	public void run() {
		System.out.println("Internet Form..");
		
	}

	@Override
	public void formHandler() {
		System.out.println("Enter your Home number: ");
		homeNumber = input.nextLine();
		System.out.println("Write your Provider:");
		System.out.println("1.Vodafone" +"\n2.WE" +"\n3.Etisalat" +"\n4.Orange");
		providerChoice = input.nextLine();
		serviceProviders = ProviderFactory.chooseServiceProviders(providerChoice);
		serviceProviders.run();
		System.out.println("Enter your Amount: ");
		amount = input.nextInt();
		paymentSystem.PayMethod(amount);
		System.out.println("Enter your y or n if you want to refund: ");
		String ans = input.next();
		//refund
		if(ans.equals("y")) {
			User user = new User(refund);
			refund.setRefundBalance(amount);
		}
		else return; 
	}
	
}
