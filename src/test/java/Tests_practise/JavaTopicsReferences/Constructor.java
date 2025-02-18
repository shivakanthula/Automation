package Tests_practise.JavaTopicsReferences;

// constuctor is used for creating memory to variables and methods
public class Constructor {

  public int i;   // assigning values to instance variables using constructors
    public int j;

    public static void main(String[] args){

        Constructor son = new Constructor(); // Calls default constructor
        Constructor son2 = new Constructor(399); // Calls single-parameter constructor
        Constructor son3 = new Constructor(299 , 1999); // Calls two-parameter constructor

        System.out.println(son.i);// Prints 111 (initialized in default constructor)
        System.out.println(son2.i); // Prints 399 (assigned in single-parameter constructor)
        System.out.println(son3.i);  // Calls two-parameter constructor
        System.out.println(son3.j);
    }

    public Constructor(){ // Default constructor
        i=111;
    }

    public  Constructor(int num){ // Single-parameter constructor
        i = num;
    }

    public  Constructor(int num , int num2){ // // Two-parameter constructor
        i = num2;
        j = num;
    }


}
