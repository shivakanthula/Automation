package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenNewTabandWindow {

    @Test
    public static void practise(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/selenium-tutorial.html");
        driver.switchTo().newWindow(WindowType.TAB); // Open new tab using Selenium 4 feature
        driver.get("https://www.onlinegdb.com/online_java_compiler");
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW) ;
        driver.get("https://www.onlinegdb.com/online_java_compiler");
        System.out.println(driver.getTitle());
        driver.getTitle();
        driver.close();
    }
}
