package ArrayPrograms;

public class MatrixAddition {
    public static void main(String[] args) {
        // Defining two 3x3 matrices
        int[][] a = {
            {1, 3, 4},
            {2, 4, 3},
            {3, 4, 5}
        };
        int[][] b = {
            {1, 3, 4},
            {2, 4, 3},
            {1, 2, 4}
        };

        // Matrix to store the sum
        int[][] sum = new int[3][3];

        // Adding and printing the result
        System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < 3; i++) { // Row loop
            for (int j = 0; j < 3; j++) { // Column loop
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}