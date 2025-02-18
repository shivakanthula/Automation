package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalenderControls {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        // Navigate to the URL
        driver.get("https://www.redbus.in/");

        // Select "From" location
        WebElement fromInput = driver.findElement(By.id("src"));
        fromInput.sendKeys("Bangalore");
        Thread.sleep(2000); // Wait for suggestions to load
        fromInput.sendKeys(Keys.ENTER);

        // Select "To" location
        WebElement toInput = driver.findElement(By.id("dest"));
        toInput.sendKeys("Hyderabad");
        Thread.sleep(2000); // Wait for suggestions to load
        toInput.sendKeys(Keys.ENTER);

        // Wait and click on the Date Picker
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onward_cal")));
        dateInput.click();


        // Navigate to January 2025
        while (true) {
            WebElement monthYearElement = driver.findElement(By.className("monthTitle"));
            String displayedMonthYear = monthYearElement.getText();

            if (displayedMonthYear.equalsIgnoreCase("January 2025")) {
                break; // Stop when January 2025 is displayed
            } else {
                WebElement nextButton = driver.findElement(By.className("next"));
                nextButton.click(); // Click next button to move to the next month
            }
        }

        // Select 26th January 2025
        WebElement date = driver.findElement(By.xpath("//td[text()='26']"));
        date.click();

        // You can proceed with further actions, like clicking the search button
        WebElement searchBtn = driver.findElement(By.id("search_btn"));
        searchBtn.click();

        // Print success message
        System.out.println("Date 26th January 2025 selected successfully.");

    }
}
