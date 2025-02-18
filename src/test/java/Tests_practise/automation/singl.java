package Tests_practise.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class singl {
@Test
public static void callSD(){

    WebDriver driver = SingletonDP.getbrowser();
    driver.get("https://github.com/shivakanthula/Automation");
    SingletonDP.output("hii kanthula");
    SingletonDP.print("this is the input");
    SingletonDP.closeBrowser();
}
}