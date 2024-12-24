package Tests_practise.TestNG;

import org.testng.annotations.Test;

public class PriorityforFightBooking {


    @Test(priority = 0)

    public void signup(){

        System.out.println("Signup to the application page");
    }
    @Test(priority = 2)
    public void loginto(){

        System.out.println("login to page");
    }
    @Test(priority = 3)
    public void bookticket(){

        System.out.println("Book fight tickets");
    }
    @Test(priority=4)
    public void saveTicket(){

        System.out.println("save the ticket");
    }
    @Test(priority = 5)
    public void logoutApp(){
        System.out.println("logoutapp");
    }
}
