package Tests_practise.Java_codePractise;

import java.util.Arrays;

public class SecndLargeArr {

    public static void main(String[] args){

        int[] arr = {1,2,4,3,4,9,20,3,5,0,6};


        for( int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1;j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array :- " + Arrays.toString(arr));
        System.out.println("Second largest Array :- " +arr[arr.length-3]);
        System.out.println("Smallest array :- " + arr[0]);
    }
}
