import java.util.Scanner;

public class MatrixMultiplicationPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with the specified dimensions
        int[][] matrix = new int[rows][columns];

        // Populate the array using a nested for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i * j; // Set the element to i * j
            }
        }

        // Print the array to confirm the pattern
        System.out.println("Generated 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t"); // Print the value with a tab between columns
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}