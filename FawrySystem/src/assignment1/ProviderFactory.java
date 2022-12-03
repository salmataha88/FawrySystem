package assignment1;

public class ProviderFactory {
	
	public static ServiceProviders chooseServiceProviders(String provider) {
		if(provider == "vodafone")
			return new Vodafone();
		
		return null;
	}

}
