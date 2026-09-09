package Array;

public class Array4 {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 23, 24, 35, 36 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
