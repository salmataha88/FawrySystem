package ass1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User implements Observer{
	
	private String UserName;
	private String Email;
	private String Password;
	private int balance;
	
	private Subject subject;
	
	public static final HashMap<String, String> LoginUser = new HashMap<>();
	public List<String>userList;

	public User() {
		UserName = "";
		Email="";
		Password="";
		userList = new ArrayList<>();
		
	}
	public User(String userName, String email, String password) {
		UserName = userName;
		Email = email;
		Password = password;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public User(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this); 
    }
	
	@Override
	public void update(int balance) {
		this.balance = balance; 
		showData();
	}
	
	private void showData() {
        System.out.println("Your Balance: " + this.balance);
    }
	
	public void register(User user) {
		LoginUser.put(user.getUserName(), user.getPassword());
	}
	
	public HashMap<String, String> getUserMap(){
		return LoginUser;
	}
	

}
