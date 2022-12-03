package assignment1;

public abstract class Services {
	
	 ServiceProviders serviceProviders;
	
	
	public ServiceProviders getServiceProviders() {
		return serviceProviders;
	}

	public void setServiceProviders(ServiceProviders serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	public abstract void execute();
	

}
