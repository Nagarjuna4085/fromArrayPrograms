package Test;

class User {
    String username;
    
    // Parent constructor requires a name
    User(String name) {
        this.username = name;
        System.out.println("User object created for: " + name);
    }
}

class Admin extends User {
    String role;

    Admin(String name, String role) {
        // We MUST manually call super(name) because 
        // the parent doesn't have a default empty constructor.
        super(name); 
        this.role = role;
        System.out.println("Admin role assigned: " + role);
    }
    public static void main(String[] args) {
		Admin child = new Admin("John Doe","Developer");
		System.out.println(child.username);
	}
    
}