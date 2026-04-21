package wrapperClasses;

public class Test {
	public static void main(String[] args) {
//		int -> Integer
//		byte -> Byte
//		long -> Long
//		float -> Float
//		double -> Double
//		char -> Char
//		short -> Short
		
//		and there are many
		
		
//		wrapper clases help to convert to objects from primitives
		
		// boxing
		int a = 10;
		
		Integer obj = Integer.valueOf(a);
		
		// auto boxing
		Integer obj1 = a;
		
		
		
//		from objects to primitives
		
		// manual - unboxing  
		int x = obj.intValue();
		
		// auto - unboxing
		
		int y = obj;  // or obj1
		
		
		
		
//		example
		
	}

}
