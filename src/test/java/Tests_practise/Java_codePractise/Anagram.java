package Tests_practise.Java_codePractise;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args){
// compare given two Strings are anagaram are not;
        String s1 = "ghjjki";
        String s2 = "hjjkig";

// check the length of two strings if length != strings are not anagrams
        if(s1.length() != s2.length()){
            System.out.println("String are not anagrams");
            return;
        }


// convert the sting into char[]
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        // it will store each character in an array


        Arrays.sort(c1);
        Arrays.sort(c2);
 // it will sort characters in array

        for(int i=0;i<c1.length;i++){

// check the chars of both arrays are equal or not
            if(c1[i] != c2[i]){
                System.out.println("Strings are not anagram");
                return;
            }
        }

        System.out.println("Strings are anagrams");
    }
}
