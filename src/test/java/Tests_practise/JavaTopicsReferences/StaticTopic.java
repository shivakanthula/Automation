package Tests_practise.JavaTopicsReferences;

import java.util.Random;
//  for static variable,methods,blocks no need of creating objects


public class StaticTopic {
   static int num ; // Static variable, shared across all instances

    static {
        System.out.println(" static block will execute first before main block");
    }
public static void main(String[] args){ // static block will execute before main method

// static method can be called without creating object
    StaticTopic st5 = new StaticTopic(); // Non-static method can be called by creating  object
    st5.method2();

    StaticTopic st = new StaticTopic();
    st.num = new Random().nextInt();  // // Assigns a random number to 'num'

    StaticTopic st2 = new StaticTopic();
    st2.num = new Random().nextInt();  // Again, overwrites 'num'

    StaticTopic st3 = new StaticTopic();
    st3.num = new Random().nextInt();  // Again, overwrites 'num'

    System.out.println(st.num);
    System.out.println(st2.num);
    System.out.println(st3.num);
}

public static void method1(){ // we can  not call non-static method in static method
    System.out.println(" iam a static method 1");
    StaticTopic.num = new Random().nextInt();
    System.out.println(StaticTopic.num );

}


public void method2(){
    method1(); //  we can call static method in non-static method
    System.out.println(" iam a  Non-Static method 2");

}
}
