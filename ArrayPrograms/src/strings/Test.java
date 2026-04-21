package strings;

public class Test {
	public static void main(String[] args) {
		
		// string are immutable
//		if you change ,new string is created and points to new created one

		String name = "John";
		System.out.println(name);
		String name1 = "John";
		String name2 = "John";
		System.out.println("before change");
		System.out.println("name1 " + name1);

		name = "Doe";
		
		System.out.println("after change");
		
		System.out.println("name1 " + name1);
		
		
		
//		edge case
		String s1 = "Hello";
		String s2 = s1+"world"; // here s2 create the objecvt
		// hello and world will exists in string constant pool
		
		

	}
}
