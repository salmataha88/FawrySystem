package assignment1;

public abstract class Landline implements Services {
	
	@Override
	public void execute() {
		System.out.println("Donations..");
	}
	public abstract void getData(String place , int amount) ;
	public abstract void pay(Payment method);

}
