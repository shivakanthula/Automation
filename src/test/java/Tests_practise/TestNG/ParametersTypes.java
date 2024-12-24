package Tests_practise.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTypes {


        WebDriver driver;

        @Parameters({"baseURL","base"})
        @Test()
        public void statparam(String baseURL,String base){

            driver = new ChromeDriver();
            driver.get(base);
            System.out.println("Testing on: " + base);
            System.out.println(driver.getTitle());
            System.out.println("Base URL:" + baseURL);
            System.out.println(driver.getTitle());
            driver.quit();
        }

        @Parameters("baseURL")
        @Test()
        public void onemoreparam(String baseURL){
            driver = new FirefoxDriver();
            driver.get(baseURL);
            System.out.println("Base URL:" + baseURL);
            System.out.println(driver.getTitle());
            driver.close();
        }

    }
