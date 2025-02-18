package Tests_practise.OOPS;

import org.testng.annotations.Test;
// Subclass: HomeLoan (inherits Loan)
class HomeLoan extends Inheritance {
    private int tenure; // Loan tenure in years

    public HomeLoan(String borrowerName,String loanType,double interest,double loanAmount ,int tenure) {
        super(borrowerName,loanType,interest,loanAmount);
        this.tenure = tenure;
    }
    public void displayHomeLoanDetails() {
        displayoanDetails();
        System.out.println("Loan Tenure: " + tenure + " years");
    }
}

 class LoanTest {
    public static void main(String[] args) {
        // Method to display home loan details
            HomeLoan homeLoan = new HomeLoan("Varun", "Home Loan", 8.3, 1000000, 15);
            homeLoan.displayHomeLoanDetails();


    }
}