package assignment1;

public class Landline extends Services {
	
	private String landline;
	private  int amount;
	private ReceiptServices receiptServices ;
		
	public String getLandline() {
		return landline;
	}

	public void setLandline(String mobile) {
		this.landline = mobile;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	@Override
	public void execute() {
		System.out.println("landline is executed..");
		
	}


	public Form createform() {
		form = new LandlineForm();
		return form ;
	}

	public void setReceipts() {
		int receipt = ((LandlineForm)form).getChoice();
		if(receipt == 1) {
			this.receiptServices = new MonthlyReceipt();
			this.receiptServices.execute();
		}		
		else if(receipt == 2) {
			this.receiptServices = new QuarterReceipt();
			this.receiptServices.execute();
		}
		
	}


}
