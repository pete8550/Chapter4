import java.util.Scanner;

public class FourOne {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get length from center
        System.out.println("Enter the lenght from the center to a vertex: ");
        double lengthFromCenter = input.nextDouble();

        //Create PI
        double PI = 3.14159265;

        //Calculate length of a side
        double lengthOfaSide = 2 * lengthFromCenter * (Math.sin(PI / 5));

        //Calculate Area
        double area = (5 * Math.pow(lengthOfaSide, 2)) / (4 * Math.tan(PI / 5));

        //Display result
        System.out.println("The area of the pentagon is: " + area);
    }
}
