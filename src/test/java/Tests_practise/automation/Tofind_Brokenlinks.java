package Tests_practise.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class Tofind_Brokenlinks {


    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
// This method returns a list of all elements on the page that have the <a> tag.
//Each item in the List is a WebElement
//A WebElement provides methods like getText(), getAttribute(), click(), etc.

        try {
            int brokenlinks = 0;
            for (WebElement link : links) {
                String url = link.getAttribute("href");
//The href attribute of each <a> tag is fetched using getAttribute("href").

                if (url == null || url.isEmpty()) {
                    System.out.println("empty links : " + url);
                    continue;
                }
// HttpURLConnection is a class in the java.net package.

                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
//The HEAD request method is similar to a GET request but does not return the body of the response.
                connection.connect();

//After calling connect(), the program can retrieve the response headers or status code of the server.
// getResponseCode() retrieves the HTTP status code returned by the server after the connection is established.

                int responsecode = connection.getResponseCode();
                if (responsecode > 400) {
                    System.out.println("brokenliks " + url + "error code:- " + responsecode);
                    brokenlinks++;
                }

            }
            System.out.println("Number of broken links: " + brokenlinks);
        }
        finally {
            driver.quit();
        }
    }
}
