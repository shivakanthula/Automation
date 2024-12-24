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

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //Declaring explicitwait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.javatpoint.com/selenium-interview-questions");
      // declaring webDriverWait or ExplicitWait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
        WebElement find =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));
        find.click();
        System.out.println(" waited sucessfully");

      // fluent Wait
        Wait<WebDriver> Fwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofNanos(100)).ignoring(NoSuchElementException.class);
        String  print  = Fwait.until(WebDriver::getWindowHandle);
        System.out.println(print.toString());
       //   driver.quit();


    }
}
