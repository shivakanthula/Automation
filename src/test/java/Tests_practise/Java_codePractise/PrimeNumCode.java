package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class PrimeNumCode {
    @Test
    public static void primeNum() { // check given number is prime or not
        int num = 7;
        boolean prime = true;
        if (num <= 1) {
            prime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        System.out.println(prime);
    }

// Print range of prime number
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 100;
        for( int i=n1; i<=n2; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for( int i=2; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}