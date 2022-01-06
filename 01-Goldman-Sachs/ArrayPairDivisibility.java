/*
Problem Link: https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1
Title: Array Pair Sum Divisibility Problem
Difficulty: Easy
Language: Java
*/

import java.util.HashMap;

public class ArrayPairDivisibility {
  static boolean canPair(int[] arr, int k) {
    // if the arr length is odd, then pairs cannot be made
    if (arr.length % 2 != 0) {
      return false;
    }

    // we will find the remainder of each element
    // the frequency of each remainder will be stored in HashMap
    HashMap <Integer, Integer> hMap = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      // we use this formula to handle the remainders of negative integers also
      int remainder = ((arr[i] % k) + k) % k;

      if (!hMap.containsKey(remainder)) {
        // when the remainder is entered in the Hashmap for the 1st time
        hMap.put(remainder, 0);
      }
      // if remainder already present, increase the count by 1
      hMap.put(remainder, hMap.get(remainder) + 1);
    }

    // Now we'll check if pairing is possible or not
    for (int i = 0; i < arr.length; i++) {
      int remainder = ((arr[i] % k) + k) % k;

      // case 1
      if (2 * remainder == k) {
        if (hMap.get(remainder) % 2 != 0) {
          return false;
        }
      } 
      // case 2
      else if (remainder == 0) {
        if (hMap.get(remainder) % 2 != 0) {
          return false;
        }
      }
      // case 3
      else {
        if (hMap.get(remainder) != hMap.get(k - remainder)) {
          return false;
        }
      }

    }
				
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 92, 75, 65, 48, 45, 35 };
    int k = 10;
    System.out.println(canPair(arr, k));
  }
  
}