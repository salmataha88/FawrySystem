package ass1.forms;

import java.util.Scanner;

import ass1.Discount;
import ass1.OverallDiscount;
import ass1.User;
import ass1.providers.ProviderFactory;
import ass1.providers.ServiceProviders;

public class MobileForm implements Form{
	
	private static Scanner input = new Scanner(System.in);
	private String mobile;
	private  int amount;
	private String providerChoice;
	public ServiceProviders serviceProviders;
	public Discount discount;
	
	public MobileForm() {
		this.formHandler();
	}
	

	@Override
	public void run() {
		System.out.println("Mobile Form..");
		
	}

	@Override
	public void formHandler() {
		System.out.println("Enter your Mobile number: ");
		mobile = input.nextLine();
		System.out.println("Write your Provider:");
		System.out.println("1.Vodafone" +"\n2.WE" +"\n3.Etisalat" +"\n4.Orange");
		providerChoice = input.nextLine();
		serviceProviders = ProviderFactory.chooseServiceProviders(providerChoice);
		serviceProviders.run();
		System.out.println("Enter your Amount: ");
		amount = input.nextInt();
		discount = new OverallDiscount();
		int newAmount = discount.applyDiscount(amount);
		System.out.println("You have discount on this service..\n" + "Your amount now is " +newAmount);
		paymentSystem.PayMethod(newAmount);
		System.out.println("Enter your y or n if you want to refund: ");
		String ans = input.next();
		
		if(ans.equals("y")) {
			User user = new User(refund);
			refund.setRefundBalance(newAmount);
		}
		else return; 
	}
	
	
	

}
