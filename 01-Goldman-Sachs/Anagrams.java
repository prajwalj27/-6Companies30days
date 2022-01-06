/*
Problem Link: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
Title: Print Anagrams Together
Difficulty: Medium
Language: Java
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

  static List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      // separate each letter of the string into an array eg. cat = ['c','a','t']
      char[] letters = str.toCharArray();
      // sort them ['c','a','t'] -> ['a','c','t']
      Arrays.sort(letters);
      String keyString = String.valueOf(letters);
      
      // now we'll store it in hashmap as 
      // {str1: [list of anagrams], str2: [list of anagrams],...}

      // if adding this string for the 1st time in Hashmap
      if (!map.containsKey(keyString)) {
        map.put(keyString, new ArrayList<>());
      }

      // add the anagrams of the of the keyString as a Arraylist
      map.get(keyString).add(str);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    List<List<String>> result = groupAnagrams(strs);
    System.out.println(result);
  }
  
}
