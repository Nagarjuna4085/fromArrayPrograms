package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Users {
	
	List<User> users = new ArrayList<>();
	
	public Users() {
		// TODO Auto-generated constructor stub
		
		
		users.add(new User(1,"john"));
	}
	
	
	
	public Optional<User> getUser(int id) {
		
		for(User u:users) {
			if(u.getId() == id) {
				return Optional.of(u);
			}
			
		}
		
		return Optional.empty();
	}

}
