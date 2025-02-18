package Tests_practise.JavaTopicsReferences;

    // Parent Class
    class Parent {
        // Constructor of Parent
        public Parent() {
            System.out.println("Parent class default constructor called.");
        }
        // Parameterized Constructor of Parent
        public Parent(String name) {
            System.out.println("Parent class parameterized constructor called. Name: " + name);
        }
    }
    // Child Class
    class Child extends Parent {
        // Default Constructor of Child
        public Child() {
            // Explicitly calling the default constructor of Parent
            super();
            System.out.println("Child class default constructor called.");
        }

        // Parameterized Constructor of Child
        public Child(String name, int age) {
            // Explicitly calling the parameterized constructor of Parent
            super(name);
            System.out.println("Child class parameterized constructor called. Age: " + age);
        }
    }

    // Main Class
    public class ConstructorExample {
        public static void main(String[] args) {
            // Creating an object using default constructor
            Child child1 = new Child();

            // Creating an object using parameterized constructor
            Child child2 = new Child("Shiva", 25);
        }
    }

