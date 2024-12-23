package Tests_practise.TestNG;

import org.testng.annotations.Test;

public class Groups_examples {

@Test(groups = {"login"})
    public void xnvokeBrowser(){

        System.out.println("Successfully invoked a broser");
    }

@Test(groups={"regression","login"})
    public void yignup(){

        System.out.println(" Successfully signed  as a new user ");
    }

@Test(groups={"regression","smoke"})
    public void login_validcred(){

        System.out.println(" Logged with right cresntials;");
    }

@Test(groups={"smoke"})
    public void logged_invalidCred(){

        System.out.println(" Enterd invalid credentials");
    }

    @Test(groups={"login"})
    public void zelcomeHomePage(){

        System.out.println("Hii shiva welcome ");
    }
}
