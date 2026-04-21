package strings;

public class StringBufferAndBuilder {
	
	
	
//              	1.String            2.StringBuffer           3.StringBuilder
	 
	
// 1.Mutability     Immutable            Mutable                   Mutable

	
// 2.Memory         StringConstantPool   Heap                      Heap
                 // part of Heap
	
// 3.Thread Safe    Thread Safe           Thread Safe              Not Thread Safe
	
	
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		s1.concat("world");
		
		StringBuffer s2 = new StringBuffer("Hello");
		s2.append("world");
		
		
		StringBuilder s3 = new StringBuilder("Hello");
		s3.append("world");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		
		// memory
		
//1. Example 1	
		
		String p1 = new String("Hello");
		String p2 = new String("Hello");
		
		StringBuffer p3 = new StringBuffer("Hello");
		StringBuffer p4 = new StringBuffer("hello");
		
		
		StringBuilder p5  = new StringBuilder("Hello");
		StringBuilder p6  = new StringBuilder("Hello");
		
		
		System.out.println("understand memory part");

		System.out.println(p1==p2); // false
		System.out.println(p3==p4); // false
		System.out.println(p5==p6); // false
		
		
		System.out.println("content comparison");
		
//		Object is parent of all classes in java
//		object has equal method
//		String has its own implentation of equal method while string buffer and string builder doe not
		
		System.out.println(p1.equals(p2)); // true
		System.out.println(p3.equals(p4)); // false
		System.out.println(p5.equals(p6)); // false
		
		
		
//2.  Thread Safe
		
		String t1 = "Hello";
		String t2 = "Hello";
		

	}

}
