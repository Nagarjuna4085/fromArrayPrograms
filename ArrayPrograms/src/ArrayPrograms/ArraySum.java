package ArrayPrograms;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0; // Our "Bucket"

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // Add current number to the bucket
        }

        System.out.println("The sum of all elements is: " + sum);
    }
}