package Tests_practise.Java_codePractise;

import java.util.Arrays;
import java.util.*;

public class regular_Expressions {

    public static void filter(String s1){

        String fltr = s1.replaceAll("[^A-Za-z' ']","");
        String caps = s1.replaceAll("[^A-Za-z]","");
        System.out.println(caps);
        System.out.println(fltr);
    }

    public static void remove_un(String[] arr){
        for( int i=0;i<arr.length-1;i++){
            arr[i] = arr[i].replaceAll("^A-Za-z","");
//            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args){
        String[] arr = {"hi@#","are","aa","ka@nthu&","shiv@a"};
        filter("K@anthu&l@a  k Shi36556^@v@a");
//        remove_un(arr);
    }
}







