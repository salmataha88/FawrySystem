package ass1.forms;

import ass1.Refund;
import ass1.payments.PaymentSystem;

public interface Form {
	
	public static final PaymentSystem paymentSystem = new PaymentSystem();
	public static final Refund refund = new Refund();
	public void run();
	public void formHandler();

}
