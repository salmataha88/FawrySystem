package assignment1;

public class ProviderFactory {
	
	public static ServiceProviders chooseServiceProviders(String provider) {
		if(provider == "vodafone")
			return new Vodafone();
		else if(provider == "we")
			return new WE();
		else if(provider == "orange")
			return new Orange();
		else if(provider == "etisalat")
			return new Etisalat();
		
		
		return null;
	}

}
