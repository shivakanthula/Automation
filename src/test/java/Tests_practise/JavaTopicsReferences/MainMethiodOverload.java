package Tests_practise.JavaTopicsReferences;

import org.testng.annotations.Test;

public class MainMethiodOverload {
    static int num=10;

// Note : MainMethod can not be Overrided because it belongs to the class level

    public static void main(String[] args){

        System.out.println(" iam at main method");
        main('c');
//        main(100);

    }

public static void main(int num){
    System.out.println("overloaded int main method  :- " + num);
    return;
}

public static  void main(char ch ){
    System.out.println(" overloaded char main method  :- " + num);
    main(101);
}
}
