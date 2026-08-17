package Array;

public class Ex1 {
    public static void main(String args[]) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " before - " + arr[i]);
        }
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " after - " + arr[i]);
        }
    }
}
