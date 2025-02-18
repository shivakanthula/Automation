package Tests_practise.OOPS;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;
import org.testng.annotations.Test;

interface  vechile{
@Test
    void method1();

    static void method2() {
        System.out.println("Hi kanthula iam at method3");

    }

    default void method3(){
        method2();  // Calling static method inside default method
    };

    void method4();
}
