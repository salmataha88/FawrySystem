package assignment1;

public class CreditCard implements Payment{
	
	private String password;
	private String expireDate;
	private int ID;
	private int creditAmount = 5000;
	
	
	public CreditCard() {
		System.out.println("Enter you info..");
	}
	public CreditCard(String expireDate, String password , int iD) {
		this.password = password;
		this.expireDate = expireDate;
		this.ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public void pay(int Amount) {
		if(Amount >0 ) {
			System.out.println("Successed..");
			creditAmount -= Amount;
		}
		else {
			System.out.println("Failed..");
		}
	}
	

}
