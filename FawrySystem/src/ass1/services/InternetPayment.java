package ass1.services;

import ass1.forms.Form;
import ass1.forms.MobileForm;

public class InternetPayment extends Services{

	private String landline;
	private  int amount;
		
	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void execute() {
		System.out.println("Internet Payment is executed..");
	}

	@Override
	public Form createform() {
		form = new MobileForm();
		return form;
	}


	

}
