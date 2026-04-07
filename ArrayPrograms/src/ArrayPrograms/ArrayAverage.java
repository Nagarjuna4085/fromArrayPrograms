package ArrayPrograms;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // 1. Calculate the Sum
        for (int num : numbers) {
            sum += num;
        }

        // 2. Calculate the Average
        // We cast 'sum' to double to ensure we get decimal results
        double average = (double) sum / numbers.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}