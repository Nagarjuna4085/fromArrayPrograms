package stringprograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        // 1. Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // 2. Define the format for the Date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        // 3. Define the format for the Time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

        // 4. Print the results
        System.out.println("Current Date and Time :");
        System.out.println(now.format(dateFormatter));
        System.out.println(now.format(timeFormatter));
    }
}