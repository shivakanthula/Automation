package page_test;

import Page_object.Login_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_utils.Base_tests;

public class Actual_tests extends Base_tests {

    Login_page loginpage;


    @Test
    public void testRunshere(){
      loginpage = new Login_page(driver);
      loginpage.enterusername("shivakumarkanthula@gmail.com");
      loginpage.enterpassword("Shiv@777");
      loginpage.buttonclick();

    }




}
