package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Practise {

@Test
    public static void practise() throws Throwable{
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.guru99.com/selenium-tutorial.html");

    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("path");
    FileUtils.copyFile(source, dest);
    }
}
