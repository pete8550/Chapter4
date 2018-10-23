import java.util.Scanner;

public class FourFour {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info from user
        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        //Create PI
        final double PI = 3.1415962;

        //Calculate and show result
        double area = (6 * Math.pow(side, 2) / (4 * (Math.tan(PI / 6))));

        System.out.println("The area of the hexagon is " + area);
    }
}
