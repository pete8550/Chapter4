import java.util.Scanner;

public class FourTwentytwo {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get strings from user
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();

        //Check if substring
        System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not ")
        + "a substring of " + s1);
    }
}
