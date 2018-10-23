import java.util.Scanner;

public class FourSeven {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //get radius
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        //Create five points
        double p1 = Math.PI / 10;
        double p2 = Math.PI / 2;
        double p3 = Math.PI / 2 + 2 * Math.PI / 5;
        double p4 = Math.PI / 2 + 4 * Math.PI / 5;
        double p5 = Math.PI / 2 + 6 * Math.PI / 5;

        //Calculate coordinates
        double x1 = radius * Math.cos(p1);
        double y1 = radius * Math.sin(p1);
        double x2 = radius * Math.cos(p2);
        double y2 = radius * Math.sin(p2);
        double x3 = radius * Math.cos(p3);
        double y3 = radius * Math.sin(p3);
        double x4 = radius * Math.cos(p4);
        double y4 = radius * Math.sin(p4);
        double x5 = radius * Math.cos(p5);
        double y5 = radius * Math.sin(p5);

        //Show result
        System.out.println("The coordinates of five points on the pentagon are");

        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");
        System.out.println("(" + x5 + ", " + y5 + ")");
    }
}
