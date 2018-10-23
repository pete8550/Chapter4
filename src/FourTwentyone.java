import java.util.Scanner;

public class FourTwentyone {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get SSN from user
        System.out.println("Enter a SSN: ");
        String SSN = input.nextLine();

        //check if SSN is valid or not
        boolean isValid =
                (SSN.length() == 11) &&
                        (Character.isDigit(SSN.charAt(0))) &&
                        (Character.isDigit(SSN.charAt(1))) &&
                        (Character.isDigit(SSN.charAt(2))) &&
                        (SSN.charAt(3) == '-') &&
                        (Character.isDigit(SSN.charAt(4))) &&
                        (Character.isDigit(SSN.charAt(5))) &&
                        (SSN.charAt(6) == '-') &&
                        (Character.isDigit(SSN.charAt(7))) &&
                        (Character.isDigit(SSN.charAt(8))) &&
                        (Character.isDigit(SSN.charAt(9))) &&
                        (Character.isDigit(SSN.charAt(10)));

        //Display result
        System.out.println(SSN + " is " + ((isValid) ? "a valid " : "an invalid ")
        + "social security number");
    }
}
