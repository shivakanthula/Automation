package Tests_practise.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {


    @Test(invocationCount = 3,threadPoolSize=3)
    public void innovacion(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        driver.close();
    }

    @Test(invocationCount = 4,threadPoolSize=2,invocationTimeOut = 4000)
    public void timeoutThread(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

