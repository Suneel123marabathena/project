import java.util.*;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Byte value:");
        byte a = scan.nextByte();
        System.out.println("The byte value is: " + a);

        System.out.println("Enter the Short value: ");
        short b = scan.nextShort();
        System.out.println("The short value is: " + b);

        System.out.println("Enter the Integer value:");
        int c = scan.nextInt();
        System.out.println("The integer value is: " + c);

        System.out.println("Enter the Long value:");
        long d = scan.nextLong();
        System.out.println("The Long value is: " + d);

        System.out.println("Enter the Float value:");
        float e = scan.nextFloat();
        System.out.println("The float value is: " + e);

        System.out.println("Enter the Double value:");
        double f = scan.nextDouble();
        System.out.println("The double value is: " + f);

        System.out.println("Enter the Boolean value is:");
        boolean g = scan.nextBoolean();
        System.out.println("The boolean value is: " + g);

        System.out.println("Enter the Char value:");
        char ch = scan.next().charAt(0);
        System.out.println("The char value is: " + ch);

        System.out.println("Enter the String value:");
        String sh = scan.next();
        System.out.println("The String value is: " + sh);
    }
}