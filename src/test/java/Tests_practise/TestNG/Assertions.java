package Tests_practise.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

        @Test
        public static void softAssertion(){

            String s1 ="Shiva";
            String s2 ="shiava";
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(s1,s2);
// To track multiple validation failures in a single test case (using soft assertions).
            String s3 ="Kanthula" ;
            String s4 = "kanthuula";
            softAssert.assertEquals(s4,s3);
            System.out.println("Soft Assert executes even the test fails");
            softAssert.assertAll(); // it collects all assertion failures during test execution are reported

        }



        @Test()
        public static void hardAssert(){

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://github.com/shivakanthula/Automation");
            String actual = driver.getTitle();
// To avoid unnecessary code execution after a critical failure (using hard assertions).
            String expected ="shvakanthula/Automation · GitHub";
            Assert.assertEquals(actual,expected);
            System.out.println("assert should fail");
        }

    }


