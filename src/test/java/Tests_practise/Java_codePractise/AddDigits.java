package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.Arrays;

public class AddDigits {

    public static void main(String[] args) {
       int  num = 55555;
       int sum=0;
       while(num>0){ // Loop to extract and add each digit
           sum = sum + num%10; // Add the last digit to sum
           num= num/10;        // Remove the last digit
       }
       System.out.println(sum);
    }
@Test
    public static void addArray() {
    int[] arr = {24, 56, 756, 452}; // Input array
    int[] result = new int[arr.length]; // Allocates memory for an integer array of size [arr.length] result = {0, 0, 0, 0, 0};

    for( int i=0;i<arr.length;i++){
        result[i] = addArray(arr[i]); // Pass the value at index i to returnsum;
    }
    System.out.println(Arrays.toString(result));
}

public static int addArray(int num ){

        int sum=0;
        while(num>0){           // Loop to extract and add each digit
            sum = sum + num%10; // Add the last digit to sum ex : 25%10 = 5;[Reminder]
            num= num/10;        // Remove the last digit ex : 25/10 = 2; [Quotient]
        }
        return sum;
}
}