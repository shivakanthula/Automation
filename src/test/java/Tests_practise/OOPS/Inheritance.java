package Tests_practise.OOPS;

 class Inheritance {

     protected double loanAmount;
     protected double interest;
     protected String loanType;
     protected String borrowerName;

// Parameterized Constructor[ ClassName ] to initialize loan details
    public Inheritance (String borrowerName,String loanType,double interest,double loanAmount) {
        this.borrowerName = borrowerName;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interest = interest;
    }

// Method to display loan details
    public void displayoanDetails(){
        System.out.println("Borrower Name : " + borrowerName);
        System.out.println("Loan Type :  "+ loanType);
        System.out.println("Loan Amount : " + loanAmount);
        System.out.println("Interest Rate : " + interest + "%");
    }
}


