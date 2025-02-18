package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FramesPractise {

    public static void main(String[] args) throws InterruptedException {

        framess();
    }

    public static void framess() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        WebElement input = driver.findElement(By.xpath("//input[@id='name'][1]"));
        input.sendKeys("Enter text Here");

        driver.switchTo().frame("frm1");// frame1x
        WebElement options = driver.findElement(By.xpath("//select[@id='selectnav1']"));
        Select select = new Select(options);
        List<WebElement> retrive = select.getOptions();
        select.selectByIndex(3);
        for(WebElement values : retrive){
            System.out.println(values.getText());
        }

// Note : Kitchen Hall concept apply in frames context

        driver.switchTo().defaultContent();
        input.clear();
        input.sendKeys("hii kanthula");// main frame
        driver.switchTo().frame("frm2");
        select.selectByIndex(7);
//        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
//        lastName.sendKeys("Kanthula");
//        driver.findElement(By.id("email")).sendKeys("Kanthulashiva@gmail.com");

        driver.switchTo().defaultContent();
        input.clear();
        input.sendKeys("shivakumar kanthula");
        Thread.sleep(10);
        driver.quit();

    }
@Test
    public static void method1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
        WebElement present = driver.findElement(By.xpath("//a[text()='Selenium Practice'][1]"));

        if(present.isDisplayed()){
            present.click();
        }

        WebElement dropdown = driver.findElement(By.xpath("//a[text()='Selenium Practice']//parent:: li//a[text()='Frames Practice']"));
        dropdown.click();
        System.out.println(dropdown.getText());

        List<WebElement> elements = driver.findElements(By.xpath("//h1[@class='post-title entry-title']"));
        System.out.println("Window Address " + driver.getWindowHandle());

        for(WebElement iterate : elements){
            System.out.println(iterate.getText());
        }

        driver.quit();
        System.out.println("window closed sucessfully");

    }

}
