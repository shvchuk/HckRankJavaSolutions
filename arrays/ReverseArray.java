package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int i = scanner.nextInt();
        int[] array = new int[i];

        System.out.print("Enter " + i + " number into the array : ");
        for(int j = 0; j < i; j++ ){
            array[j] = scanner.nextInt();
        }

        System.out.println("Reversed array: ");
        for(int k = i - 1; k >= 0; k--){
            System.out.print(array[k]+" ");
        }
    }
}
