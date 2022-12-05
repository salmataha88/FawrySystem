package ass1.services;

public class ServicesFactory {
	
	public static Services chooseServices(String Service) {
		
		if(Service == "mobile recharge")
			return new MobileRecharge();
		else if(Service == "internet payment")
			return new InternetPayment();
		else if(Service == "landline")
			return new Landline();
		else if(Service == "donation")
			return new Donation();
		
		return null;
	}

}
