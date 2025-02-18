package Tests_practise.Java_codePractise;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HashmapCodesPractise {

    @Test
    public static void usingHM(){ // character count of a string
        String s = "jaadhgjrejgujjkdfmk";
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c: ch) {
// This checks if the character c is not already a key in the HashMap (hm).
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            }
            else{
// if the key is already present in the hashmap it will increase value in HashMap
                hm.put(c , hm.get(c)+1);
            }
        }
        System.out.println(hm);
    }

// find the occurence of each word in a list of the string
@Test
    public static void forstrings(){

        String s1 ="hii shiva kumar hii kanthula shiva";
        String[] s = s1.split(" ");

        HashMap<String, Integer>  hm = new HashMap<>();
        for(String str : s){
            if(!hm.containsKey(str)){
                hm.put(str,1);
            }
            else {
                hm.put(str , hm.get(str) +1);
            }
        }
        System.out.println(hm);
    }

// count the characters in a stirng
@Test
    public static void charcount(){

        String s = "ndsfbhgsfnngg";
        int count = 0;
        for( int i=0;i<s.length(); i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
    System.out.println(count);
    }

// Count the words in a list of string
@Test
    public static void strngscount(){

        String s1 ="hii shiva kumar hii kanthula shiva";
        String[] s2 = s1.split(" ");
        int count =0;
        for( int i=0;i<s2.length;i++){
// Check if the word is not empty
            if(!s2[i].isEmpty());
            count++;
        }
        System.out.println(count);
    }

@Test
    public static void uniqStrngs(){
    String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};

    HashMap<String,Integer> hm = new HashMap<>();
    for( String str : arr){
        hm.put(str , hm.getOrDefault(str,0)+1);

    }
    System.out.println(hm);
    for(Map.Entry<String,Integer> entry : hm.entrySet()){  // hm.entrySet() Returns a set of key-value pairs from the HashMap.
        if(entry.getValue()==1){  // Map.Entry<K, V> → Represents each entry (key-value pair) in the map.
            System.out.print(entry.getKey());
        }

    }

    }

}
