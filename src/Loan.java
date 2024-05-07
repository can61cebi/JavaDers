public class Loan {

    private double annualInterestRate;
    private int years;
    private double loanAmount;

    public Loan() {
        this(2.5,1,1000);
    }

    public Loan(double annualInterestRate,int years, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.years = years;
        this.loanAmount=loanAmount;
    }
    public double getAnnualInterestRate() {return annualInterestRate;}
    public int getYears() {return years;}
    public double getLoanAmount() {return loanAmount;}

    public double getMonthlyPayment() {
        double monthlyInterest = annualInterestRate/1200;
        double monthlyPayment = loanAmount*monthlyInterest/
                (1-(1/Math.pow(1+monthlyInterest,years*12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment()*years*12;
        return totalPayment;
    }

}