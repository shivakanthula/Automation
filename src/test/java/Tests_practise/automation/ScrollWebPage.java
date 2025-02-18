package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWebPage {


    public static void main(String[] args) throws Exception{
        scroolUingJs();
//        acionsClass();

    }
    public static void scroolUingJs() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // [ScrollBy] horizontally by pixels
        js.executeScript("window.scrollBy(500,0)");

        // [ScrollBy] to the specific position of the page [Vertically]
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(10);
        System.out.println("Scrolled by pixels to a specific position ");

        // [ScrollTo] to the bottom of the page [Vertically]
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(15);
        System.out.println("Scrolled to  Bottom of a page ");

        // // [ScrollTo] the Top of the page { vertically]
        js.executeScript("window.scrollTo(0,0)");
        System.out.println("Scrolled to top of a page ");
        Thread.sleep(15);

        // Scroll to the specific element on the WebPage
        WebElement target = driver.findElement(By.xpath("//a[@class='AboutUs__BookOption-w9osof-13 cNxDQy']"));
        js.executeScript("arguments[0].scrollIntoView(true);",target);
        Thread.sleep(15);
        System.out.println("Scrolled to a specific webElement of a page ");

        // Scroll Using Selenium's Keys Class
        WebElement body = driver.findElement(By.tagName("body"));
        // Scroll down using Arrow Down key
        body.sendKeys(Keys.ARROW_DOWN);
        System.out.println("Scrolled down using Arrow Down key ");
        Thread.sleep(10);

        // Scroll up using Arrow Class Provided by the seleniumWebDriver Up key
        body.sendKeys(Keys.ARROW_UP);
        System.out.println("Scrolled up using Arrow Down key ");
        Thread.sleep(10);
        driver.quit();


    }


    public static void acionsClass() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println(" Page Scrolled  down using Actions class ");
        Thread.sleep(10);
        action.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(10);
        System.out.println(" Page Scrolled up using Actions class ");
    }


}
