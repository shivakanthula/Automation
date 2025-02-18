package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class Webdriver_waits {

    public static void main(String[] args) throws Throwable {
// Throwable can catch any exception or error because it is the parent of all exceptions in Java.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //Declaring explicitwait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.javatpoint.com/selenium-interview-questions");

      // declaring webDriverWait or ExplicitWait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement find =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));
        find.click();
        System.out.println(" waited sucessfully");

      // fluent Wait
        FluentWait<WebDriver> Fwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
                .pollingEvery(Duration.ofMillis(500)) // Polling interval
                .ignoring(NoSuchElementException.class); // Ignore specific exceptions

        String  print  = Fwait.until(WebDriver::getWindowHandle);
        System.out.println(print.toString());
          driver.quit();

    }
}
