package algorithms;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        int arraySize;

        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int arraySum = 0;

        for(int i = 0; i < arraySize; i++){
            array[i] = scanner.nextInt();
            arraySum = arraySum + array[i];
        }
        scanner.close();

        System.out.println(arraySum);
    }
}
