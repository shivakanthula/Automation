package Tests_practise.TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Listeners(Test_Listiners.class)
public class ScreenShot_failureCases  {

        @Test(testName = "Method4-Failure-Screenshot",timeOut = 1000)
        public void testFailure(ITestResult result) throws InterruptedException {
                WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);
        System.out.println("Intentially failinng the method");


        }
}
