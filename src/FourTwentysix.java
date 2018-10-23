import java.util.Scanner;

public class FourTwentysix {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Recieve amount
        System.out.println("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();

        //Extract number of dollars
        String numberOfOneDOllars = amount.substring(0, amount.indexOf('.'));

        //Extract cent
        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        //Extract quarters
        int numberOfQuarters = cents / 25;
        cents %= 25;

        //Extract number of dimes
        int numberOfDimes = cents / 10;
        cents %= 10;

        //Extract number of nickels
        int numberOfNickles = cents / 5;
        cents %= 5;

        //Display result
        System.out.println("Your amount " + amount + " consists of\n "
        + numberOfOneDOllars + " dollars\n "
        + numberOfQuarters + " quarters\n "
        + numberOfDimes + " dimes\n "
        + numberOfNickles + " nickels\n "
        + cents + " pennies\n ");
    }
}
