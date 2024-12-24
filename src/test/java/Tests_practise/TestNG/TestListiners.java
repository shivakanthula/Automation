package Tests_practise.TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
@Test
public class TestListiners implements ITestListener {


    public void onTestSuccess(ITestResult result) {


        System.out.println("Test Passed:- onTestSuccess ");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test Passed:- onTestStarts " );
    }


    public void onTestFailure(ITestResult result) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = "screenshots/" + result.getMethod().getMethodName() + ".png";
        try {
            FileUtils.copyFile(screenshot, new File(destination));
            System.out.println("Screenshot saved at: " + destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            driver.quit();
        }
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Passed:- onTestSkipped " );
    }


    public void onStart(ITestContext context) {
        System.out.println("Test Passed:- onStart " );
    }

}
