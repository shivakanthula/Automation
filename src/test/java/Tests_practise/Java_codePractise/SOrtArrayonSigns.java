package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SOrtArrayonSigns {


    @Test
    public static void negativeOneSide() {

        int[] arr = {-1, 2, 3, -4, -7, 8 , 4,-3,-2};
        int [] result= new int[arr.length];
        int index = 0;
        for( int i=0;i<arr.length;i++) {

            if (arr[i] < 0) {

                result[index] = arr[i];
                index++;
//                System.out.println(Arrays.toString(result));
            }
        }
        for(int j=0;j<arr.length;j++){

            if(arr[j]>=0){
                result[index] = arr[j];
                index++;
            }
//            System.out.println(Arrays.toString(result));
        }
        System.out.print(Arrays.toString(result));
    }
}