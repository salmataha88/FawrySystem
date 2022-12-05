package ass1;

public class CurrentPrice implements Discount{
	private int price;

	
	public CurrentPrice(int price) {
		super();
		this.price = price;
	}

	@Override
	public int applyDiscount(int Price) {
		return price;
	}
	

}
