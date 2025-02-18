package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class fre_char_duplicates {

    public static void fre_str(String s){
        int[] fre = new int[256];
        for( int i=0;i<s.length();i++){
            char  ch = s.charAt(i);
            fre[ch]++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]>0){
                System.out.print(" "+ (char)i + ":" + fre[i]);
            }
        }
    }

    public static void fre_dup(String ch){
        int[]  freq = new int[256];
        for( int i=0;i<ch.length();i++){
           char s1 =  ch.charAt(i);
            freq[s1]++;
//            System.out.println(freq[s1]);
        }
        for(int i=0;i<freq.length;i++){
            if( freq[i]==2){
                System.out.println(" "+(char) i+ ":" + freq[i] + " " );
            }

        }
    }

@Test
    public static void printspecificChar(){
        String str  = "kjhfiuguiihiiii";
        int[] freq = new int[256];
        for( int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        char target = 'i';
        System.out.println(target + "=" + freq[target]);
    }


@Test
    public static void dupcharandNumSum() { // print sum of numbers and print duplicates in String
    String str = "shivakumar1234kanthula9348";
    int sumofNUm = 0;
    HashMap<Character, Integer> hm = new HashMap<>();
for( int i=0;i<str.length();i++){
    char ch = str.charAt(i);
    if( Character.isDigit(ch)){ // checks for digits in a String
        sumofNUm += Character.getNumericValue(ch);
    }
    else if(Character.isLetter(ch)){ // checks for characters in a String

        hm.put(ch,hm.getOrDefault(ch,0)+1);
    }
}
    System.out.println(sumofNUm);
    for(Map.Entry<Character,Integer> entry : hm.entrySet()){
        if(entry.getValue() >1){
            System.out.println(entry);
        }
    }
}

    public static void main(String[] args){
//        fre_str("aabbcckjiosfjn");
        fre_dup("aabbcckkkkkji");
    }

}
