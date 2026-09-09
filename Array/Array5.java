package Array;

public class Array5 {
    public static void main(String[] args) {
        int arr[] = { 22, 33, 55, 34, 12 };
        int element = 55;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("element is here");
        } else {
            System.out.println("element is not found");
        }
    }
}
