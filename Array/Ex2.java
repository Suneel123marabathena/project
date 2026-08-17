package Array;

import java.util.*;

public class Ex2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("the array values are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
