package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class RegulaExp {

    public static void main(String[] args){

        String str ="fdMNLSDEJjkniug32487$YQJ843$*&$*";

        String letters = str.replaceAll("[^a-zA-Z]","");
        String numbers = str.replaceAll("[^0-9]","");
        String specials = str.replaceAll("[A-Za-z0-9]","");
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specials);
    }

 @Test
    public static void rmvsplChar(){
        String[] arr = {"Hi@#7678","are","y0u","Ka@nthu&","shiv@a"};

        for(int i=0; i<arr.length;i++){
           arr[i] = arr[i].replaceAll("[^A-Za-z]","");
        }
        for(String s :arr){
            System.out.print(s + " ");
        }
    }


@Test
    public static void rmvfrmString(){
        String str = "hii@4309 kanthula4287@# Shiv@a94089";
        String clean = str.replaceAll("[^a-zA-Z0-9\s]","");
        System.out.print(clean);
    }


@Test
    public static void usingCharClass(){
        String str ="fdMNLSDEJjkniug32487$YQJ843$*&$*";

        String letters ="";
        String number = "";
        String specials ="";
        for( char c : str.toCharArray()){
            if (Character.isLetter(c)) {
                letters += c;
            }
            else if(Character.isDigit(c)){
                number += c;
            }
            else{
                specials += c;
            }
        }
        System.out.println(letters);
        System.out.println(number);
        System.out.println(specials);
    }
}
