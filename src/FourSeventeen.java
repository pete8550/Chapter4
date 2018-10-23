import java.util.Scanner;

public class FourSeventeen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //get info
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        String month = input.next();

        //Test for leap year
        boolean isLeapYear =
                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        //Calculate and show result
        System.out.print(month + " " + year + " has ");

        if (month.equals("Jan") || month.equals("Mar") ||
        month.equals("May") || month.equals("Jul") ||
        month.equals("Aug") || month.equals("Oct") ||
        month.equals("Dec"))
            System.out.println(31 + " days");

        else if (month.equals("Apr") || month.equals("Jul") ||
        month.equals("Sep") || month.equals("Nob"))
            System.out.println(30 + " days");

        else System.out.println(((isLeapYear) ? 29 : 28) + " days");
    }
}
