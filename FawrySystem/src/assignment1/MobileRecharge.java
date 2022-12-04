package assignment1;


public class MobileServices extends Services {
	
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
		System.out.println("Mobile Services is executed..");
	}
	


}
