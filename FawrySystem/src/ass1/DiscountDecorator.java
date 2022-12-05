package ass1;


public  class DiscountDecorator implements Discount{
	
   	 private Discount discount;
   	 
   	public DiscountDecorator() {
   		
   	}
	 
	 public DiscountDecorator(Discount discount) {
		 this.discount = discount;
     }

	@Override
	public int applyDiscount(int Price) {
		return discount.applyDiscount(Price); 
	}
	

}
