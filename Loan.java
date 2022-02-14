import java.lang.Math;
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate =new java.util.Date();

    public Loan(){
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000.00;
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = (annualInterestRate/100)/12;
        double product = loanAmount*(monthlyInterestRate);
        double monthlyPayment = product/(1-(1/(Math.pow((1+monthlyInterestRate),(numberOfYears*12)))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }
}