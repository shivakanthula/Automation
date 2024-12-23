package Tests_practise.TestNG;

import org.testng.annotations.Test;

public class Meta_Groups {

    @Test(groups = {"Smoke Testing "})
    public void smokeTesting(){

        System.out.println("Successfully invoked Smoke Testing ");
    }

    @Test(groups = {"Regression Testing"})
    public void RegressionTesting(){

        System.out.println("Successfully invoked a Regression Testing");
    }

    @Test(groups = {"Unit Testing"})
    public void UnitTesting(){

        System.out.println("Successfully invoked Unit Testing:");
    }

    @Test(groups = {"Integration Testing"})
    public void IntegrationTesting(){

        System.out.println("Successfully invoked Integration Testing");
    }

    @Test(groups = {"Functional Testing"})
    public void FunctionalTesting(){

        System.out.println("Successfully invoked Functional Testing");
    }

    @Test(groups = {"API Testing"})
    public void APITesting(){

        System.out.println("Successfully invoked API Testing");
    }

    @Test(groups = {"Smoke Testing"})
    public void SecurityTesting(){

        System.out.println("Successfully invoked Security Testing");
    }

    @Test(groups = {"Performance Testing"})
    public void PerformanceTesting(){

        System.out.println("Successfully invoked PerformanceTesting");
    }

    @Test(groups = {"Security Testing"})
    public void CrossBrowserTesting(){

        System.out.println("Successfully invoked Security Testing");
    }

    @Test(groups = {"End-to-End Testing"})
    public void EndtoEndTesting(){

        System.out.println("Successfully invoked End-to-End Testing");
    }

    @Test(groups = {"User Acceptance Testing"})
    public void UserAcceptanceTesting(){

        System.out.println("Successfully invoked User Acceptance Testing");
    }


}
