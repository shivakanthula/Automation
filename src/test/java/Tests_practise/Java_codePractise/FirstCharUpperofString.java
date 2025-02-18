package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class FirstCharUpperofString {

@Test
    public static void upperCase(){
        String str ="Hii bollineni";
        String result = str.toUpperCase(); // making sting to UpperCase
        String lower = str.toLowerCase(); // making sting to LowerCase
        System.out.println(result);
        System.out.println(lower);
    }

    public static void main(String[] args){

        String str = "hii shiva kumar kanthula";
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for( String word : s){
            if(!word.isEmpty()){
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        System.out.println(sb.toString());

    }

}
