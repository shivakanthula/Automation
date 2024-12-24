package Tests_practise.TestNG;

import org.testng.annotations.*;

public class ControlAnnotationFlow {

    @Test
    public void first(){
        System.out.println(" At Test");
    }
    @BeforeClass
    public void second(){
        System.out.println("Before class");
    }

    @AfterClass
    public void thrid(){

        System.out.println(" After Class");
    }

    @BeforeMethod
    public void fourt(){
        System.out.println(" Before Method");
    }

    @AfterMethod
    public void fifth(){

        System.out.println("After Method");
    }

    @BeforeTest
    public void sixth(){

        System.out.println("Before Test");
    }

    @AfterTest
    public void seventh(){

        System.out.println("After Test");
    }

    @BeforeSuite
    public void eighth(){
        System.out.println(" Before Suite");
    }

    @AfterSuite
    public void ninth(){

        System.out.println(" After Suite");
    }

    @Test
    public void tenth(){

        System.out.println(" One more test");
    }

}
