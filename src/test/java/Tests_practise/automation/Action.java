package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action {

    public static void main(String[] args){
//        action();
        input();
    }

    public static void action() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        // Navigate to the URL
        driver.get("https://www.redbus.in/");
        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement target = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='bus_tickets_vertical']")));
        System.out.println( target.getAttribute("name"));
        actions.moveToElement(target).click().perform(); // Hover over the menu and click it [ex dropdowns or hover menus]
        actions.doubleClick(target).perform(); // Double-click the folder
        driver.quit();

    }

    public static void input(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        // Navigate to the URL
        driver.get("https://www.redbus.in/");
       WebElement source = driver.findElement(By.xpath("//input[@id='src']"));
//       source.sendKeys("warangal");
        action.click(source).keyUp(Keys.SHIFT).sendKeys("warangal").perform();
        WebElement destination =driver.findElement(By.xpath("//input[@id='dest']"));
        action.click(destination).keyUp(Keys.SHIFT).sendKeys("Secundrabad").perform();
        WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));
        action.moveToElement(search).click().perform();
        System.out.println(driver.getTitle());
//        driver.quit();
    }

}
