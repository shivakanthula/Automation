package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayCodes {

    @Test
    public static void revArray() {
        int arr[] = {4, 65, 8, 3, 9, 5, 3}; // arr.length =6
        int result[] = new int[arr.length]; // result={0,0,0,0,0,0,0} - assign memory
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            result[i] = arr[n - 1 - i];// arr.length=6 -1-0 = arr[5]- index result[0]= arr[5]
        }
        System.out.println(Arrays.toString(result));
    }

    @Test

    public static void reverse() {
        int[] arr = {2, 4, 5, 3, 4, 8, 9};
        int k = 0;
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k] = arr[i];
            k++;

        }
        System.out.println(Arrays.toString(res));
    }

    @Test
    public static void printminMax() {

        int[] arr = {12, 10, 3, 5, 8, 2, 7, 22};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
// compare with array arr check for maximum condition
            if (arr[i] > max) {
                max = arr[i];
            }
// compare with array arr[i] check for minimum condition
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }

    @Test
    public static void sortArray() {
        int[] arr = {1, 2, 4, 3, 4, 9, 20, 3, 5, 0, 6};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // 20>3
                    int temp = arr[i];       // Store the current element in a temporary variable.
                    arr[i] = arr[j];        // Replace the current element with the next element.
                    arr[j] = temp;         // Replace the next element with the value stored in the temporary variable.
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public static void printDuplicatesArr() {
        int[] arr = {1, 2, 4, 3, 4, 9, 20, 3, 5, 0, 6, 9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }


    @Test
    public static void uniqueeArray() {
        int[] arr = {1, 2, 4, 3, 4, 9, 20, 3, 5, 0, 6, 9};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}



