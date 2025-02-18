package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class WebElements {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();

      List<WebElement> elements =  driver.findElements(By.xpath("//button"));
      for(WebElement element : elements){
          System.out.println("Name: " + element.getAttribute("name"));
      }
        // Quit the browser
        driver.quit();
    }
}
