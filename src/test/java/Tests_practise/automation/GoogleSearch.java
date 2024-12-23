package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
    WebDriver driver;

    public static void main(String[] args){

      GoogleSearch s = new GoogleSearch();
      s.driverinvoke();
      s.googlesearch();
      s.close();
    }
@BeforeClass
    public void driverinvoke(){

        WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
@Test
    public void googlesearch(){

     driver.get("https://www.google.co.in/");
     WebElement input = driver.findElement(By.id("APjFqb"));
    input.sendKeys("today gold rate");
    input.submit();
    String title = driver.getTitle();
    System.out.println(title);

    }
    @AfterTest
    public void close(){
        driver.quit();

    }
}
