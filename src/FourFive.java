import java.util.Scanner;

public class FourFive {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create PI
        final double PI = 3.1415962;

        //Get info
        System.out.println("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();

        System.out.println("Enter the side: ");
        double lengthOfSide = input.nextDouble();

        //Calculate and show result
        double area = (numberOfSides * Math.pow(lengthOfSide, 2) /
                (4 * (Math.tan(PI / numberOfSides))));

        System.out.println("The area of the polygon is " + area );
    }
}
