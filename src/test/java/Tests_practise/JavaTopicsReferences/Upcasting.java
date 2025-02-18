package Tests_practise.JavaTopicsReferences;

public class Upcasting {

    public int a=10;

    void vechile(){

        System.out.println("Iam using vechile method");
    }
}

class car extends Upcasting{

    public int a =20;  // Variable hiding

    void benz(){
        System.out.println("Iam using car method");
    }
}

  class Main{

    public static void main(String[] args){

        car call = new car();
        Upcasting ref = new car(); // ✅ Upcasting (Superclass reference to Subclass object)

        call.vechile();
        call.benz();
        System.out.println(((car) ref).a);
        System.out.println(ref.a); // Accesses variable from A (Variable Hiding)
    }
}