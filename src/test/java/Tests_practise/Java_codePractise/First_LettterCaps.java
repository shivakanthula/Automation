package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class First_LettterCaps {
@Test
// without uisng String0BUilder() class
    public static void lettercaps(String s){

       String[] s2 = s.split(" ");
        String result = "";
        for(String word : s2){
            result += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(result);
    }

// Same process using StringBuilder() class
    @Test
    public static void asingSB(String s){
        String[] s1 = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for( String word : s1){
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(sb);
    }
    @Test
    public static void main(String[] args){

        asingSB("hii s o p j kanthula");
        lettercaps("hii shiva kumar gghj kanthula");


    }
}
