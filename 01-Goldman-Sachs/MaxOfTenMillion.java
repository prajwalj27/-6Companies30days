/*
Problem Link: NA
Title: Find max 10 numbers in a list having 10M entries.
Difficulty: Medium
Language: Java
*/

import java.util.Arrays;
import java.util.Collections;

public class MaxOfTenMillion {
  static int[] kLargest(Integer[] arr, int k) {
    // sort the given entries in descending order 
    Arrays.sort(arr, Collections.reverseOrder());

    // return the first k entries as result
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = arr[i];
    }

    return result;
  }


  public static void main(String[] args) {
    Integer[] arr = {12, 123, 3243, 1, 423 ,324 ,23, 2, 3, 23, 4, 5, 45645, 74, 37};
    int k = 10;

    int[] result = kLargest(arr, k);
    System.out.println(Arrays.toString(result));
    
  }
  
}
