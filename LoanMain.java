import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan Payment = new Loan(interestRate,years,loanAmount);
        System.out.println("The loan was created on " +Payment.getLoanDate());
        System.out.println("The monthly payment is "+String.format("%.2f",Payment.getMonthlyPayment()));
        System.out.println("The total payment is "+String.format("%.2f",Payment.getTotalPayment()));

        input.close();
    }
}
