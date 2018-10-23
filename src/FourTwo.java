import java.util.Scanner;

public class FourTwo {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //point 1 and point 2
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Convert into radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        //The earth radius
        final double  radius = 6371.01;

        //Calculate the distance
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
                Math.cos(y1 - y2));

        //Display result
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
