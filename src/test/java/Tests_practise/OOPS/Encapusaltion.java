package Tests_practise.OOPS;

import org.testng.annotations.Test;

// Loan class with encapsulation

class Encapusaltion {

// Loan Variables are private to protect data.
     private double loanAmount;
     private double interest;
     private String loanType;
     private String borrowerName;

    // Parameterized Constructor[ ClassName ] to initialize loan details
     public Encapusaltion (String borrowerName,String loanType,double interest,double loanAmount) {
         this.borrowerName = borrowerName;  // Assigns parameter value to instance variable
         this.loanType = loanType;
         this.loanAmount = loanAmount;
         this.interest = interest;
     }

// Getter methods to retrieve data
     public String getLoanType(){
         return loanType;
     }
     public String getBorrowerName(){
         return borrowerName;
     }

     public double getLoanAmount(){
         return loanAmount;
     }

     public double getInterest(){
         return interest;
     }

 // Setter method to update loan amount
     public void  setLoanAmount(double loanAmount){
         if(loanAmount>0){
             this.loanAmount = loanAmount;
         }
         else{
             System.out.println("Invalid loan Amount");
         }
     }

     public void  setInterest(double interest){
         if(interest>0){
             this.interest = interest;
         }
         else{
             System.out.println("Invalid interest Amount");
         }
     }

// Method to display loan details
     public void displayoanDetails(){
         System.out.println("Borrower Name : " + borrowerName);
         System.out.println("Loan Type :  "+ loanType);
         System.out.println("Loan Amount : " + loanAmount);
         System.out.println("Interest Rate : " + interest + "%");

     }

 }
