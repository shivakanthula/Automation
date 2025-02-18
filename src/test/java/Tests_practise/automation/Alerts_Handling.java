package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts_Handling {


    public static void main(String[] args0) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

// Handle Simple Alert
        WebElement simple = driver.findElement(By.id("alertBox"));
        simple.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Simple alert handled Successfully");
        Thread.sleep(5);

// Handle Confirmation Alert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBox")));
        element.click();
        alert = driver.switchTo().alert();
        alert.dismiss();
        System.out.println("Confirm alert handled Successfully");
        Thread.sleep(5);

// Handle Prompt Alert
//        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        WebElement promptEle = wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBox")));
        element.click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Hii kanthula");
        alert.accept();
        System.out.println("Promt alert handled Successfully");
        driver.quit();

    }
}
