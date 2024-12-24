package page_utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_tests {
  protected   WebDriver driver;


@BeforeClass
    public void browser_call() {
    driver = Base_initialization.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://www.linkedin.com/feed/");

}

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}
