package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectElements_Drodowns {
    public static void main(String[] args){

        SelectElements_Drodowns methods = new SelectElements_Drodowns();
//        methods.amazon();
        methods.redbus();

    }
@Test
    // Selecting dropdowns using select class
    public void amazon(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement element = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
        Select select = new Select(element);
        List<WebElement> retrive = select.getOptions();
        select.selectByIndex(7);
        for(WebElement options : retrive){
            System.out.println(" Dropdown names:  " +options.getText());
        }
        driver.quit();
    }
@Test
// Selecting dropdowns without using Select class
    public void redbus(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        try {
            driver.get("https://www.redbus.in/");
            WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id=\"language_change\"]")));
            Actions action = new Actions(driver);
            action.moveToElement(dropdown).click().perform();
            List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id=\"language_change\"]//li")));
            for (WebElement names : options) {
                System.out.println("Names : " + names.getText());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            driver.close();
        }
    }
}
