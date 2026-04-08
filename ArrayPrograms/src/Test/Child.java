package Test;

class Parent {
    Parent() {
        System.out.println("Parent Constructor Called");
    }
}
class Parent1 {
    Parent1() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    Child() {
        // Compiler implicitly adds super() here!
        System.out.println("Child Constructor Called");
    }
    public static void main(String[] args) {
		Child obj = new Child();
	
	}
}



// Execution: 
// new Child(); 
// Output: 
// Parent Constructor Called
// Child Constructor Called