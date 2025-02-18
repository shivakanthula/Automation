package Tests_practise.OOPS;

import org.testng.annotations.Test;

public class Polymorphism {

// methodoverloading is occurs when same method Name but different in size,order,type of the parameters
    public void add(int num,int num2){
        int reasult = num - num2;
        System.out.println(reasult);
    }
    public void add(int num , int num2,int num3){
        int reasult = num + num2+num3;
        System.out.println(reasult);
    }

    public void overrideMe(){
        int shi = 100;
        int result = shi*10;
        System.out.println(result);
    }

@Test
    public  void call(){
// static polymorphism, complietime time polymorphism, [MethodOverloading]
        Polymorphism poli = new Polymorphism();
        poli.add(2,5,4);
        poli.add(100,8);
    }

}

class MethodOverridding  extends Polymorphism{

public static void main(String[] args){
    Polymorphism poli = new Polymorphism();
    poli.call();
    poli.overrideMe();

    MethodOverridding over = new MethodOverridding();

    over.overrideMe();
    over.call();
}

@Override
public  void overrideMe(){
    System.out.println(" iam writing my overrideMe implementation");
}

@Override
    public  void call(){
        System.out.println(" iam writing my call  implementation");

    }

}
