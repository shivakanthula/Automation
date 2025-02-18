package Tests_practise.OOPS;

// Main class to test Loan functionality
public class EncTest {

public static void main(String[] args){

// Creating a new Loan object using constructor
    Encapusaltion loanProcess =
            new Encapusaltion("ShivaKumar","PersonalLoan",10.5,1000000);

//    System.out.println("Loan Process Initalized :");
    loanProcess.displayoanDetails();        // Displaying updated loan details

    loanProcess.setLoanAmount(200000);  // Updating loan amount
    loanProcess.setInterest(16.3);      // Updating Interest

    System.out.println("Updated details of LoanProcess :");
    loanProcess.displayoanDetails();    // Displaying updated loan details

}
}
