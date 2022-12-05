package assignment1;


public class MobileRecharge extends Services {
	
	private String mobile;
	private  int amount;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void execute() {
		System.out.println("Mobile Service is executed..");
	}
	
    @Override
	public Form createform() {
		form = new Mobile_InternetForm();
		return form ;
	}
	


}
