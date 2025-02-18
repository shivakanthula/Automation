package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MatchingAttributes {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the URL
        driver.get("https://www.google.co.in/");
        WebElement search = driver.findElement(By.className("gLFyf"));
        search.sendKeys("Virat Kohli");
//        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        List<WebElement> suggesions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Alh6id']//ul//li")));
        for(WebElement returns : suggesions){
            System.out.println(returns.getText());
        }
        driver.quit();

    }
}
