package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

//Printing patterns
public class PatternsCodes {

    public static void main(String[] args) { // [ChristmasTree]0r Pyramid
        int height = 3;
        for (int i = 1; i<= height; i++) {
            for (int k=1; k <= height- i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
@Test
    public static void trinagle(){
        int height=5;
        for( int i=0;i<=height-1;i++){
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
@Test
    public static void revTriangle(){
        int height = 5;
        for( int i=height;i>=1;i--) { // traverse form reverse
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }



