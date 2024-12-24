package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class From_GroupW_NavigateOneWindow {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/selenium-tutorial.html");

        String guru = driver.getWindowHandle();
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB).get("https://www.linkedin.com/feed/");
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB).get("https://www.facebook.com/");
//        driver.quit();

        Set<String> handles = driver.getWindowHandles();

        for ( String windows : handles){
            driver.switchTo().window(windows);

            if(!windows.equals(guru)){
                driver.close();
            }
        }

        driver.switchTo().window(guru);
        System.out.println("Title Name " + driver.getTitle() );
    }
}
