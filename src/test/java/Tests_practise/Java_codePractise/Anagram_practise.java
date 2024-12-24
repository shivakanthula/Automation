package Tests_practise.Java_codePractise;

import java.util.Arrays;

public class Anagram_practise {
    public static boolean anagram(String s1,String s2) {

// Check the length of the stings and compare it
        if (s1.length() != s2.length()) {
            return false;
        }
// covert the string to char[]
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

// Sort the array order and comparen the order of characters
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Arrays.equals(arr1, arr2);
        return true;
    }

    public static void main(String[] args){

        String s1="silleent";
        String s2="lislteen";

        if(anagram(s1,s2)){

            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
