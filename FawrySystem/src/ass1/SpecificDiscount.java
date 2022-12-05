package ass1;


public class SpecificDiscount extends DiscountDecorator{
	 
    public SpecificDiscount(Discount discount) {
        super(discount);
    }
    
    @Override
    public int applyDiscount(int Price) {
 
        int discountedPrice = super.applyDiscount(Price);
        return (discountedPrice*90)/100;
        
    } 

}
