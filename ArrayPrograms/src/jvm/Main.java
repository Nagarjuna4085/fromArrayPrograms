package jvm;

public class Main {
	public static void main(String[] args) {
		// before object creation heap is empty

		// stack memoery is empty

		Employee e1 = new Employee(); // then heap area contains instance variables with default values

		// here e1 will be the local variable of current main method
		// so e1 will store in stack

		// new Employee() this is actual object
		// e1 is reference variable

		// so object store in heap but reference stored in stack with object address

		e1.name = "John"; // object is updated in heap
		e1.age = 26; // // object is updated in heap
		
		Employee e2 = new Employee();   
		
//	stack -> has e1 and e2 with heap object addresses
//	heap contains actual objects
		
		e2.name = "Doe";
		e2.age = 26;
		
//		till now the stack frame is main method -> stack[main]
//		stack -> Last In First Out (LIFO)
		
		e2.workHours();
		// not the frame is created for workHours method
		
		
		
		

	}

}
