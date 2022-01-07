/*
Problem Link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/
Title: Count the subarrays having product less than k
Difficulty: Hard
Language: Java
*/

public class ProductSubarrays {

  static int countSubarraysProduct(long[] arr, long n, long k) {
    long product = 1;
    int start = 0, end = 0, count = 0;

    while (end < n) {
      // move the end bound by 1 step and update the product
      product *= arr[end];

      // if product is greater than equal to target k, we'll move the start 
      // bound by 1 and update the product 
      while (product >= k) {
        product /= arr[start++];
      }

      // else we will update the count of subarrays
      count += end - start + 1;
      end++;
    }

    return count;
  } 

  public static void main(String[] args) {
    long[] a = {1, 9, 2, 8, 6, 4, 3};
    long k = 100;
    long n = 7;

    System.out.println(countSubarraysProduct(a, n, k));
  }
  
}
