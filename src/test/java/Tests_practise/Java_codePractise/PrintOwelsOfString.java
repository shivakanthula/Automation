package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.HashMap;

public class PrintOwelsOfString {

    @Test
    public static void owelscode(){

        String s1 = "fmnijdgafnigeburmbfkjmaaandjvnj";
        String s2 = "aeiou";

        HashMap<Character,Integer> count = new HashMap<>();
        for( int i=0;i<s1.length()-1;i++){
            char c = s1.charAt(i);

            if( s2.indexOf(c) != -1){
                count.put(c, count.getOrDefault(c,0)+1);
            }
//            if(c =='a' || c=='e'||c=='i'|| c=='o' || c=='u'){
//                System.out.println(c);
//            }
        }
        System.out.println(count);
    }
}
