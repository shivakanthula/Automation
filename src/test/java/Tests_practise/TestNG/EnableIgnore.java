package Tests_practise.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnableIgnore {
    @Test() // This test will execute
    public void enabl() {
        System.out.println("Successfully enabling a method.");
    }

    @Test(enabled = false) // This test will not execute
    public void disable() {
        System.out.println("This method is disabled using 'enabled = false'.");
    }
}

// This will ignore all tests in the class
@Ignore
class Ignoring {

    @Test()
    public void methodInIgnoredClass() {
        System.out.println("This method will not run because this class is ignored.");
    }
}


class Both {

    @Test
    public void printing() {
        System.out.println("Successfully printing a message.");
    }

    @Ignore // This test method will be ignored
    @Test
    public void disable() {
        System.out.println("This method is ignored using '@Ignore'.");
    }
}

