import java.util.Scanner;

public class FourFourteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get letter from user
        System.out.println("Enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        //Calculate number to grade
        if (ch >= 'A' && ch <= 'F' && ch != 'E') {

            System.out.print("The numeric value for grade " + ch + " is ");

            switch (ch) {

                case 'A': System.out.print("4"); break;
                case 'B': System.out.print("3"); break;
                case 'C': System.out.print("2"); break;
                case 'D': System.out.print("1"); break;
                case 'F': System.out.print("0");
            }
        } else System.out.println(ch + " is an invalid grade");
    }
}
