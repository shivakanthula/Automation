package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class GetScreenShot {


    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.google.co.in/");
//
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:/Users/shiva kumar/IdeaProjects/maven-project/src/test/resources/Screenshots.png");
        FileUtils.copyFile(source,destination);
        System.out.println(destination.getName());
        driver.quit();
    }
}

