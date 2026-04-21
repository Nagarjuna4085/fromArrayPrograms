package stringConstantPool;

public class Test {
// if you create string using literral -> store in sting constant pool
//	if string liter is same but defined with many reference - > all references are pointing to same string constant

	// with new key word
//	1. always created two copies -> one in string constant pool and another in heap but reference is point to the heap

//	string constant pool is part of hep which make saves the memory and improve the performances

//	== checks the reference or address

//	equals check the actual object or value

// compareTo return int 

	public static void main(String[] args) {
		String name1 = "John";
		String name2 = "John";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));

		String city1 = new String("Enakanlda");
		String city2 = new String("Enakanlda");

		System.out.println(city1 == city2);

		System.out.println(city1.equals(city2));

		System.out.println(name1.compareTo(name2)); // return int

//		special case

		String name3 = "doe"; // reference points to SCP
		String name4 = new String("doe"); // here one copy in heap but another one points to the exising SCP

		System.out.println(name3 == name4); // but answer is false

		System.out.println(name3.equals(name4)); // true

		// edge case
		String name5 = new String("doe");

		// re assign
		name5 = "doe";

		System.out.println(name3 == name5); // here now name5 will point to SCP so name 3 and name 5 point same so anwser is true

		System.out.println(name3.equals(name5)); 

		
//		!!!!!! important case !!!!!!!!!!!!!!!!!1
		// let say one of string is null
		name5 = null;
		
		System.out.println(name5.equals(name3));  // null pointer exception error
		
		System.out.println(name3.equals(name5)); // no error
	}

}
