package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Linkedin_Login
{

    @Test
    public static void main( String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.manage().getCookies();

        driver.get("https://www.linkedin.com/feed/");
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("shivakanthula@gmail.com");

        WebElement psw = driver.findElement(By.id("password"));
        psw.sendKeys("Shiv@777");


      // driver.findElement(By.className("btn__primary--large from__button--floating")).submit();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        wait.until(ExpectedConditions.titleContains("Feed | LinkedIn"));

        driver.navigate().refresh();

            System.out.println(driver.getTitle());
//            driver.quit();
    }
}
