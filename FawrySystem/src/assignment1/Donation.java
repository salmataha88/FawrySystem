package assignment1;

public class Donation extends Services {
	
	private String place;
	private  int amount;
	private DonationServices donationServices ;
	
		
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	@Override
	public void execute() {
		System.out.println("Donation services are executed..");
	}
	
	@Override
	public Form createform() {
		form = new DonationForm();
		return form;
	}

	public void setDonations() {
		int donation =((DonationForm)form).getChoice();
		if(donation == 1) {
			this.donationServices = new Schools();
			this.donationServices.execute();
		}
		else if(donation == 2) {
			this.donationServices = new NGOS();
			this.donationServices.execute();
		}
		else if(donation == 3) {
			this.donationServices = new Cancer();
			this.donationServices.execute();
		}
	}

	

}
