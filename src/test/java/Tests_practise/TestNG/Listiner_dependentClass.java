package Tests_practise.TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test_Listiners.class)
public class Listiner_dependentClass {

@Test(priority = 0,testName = "Method1-success")
    public static void method1(){
        System.out.println("Iam inside the method1");
    }

@Test(priority = 1,testName = " Method2-Success")
    public void method2(){
        System.out.println("Iam inside the method2");
    }

@Test(timeOut = 1000,priority = 3,testName = "Method3-delay")
    public void method3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Iam inside the method3");

    }

    @Test(testName = "Method4-Failure-Screenshot",timeOut = 1000)
    public void method4() throws RuntimeException, InterruptedException {
        Thread.sleep(2000);
        System.out.println("I am inside method4");

    }
}
