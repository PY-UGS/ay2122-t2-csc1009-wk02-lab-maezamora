import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        float[] array = new float[3];
        float average;
        float sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        for(int i=0; i<array.length; i++){
            array[i]=input.nextFloat();
            sum += array[i];

        }

        average = (sum/array.length);
        System.out.println("The average of "+array[0]+" "+array[1]+" "+array[2]+" is "+average);
    }
}
