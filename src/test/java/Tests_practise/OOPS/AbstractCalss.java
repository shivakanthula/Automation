package Tests_practise.OOPS;

import org.testng.annotations.Test;

abstract class NewABclass implements vechile{

public void method1(){
    System.out.println("HI kanthula iam at method1");
}

    public void method4() {
        System.out.println("HI kanthula iam at method2");
    }
@Override
    public void method3(){  // Calls overridden method
        System.out.println("HI kanthula iam at overridden method3");
    }
}

class ExtendingAB extends NewABclass {
   public static  void main(String[] args) {
        ExtendingAB ex = new ExtendingAB();
        ex.method3(); // Calls default method (calls static method2 internally)
       ex.method1(); // Calls overridden method
    }
}

