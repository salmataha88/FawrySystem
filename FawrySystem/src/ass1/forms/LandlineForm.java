package ass1.forms;

import java.util.Scanner;

import ass1.User;

public class LandlineForm implements Form{
	
	private static Scanner input = new Scanner(System.in);
	private String landlineNumber;
	private  int amount;
	private int choice;
	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public LandlineForm() {
		this.formHandler();
	}
	
	@Override
	public void formHandler() {
		System.out.println("Enter your Number: ");
		landlineNumber = input.nextLine();
		System.out.println("Choose Receipt: ");
		System.out.println("1. Monthly Receipt " + "\n" + "2. Quarter Receipt");
		choice = input.nextInt();
		setChoice(choice);
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
	
	
	@Override
	public void run() {
		System.out.println("Landline Form..");
		
	}
	
	

}
