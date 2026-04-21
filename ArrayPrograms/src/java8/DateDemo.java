package java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
