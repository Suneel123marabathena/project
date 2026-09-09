package Array;

import java.util.*;

public class twoDArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        int arr[][] = new int[size1][size2];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}