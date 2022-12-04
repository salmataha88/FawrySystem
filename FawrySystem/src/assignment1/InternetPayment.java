package assignment1;

public class InternetPayment implements Services{

	private String landline;
	private  int amount;
	private ServiceProviders serviceProviders;
		
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

	public void setServiceProviders(ServiceProviders serviceProviders) {
		this.serviceProviders = serviceProviders;
	}
	
	@Override
	public ServiceProviders chooseProviders(String provider) {
		return this.serviceProviders = ProviderFactory.chooseServiceProviders(provider);
	}
	
	@Override
	public void setPayment(String method) {
		this.serviceProviders.getData(getLandline(), getAmount());
		Payment paymethod = PaymentFactory.choosePayment(method);
		this.serviceProviders.pay(paymethod);
	}
	
	@Override
	public void execute() {
		System.out.println("Internet Payment is executed..");
	}

}
