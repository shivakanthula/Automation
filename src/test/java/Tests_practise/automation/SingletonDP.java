package Tests_practise.automation;

import groovy.transform.Synchronized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDP {

    private static WebDriver driver;

    public SingletonDP() {
    }

    public static  WebDriver getbrowser() {
        if (driver == null) {
           driver = new ChromeDriver();
        }
        return driver;
    }

    public static void print(String input) {

        System.out.println(" input : " + input);
    }

    public static void output(String output) {
        System.out.println(" output :" + output);
    }

    public static void closeBrowser() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}

