package Tasks;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrices
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int columns = scanner.nextInt();

        // Create two matrices of the given dimensions
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        // Read the elements of Matrix A
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Read the elements of Matrix B
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Display the matrices
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Add Matrix A and Matrix B
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of Matrix A and Matrix B:");
        displayMatrix(sum);

        scanner.close();
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }
}