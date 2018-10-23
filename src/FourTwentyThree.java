import java.util.Scanner;

public class FourTwentyThree {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        //Display result
        double grossPay, federalWithholding, stateWithholding, totalDeduction;

        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + (grossPay = hoursWorked * hourlyPayRate));
        System.out.println("Deductions:");
        System.out.println("Federal Withholding (20.0%): $" + (federalWithholding = grossPay * federalTax));
        System.out.println("State Withholding (9.0%): $" + (stateWithholding = grossPay * stateTax));
        System.out.println("Total Deduction: $" + (totalDeduction = federalWithholding + stateWithholding));
        System.out.println("Net Pay: $" + (grossPay - totalDeduction));
    }
}
