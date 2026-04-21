package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInInterfaces {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (num) -> num%2==0;
		System.out.println(isEven.test(501));
		
		Function<Integer, Integer> squareOfANumber = (num)-> num*num;
		System.out.println(squareOfANumber.apply(501));
		
		
		
		Consumer<String> printName = (name) -> System.out.println(name);
		
		printName.accept("John");
		
		
		
		
	Supplier<Integer> getRandomNumber = ()->  (int )Math.random()+ 10;
	System.out.println(getRandomNumber.get());

	}
}
