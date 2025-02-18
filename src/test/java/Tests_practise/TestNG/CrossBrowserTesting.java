package Tests_practise.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

    WebDriver driver;

@Parameters("browser")
@BeforeTest
    public  void setup( String browser){

    if(browser.equalsIgnoreCase("chrome")){
        driver = new ChromeDriver();
    }
    else if(browser.equalsIgnoreCase("firefox")){
        driver = new FirefoxDriver();
    }
    else if(browser.equalsIgnoreCase("edge")){
        driver = new EdgeDriver();
    }
    else{
        throw new IllegalArgumentException("Invald broser"+ browser);
    }

    }

@Test
    public  void openapp(){

    driver.get("linkg");
    System.out.println(driver.getTitle());
}
@AfterTest
    public void closeapp(){
    driver.close();
}


}
