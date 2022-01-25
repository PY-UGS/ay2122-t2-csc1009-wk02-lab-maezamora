import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.println("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.println("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("a byte value is " +byteValue);
        System.out.println("a short value is " +shortValue);
        System.out.println("an int value is " +intValue);
        System.out.println("a long value is " +longValue);
        System.out.println("a float value is " +floatValue);
    }
}
