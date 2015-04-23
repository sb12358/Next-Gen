package test;

import java.util.ArrayList;

public class testing {
	
	public static void main(String[] args){
		ArrayList<User> list = new ArrayList<User>();
		for(int i = 0; i < 7; i++){ //loop through all the data in database
			User x = new User("Matt Nelson", "mnelson", "password", 1); 
			list.add(x);
		}
		
		for(int i = 0; i < 7; i++){
			System.out.println(list.get(i).toString()); //for testing
		}	
	}
}
