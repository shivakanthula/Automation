package Tests_practise.Java_codePractise;

import java.util.HashMap;

public class TargetSum { // wo elements in the array whose sum equals the target value:

    public static void main(String[] args) {

        int[] arr = {12, 14, 3, 7, 18, 9};
        int target = 17;
        int comp=0;

    HashMap<Integer,Integer> hm= new HashMap<>();

    for( int i=0;i<arr.length;i++){
        comp= target - arr[i]; // arr[0] = 17 - 12 = 5,arr[1] = 17-14=3, arr[2]=17-3=14
        if(hm.containsKey(comp)){
           System.out.println ( hm.get(comp)+ "," +i); // hm.get(comp) -- arr[1]-stored index ,  Curent Index [i]--arr[2]
        return;
        }
            hm.put(arr[i],i);// arr[0] =12,arr[1]=14,
    }
        System.out.println(" No pair found");
    }
}
