package ass1;

import java.util.List;
import java.util.Scanner;

import ass1.forms.Form;
import ass1.payments.Wallet;
import ass1.services.Donation;
import ass1.services.InternetPayment;
import ass1.services.Landline;
import ass1.services.MobileRecharge;
import ass1.services.ServicesFactory;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
	
	
	    static Scanner myObj = new Scanner(System.in);
	    private static final Scanner sc = new Scanner(System.in);
	    public static Refund refundSubject = new Refund();
	    private static User user1 = new User(refundSubject);
	    public static List<User> users=new ArrayList<>();
	    public static MobileRecharge mobileRechaServiceFactory = new MobileRecharge();
	    public static InternetPayment internetPaymentFactory = new InternetPayment();
	    public static Landline landlineServiceFactory = new Landline();
	    public static Donation donationServiceFactory = new Donation();
	    
	    
	    
	    public static void prompt() {

	        System.out.println("Our Services: ");
	        System.out.println("1- Mobile Recharge Services");
	        System.out.println("2- Internet Payment Services");
	        System.out.println("3- Landline Services ");
	        System.out.println("4- Donation Services ");
	        System.out.println("5- Add funds to wallet ");
	        System.out.println("Enter your service: ");
	        int switchNum = myObj.nextInt();
	        switch (switchNum) {
	            case 1:
	                System.out.println("---Mobile Recharge Services---");
	                ((MobileRecharge)mobileRechaServiceFactory).execute();
	                Form mobileForm = mobileRechaServiceFactory.createform();
	                break;
	                
	            case 2:
	                System.out.println("---Internet Payment Services---");
	                ((InternetPayment) internetPaymentFactory).execute();
	                Form internetForm = internetPaymentFactory.createform();
	                break;
	                
	            case 3:
	                System.out.println("---Landline Service---");
	                ((Landline) landlineServiceFactory).execute();
	                Form landlineForm = landlineServiceFactory.createform();
	                ((Landline) landlineServiceFactory).setReceipts();   
	                break;
	                
	            case 4:
	                System.out.println("---Donation Services---");
	                ((Donation) donationServiceFactory).execute();
	                Form donationForm = donationServiceFactory.createform();
	                ((Donation) donationServiceFactory).setDonations();
	                break;
	                
	            case 5:
	                System.out.println("---Add funds to wallet---");
	                System.out.println("Enter amounts of Funds please: ");
	                int fund = myObj.nextInt();
	                refundSubject.totalBalance(fund);
	                
	                
	        }
	    }
	    

	    public static void Refund() {
	    	System.out.println("Enter y or n if you want to refund: ");
	    	String ans = myObj.nextLine();
	    	if(ans.equals("y")){
	    		System.out.println("Enter amount of days that you have this service: ");
	    		int day = myObj.nextInt();
	    		if(day <= 14) {
	    			System.out.println("Enter amount of service: ");
	    			int amount = myObj.nextInt();
	    			refundSubject.setRefundBalance(amount);
	    		}
	    		else System.out.println("Sorry you cannot refund this service..");
	    	}
	    	else return;
	
	    }

	    
		public static void main(String[] args) {
			
			
			
			int choice = 1;
	        while (choice != 3) {
	            user1.userList = new ArrayList<>(); //
	            System.out.println("\n------Welcome to fawry system------");
	                    System.out.println("\n1- Sign up");
	                    System.out.println("2- Log in");
	                    System.out.println("3- Exit");
	                    System.out.println("Enter 1, to sign up or 2 to log in, 3 for exit");
	                    int temp = sc.nextInt();
	                    switch (temp) {
	                        case 1:
	                            register();
	                            prompt();
	                            users.add(user1);
	
	                            break;
	                        case 2:
	                            login();
	                            prompt();
	                            break;
	                        case 3:
	                            return;
	                        default:
	                            System.out.println("Unexpected value: " + temp);
	                            break;
	                    }
	                    break;
	                
	        }
	        prompt();
			
			
	
		}
		
		
		
		public static void register() {
			System.out.println("sign up...");
	        System.out.println("Please enter Email");
	        String email = sc.next();
	        System.out.println("Please enter username");
	        String username = sc.next();
	        System.out.println("Please enter password");
	        String password = sc.next();
	        User newMember = new User(username, email, password);
	        user1.register(newMember);
	
	        login(); // call login after registering
	    }
	
		
		
	    public static void login() {
	    	System.out.println("Login...");
	        System.out.println("Username:");
	        String username = sc.next();
	        System.out.println("Password:");
	        String pass = sc.next();
	        // User x = new User();
	        HashMap<String, String> loginUser = user1.getUserMap();
	        System.out.println("hash : " + loginUser); //
	        find(loginUser, username, pass);
	    }
	    
	 
	    
	    public static void find(HashMap<String, String> loginUser, String username, String pass) {
	        boolean f = false;
	        for (String i : loginUser.keySet()) {
	            if (i.equals(username) && loginUser.get(i).equals(pass)) {
	                System.out.println("User is Found!");
	                f = true;
	                break;
	            }
	        }
	        if (!f) {
	            System.out.println("User Not Found. please \t 1-Login Again -  2-sign up");
	            int c = sc.nextInt();
	            if (c == 1)
	                login();
	            else if (c == 2)
	                register();
	        }
	    }
		
	
	
}
