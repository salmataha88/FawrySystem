package assignment1;

import java.util.List;

public class Database {
	
	private List<User> UserDatabase;
	
	public Database(List<User> peopleDatabase) {
        this.UserDatabase = peopleDatabase;
    }
    public void addPerson(User User){
        this.UserDatabase.add(User);
    }
    public List<User> getPeopleDatabase(){
        return this.UserDatabase;
    }

}
