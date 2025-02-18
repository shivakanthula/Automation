package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class RadiobttnClicking {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");
        String mainwindow = driver.getWindowHandle();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        for( int i=0;i<buttons.size();i++){

            WebElement each = buttons.get(i);
            if(!each.isSelected()&& each.isEnabled()){
                each.click();
                System.out.println(each.getText());
                Thread.sleep(1000);
                Set<String> windowhandles = driver.getWindowHandles();

                for( String windows : windowhandles){
                    int count =0;
                    if(!windows.equals(mainwindow)){
                        count++;
                        driver.switchTo().window(windows);
                            System.out.print(driver.getTitle());
                    }
                }
            }
        }
    }

    @Test
    public static void alternateRadioButtons(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");
        List<WebElement> buttons = driver.findElements(By.xpath("//button"));

        for(int i=0;i<buttons.size();i=i+2){
//            buttons = driver.findElements(By.xpath("//button"));
            WebElement each = buttons.get(i);
            if(each.isDisplayed() && each.isEnabled()){
                System.out.println(each.getText());
            }
        }
        driver.close();

    }
}
