package streams;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		list.stream()
	    .filter(x -> x > 20)
	    .forEach(System.out::println);
		
		list.stream().filter(x -> x>=20).forEach(System.out::println);

	}

}
