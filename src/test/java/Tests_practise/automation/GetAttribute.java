package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttribute {

@Test
    public static void getText() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
           driver.get("https://www.facebook.com/login/");
           WebElement input = driver.findElement(By.id("email"));
           input.sendKeys("hi kanthula");
// text boxes store their entered text in the "value" attribute.
           String s= input.getAttribute("value");
           Thread.sleep(3);
           input.clear();
           input.sendKeys("hii kanthula");
           String tex = input.getText();  // May return an empty string
// getText() (Not Recommended for Text Boxes)
           System.out.println("getAttribute:- " + s);
           System.out.println("getText:- " + tex);
           driver.close();
    }
}
