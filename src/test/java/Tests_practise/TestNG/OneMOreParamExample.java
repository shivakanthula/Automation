package Tests_practise.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OneMOreParamExample extends ParametersTypes {


        @Parameters("base")
        @Test
        public void examplep(String base){

        driver = new ChromeDriver();
        driver.getTitle();
        System.out.println("hii kanthula");

    }

        @Parameters("base")
        @Test
        public void example2(String base){

        driver = new EdgeDriver();
        driver.getTitle();
        System.out.println("hii shivakumar kanthula");

    }


    }

