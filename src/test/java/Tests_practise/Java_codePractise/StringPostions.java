package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class StringPostions {

    @Test
    public static void positonchnages() {
// sorting the positions of  characters in a string [even char to odd char]
        String str = "hiikanhtula";
        String s = "";

        for( int i=0;i<str.length()-1;i= i+2){
            s= s + str.charAt(i+1) + str.charAt(i);
        }
        if(str.length()%2 !=0){
            s = s +  str.charAt(str.length()-1);
        }
        System.out.println(s);
    }

@Test
    public static void wordpostionchnges(){
// sorting the positions of  words in a string [even word to odd word]
        String s = "hii shiva kumar hii kanthula shiva jii bolo";
        String[] str = s.split(" ");
        String output = "";

        for(int i=0; i<str.length-1;i= i+2){
            output = output  + " "+ str[i+1] + " "+ str[i];
        }
        if(str.length %2 !=0){
            output = output +" "+  str[str.length-1];
        }
        System.out.println(output);
    }

 @Test
    public static void revwordsinoddposition(){
     String s = "hii shiva kumar hii kanthula shiva jii ";
     String[] str = s.split(" ");

     for(int i=0;i<str.length;i++) {
         if (i % 2 != 0) {
//  Reverse words at odd positions (array index 0, 2, 4, etc.)
             String s1 = new StringBuilder(str[i]).reverse().toString();
             System.out.print(s1 + " ");
         }
         else{
//    Print words at even positions (array index 1, 3, 5, etc.)
             System.out.print(str[i] + " ");
         }
     }
 }

 @Test
// Without uisng stringbuilder rev the string postions based on requirement[odd or even]
    public static void notusingSB(){

     String s = "hii shiva kumar hii kanthula shiva jii ";
     String str[] = s.split(" ");

     for( int i=0;i<str.length;i++){
         if(i%2 ==0){
             String s1 = str[i];
             String rev = "";
 // use string rev logic
             for( int j=0;j<s1.length();j++){
                 rev =  s1.charAt(j) + rev ;
             }
             System.out.print(rev + " ");
         }
         else {
             System.out.print(str[i] +" ");
         }
     }
 }

}
