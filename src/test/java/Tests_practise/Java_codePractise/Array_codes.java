package Tests_practise.Java_codePractise;

import java.util.Arrays;

public class Array_codes {


    public static void using_Arraymethod(int[] arr){

        Arrays.sort(arr);
        int s = arr[arr.length-2]; // fetches the value in a array
//      int b = arr.length-2 // fetches the index position
        System.out.println(s);
    }



    public static void Withoutusing_Arr(int[] arr) {

        int n = arr.length;
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length-1;j++){

               if(arr[j]>arr[i]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
       }
        System.out.print(Arrays.toString(arr));
    }


    public static void second_large(){

        int[] arr ={1,4,9,7,3,9,20,22,21,25,11,2};

       int max = arr[0];
       int secondmax= arr[0];
       for(int i=1;i<arr.length;i++){

           if(arr[i] >max){
               secondmax = max;
               max = arr[i];
           }
           else if(arr[i]>secondmax){
               secondmax = arr[i];
           }
       }
       System.out.println(max); // prints max int of an array
       System.out.println(secondmax); // prints second max number from an array
    }

    public  static void min_max(){

        int[] arr ={1,4,99,777,3,9,20,22,25,11,2};

        int min = arr[0];
        int max = arr[0];

        for( int i=0;i<arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i]<min){

                min = arr[i];
            }
        }

        System.out.println(max); // prints max int of an array
        System.out.println(min);
    }

    public static void main(String[] args){

        int[] arr = {1,4,99,7,3,9,20,22,25,11,2};

        using_Arraymethod(arr);
        Withoutusing_Arr(arr);
        second_large();
        min_max();

    }
}
