import java.util.Scanner;

public class FourTwenty {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get a string from user
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        //Display lenght and last character
        System.out.println(string + " has a lenght of " + string.length() + " characters and its last character is " +
                string.charAt(string.length() - 1));
    }
}
