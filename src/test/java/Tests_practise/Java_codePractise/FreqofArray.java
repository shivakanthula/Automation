package Tests_practise.Java_codePractise;

import groovy.util.MapEntry;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreqofArray {

@Test
    public static void arrfre() {
    int[] arr = {2, 2, 3, 4, 4, 4, 5, 7, 7,7,7, 7, 5, 0, 0};

    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int num : arr){
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
//    System.out.println(hm);
    for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

        if( entry.getValue() >=2){
            System.out.println(entry);
        }
    }
}
@Test
public static void arrayfreSpecific(){
    int[] arr = {2, 2, 3, 4, 4, 4, 5, 7, 7,7,7, 7, 5, 0, 0};
    int[] num = new int[256];

    for(int i=0;i<arr.length;i++){

        int n = arr[i];
        num[n]++;
    }

    int target = 7;
    System.out.println(target +  "=" + num[target]);
}

}
