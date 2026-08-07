import java.util.*;

public class nextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your height:");
        float height = scan.nextFloat();
        System.out.println("Your height is: " + height);

        scan.nextLine();
        System.out.println("Enter your full name:");
        String name = scan.nextLine();
        System.out.println("your full name is: " + name);
    }
}
