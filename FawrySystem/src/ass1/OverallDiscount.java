package ass1;


public class OverallDiscount extends DiscountDecorator{
	
	public OverallDiscount() {
		super();
	}
 
    public OverallDiscount(Discount discount) {
		super(discount);
	}

	@Override
    public int applyDiscount(int Price) {
 
        return (Price*80)/100;   
       
    }

}
