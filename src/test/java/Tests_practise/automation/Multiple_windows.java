package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Multiple_windows {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMI2NDHhZipigMV2C97Bx2luBwdEAAYASAAEgJr2vD_BwE");
        String mainwindow = driver.getWindowHandle();// getting the Parent window address
        System.out.println(mainwindow);

        WebElement w1= driver.findElement(By.className("OfferSection__ViewAllText-sc-16xojcc-1 eVcjqm"));
        w1.click();

        //Switching to the child window using Set interface
       Set<String> multiplewindows = driver.getWindowHandles();
       System.out.println(multiplewindows);
       for (String windows : multiplewindows){  // Iterating through all window handles
           if(!windows.equals(mainwindow)){  // Check if it's NOT the parent window
               driver.switchTo().window(windows); // Switch to child window
               System.out.println(driver.getTitle());
               driver.close();  // Close the child window
           }
           driver.switchTo().window(mainwindow); //Switching back to the main window
       }

    }
}
