package Tests_practise.Java_codePractise;

import io.cucumber.java.hu.Ha;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MinandMaxStrings {

    public static void main(String[] args){ // using bruteforce method
        String str = "autzomationutestiing";
// If two or more characters have the same minimum frequency,
// only the first one encountered (leftmost in the string) is stored.
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar='\0';
        char minChar='\0';

        for( int i=0;i<str.length();i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j =0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Update max character
            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
            // Update min character (only if it is not already considered)
            if (count < minCount) {
                minCount = count;
                minChar = currentChar;
            }
        }
        System.out.println(" maxCharacters : "+maxChar + " count: "+maxCount );
        System.out.println(" maxCharacters : "+minChar + " count: "+minCount );
    }

    @Test
    public static void minAndMax(){ // uisng HashMap

        String str = "autzomationutestiiiiiing";
        String result ="";

        int maxcout = Integer.MIN_VALUE;
        int mincount = Integer.MAX_VALUE;
        char minchar ='0';
        char maxcchar='0';

        HashMap<Character,Integer> hm = new HashMap<>();
        for( char currentchar : str.toCharArray()){

            hm.put(currentchar,hm.getOrDefault(currentchar ,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : hm.entrySet()){

           char ch = entry.getKey();
          int  count = entry.getValue();

          if( count >maxcout){
              maxcout= count;
              maxcchar = ch;
          }
          if(count < mincount){
              mincount = count ;
              ch = minchar;
          }

        }
        System.out.println(" maxCharacters : "+maxcchar + " count: "+maxcout );
        System.out.println(" maxCharacters : "+minchar + " count: "+mincount );

    }
}
