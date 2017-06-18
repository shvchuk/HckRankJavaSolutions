package algorithms;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        int [][] matrix;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        int n = userInput.nextInt();

        matrix = new int[n][n];

        for(int i = 1; i <= n; i++){
            System.out.println("Enter the " + i + " row:");
            for (int j = 0; j < n; j++){
                int data = userInput.nextInt();
                matrix[i-1][j] = data;
            }
        }

        int primaryDiagonalSum = 0;
        int j = 0;
        for(int i = 0; i < matrix.length; i ++){
            primaryDiagonalSum += matrix[i][j];
            j++;
        }

        int secondaryDiagonalSum = 0;
        int k = 0;
        for(int i = matrix.length - 1; i >= 0 ; i--){
            secondaryDiagonalSum += matrix[i][k];
            k++;
        }

        int difference = primaryDiagonalSum - secondaryDiagonalSum;

        if(difference < 0 ) difference = difference * -1;


        System.out.println("Your matrix : ");
        printMatrix(matrix);
        System.out.println("Primary diagonal sum: " + primaryDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
        System.out.println("Difference: " + difference);

    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
