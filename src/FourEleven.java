import java.util.Scanner;

public class FourEleven {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get digits from user
        System.out.println("Enter binary digits (0000 to 1111): ");
        String digits = input.nextLine();

        //Get result
        System.out.println("The decimal value is " + Integer.parseInt(digits, 2));
    }
}
