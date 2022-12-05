package assignment1;

import java.util.Scanner;

public class DonationForm implements Form {
	private static Scanner input = new Scanner(System.in);
	private String place;
	private  int amount;
	private int choice;
	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public  DonationForm() {
		this.formHandler();
	}
	
	@Override
	public void formHandler() {
		System.out.println("Enter your Place: ");
		place = input.nextLine();
		System.out.println("Choose Donation: ");
		System.out.println("1.Schools " + "\n" + "2.NGOS" + "\n3.Cancer");
		choice = input.nextInt();
		setChoice(choice);
		System.out.println("Enter your Amount: ");
		amount = input.nextInt();
		paymentSystem.PayMethod(amount);
		System.out.println("Enter your y or n if you want to refund: ");
		String ans = input.next();
		//refund
		
		
	}
	
	@Override
	public void run() {
		System.out.println("Landline Form..");
		
	}
	
}
