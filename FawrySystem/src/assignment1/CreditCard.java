package assignment1;

public class CreditCard implements Payment{
	
	private String expireDate;
	private String CardNumber;
	private int creditAmount = 5000;
	
	
	public CreditCard() {
		
	}

	public CreditCard(String expireDate, String cardNumber) {
		super();
		this.expireDate = expireDate;
		CardNumber = cardNumber;
	}


	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	@Override
	public void pay(int Amount) {
		if(Amount >0 ) {
			System.out.println("Process is successed..");
			creditAmount -= Amount;
		}
		else {
			System.out.println("Process is Failed..");
		}
	}
	
	public void getfromWallet(int amount){
		
		
	}
	

}
