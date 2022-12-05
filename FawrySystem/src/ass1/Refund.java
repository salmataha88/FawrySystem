package ass1;

import java.util.ArrayList;
import java.util.List;

import ass1.payments.Wallet;

public class Refund implements Subject {
	
	private int refundBalance;
	private List<Observer> observerList;
	
	public Wallet wallet = new Wallet();
	
	public Refund() {
		this.observerList = new ArrayList<>();
	}


	public void setRefundBalance(int refundBalance) {
		this.refundBalance = refundBalance;
		notifyAllObserver();
	} 
	
	public int totalBalance(int funds){
		this.refundBalance = funds;
		wallet.addFunds(refundBalance);
		return wallet.getBalance();
	}
	
	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
	}

	@Override
	public void notifyAllObserver() {
		for (Observer o : this.observerList){
            o.update(totalBalance(refundBalance));
        }
	}
	

}
