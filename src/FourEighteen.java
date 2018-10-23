import java.util.Scanner;

public class FourEighteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter two characters: ");
        String str = input.nextLine();

        //Extract major and status from string
        char Major = Character.toUpperCase(str.charAt(0));
        char Status = str.charAt(1);

        //Display major
        switch (Major) {

            case 'I': System.out.print("Information Management "); break;
            case 'C': System.out.print("Computer Science "); break;
            case 'A': System.out.print("Accounting "); break;
            default : System.out.println("Invalid input");
            System.exit(1);
        }
        //Display status
        switch (Status) {

            case '1': System.out.println("freshman"); break;
            case '2': System.out.println("sophomore"); break;
            case '3': System.out.println("junior"); break;
            case '4': System.out.println("senior"); break;
            default : System.out.println("Invalid input");
        }
    }
}
