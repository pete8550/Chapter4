import java.util.Scanner;

public class FourNine {

        public static void main(String[] args) {

            //Create scanner
            Scanner input = new Scanner(System.in);

            //Get a character
            System.out.println("Enter a character: ");
            String character = input.nextLine();
            char ch = character.charAt(0);

            //Turn character to int

            System.out.println("The Unicode for the character " + ch + " is " + (int) ch);
        }
    }
