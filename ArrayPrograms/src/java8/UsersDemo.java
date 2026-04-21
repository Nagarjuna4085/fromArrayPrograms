package java8;

import java.util.Optional;

public class UsersDemo {
	public static void main(String[] args) {
		Users u = new Users();
		
//		with out Optinal
		
//		User userDetails = u.getUser(3);
		
//		System.out.println(userDetails.getName());
		
		
		Optional<User> userDetails = u.getUser(3);
		
		userDetails.ifPresent(user -> System.out.println(user.getName()));
		
		
		
				
	}

}
