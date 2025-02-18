package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

public class RevStrPreseveWhiteSpaces {

@Test
    public static void presrvSpaces(){// code for preserving whitespaces
        String str = "hii shiva shivaa hii";// avi hslnuhtn akiih
        char[] arr = str.toCharArray();
        int left =0; int right=arr.length-1;
        while(left < right){
            if(arr[left] ==' '){
                left++;
            }
            else if (arr[right]==' ') {
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(arr);
    }
}
