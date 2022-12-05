package ass1.providers;

public class ProviderFactory {
	
	public static ServiceProviders chooseServiceProviders(String provider) {
		
		if(provider.equals("vodafone"))
			return new Vodafone();
		else if(provider.equals("we"))
			return new WE();
		else if(provider.equals("orange"))
			return new Orange();
		else if(provider.equals("etisalat"))
			return new Etisalat();
		
		
		return null;
	}

}
