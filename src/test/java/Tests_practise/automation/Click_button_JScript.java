package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_button_JScript {


    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.linkedin.com/feed/");
        WebElement user = driver.findElement(By.id("username"));

        js.executeScript("arguments[0].value='shivakanthula@gmail.com';",user);

//        user.sendKeys("shivakanthula@gmail.com");

        WebElement psw = driver.findElement(By.id("password"));
//        psw.sendKeys("Shiv@777");
        js.executeScript("arguments[0].value='Shiv@777';",psw);

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click();",button );



//        driver.quit();

    }
}
