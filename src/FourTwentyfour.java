import java.util.Scanner;

public class FourTwentyfour {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get three countries from user
        System.out.println("Enter the first country: ");
        String country1 = input.nextLine();

        System.out.println("Enter the second country: ");
        String country2 = input.nextLine();

        System.out.println("Enter the third country: ");
        String country3 = input.nextLine();

        //Calculate order of cities
        String temp;
        if ((country2.compareTo(country1) < 0) && (country2.compareTo(country3) < 0)) {

            temp = country1;
            country1 = country2;
            country2 = temp;

        } else if ((country3.compareTo(country1) < 0) && (country3.compareTo(country2) < 0)) {

            temp = country1;
            country1 = country3;
            country3 = temp;

        } if (country3.compareTo(country2) < 0) {

            temp = country2;
            country2 = country3;
            country3 = temp;
        }

        //Display cities in ascending order
        System.out.println("The three countries in alphabetical order are " +
                country1 + " " + country2 + " " + country3);
    }
}
