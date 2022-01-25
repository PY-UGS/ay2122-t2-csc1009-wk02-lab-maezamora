import java.util.Scanner;

public class Qn1a {
    final static double PI=3.14159;

    public static void main(String[] args) {
        double area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radiusValue = input.nextFloat();

        area=radiusValue*radiusValue*PI;

        System.out.println("The area for the circle of radius " +radiusValue+ " is " +area);

    }
}
