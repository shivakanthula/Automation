package Tests_practise.Java_codePractise;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args){

        String[] arr = {"ate","tea","eat","tan"};

        List<List<String>> groupAnagrams = groupAnagrams(arr);
        System.out.println(groupAnagrams);

    }

    public static List<List<String>> groupAnagrams(String[] str){

// If the input array is empty, return an empty list directly.
        if(str == null || str.length ==0){
            return new ArrayList<>();

        }

//A list of strings that are anagrams and share the same sorted key.
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s : str){

// Convert the string to a character array, sort it, and convert it back to a string
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch);

// Add the original string to the corresponding group in the map
// If the sortedKey is not already a key in the map, create a new list (computeIfAbsent).
// If sortedKey does not exist, the lambda function (k -> new ArrayList<>()) is executed to create a new empty ArrayList,
// which is then stored in the map with sortedKey as the key. The newly created list is returned.
            hm.computeIfAbsent(sortedKey , K-> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(hm.values());
    }
    }
