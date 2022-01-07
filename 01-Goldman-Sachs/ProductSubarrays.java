/*
Problem Link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/
Title: Count the subarrays having product less than k
Difficulty: Hard
Language: Java
*/

public class ProductSubarrays {

  static int countSubarraysProduct(long[] arr, long n, long k) {

    if (k == 0) return 0;

    long product = 1;
    int count = 0;

    for (int i = 0, j = 0; j < n; j++) {
      // move the end bound by 1 step and update the product
      product *= arr[j];

      // if product is greater than equal to target k, we'll move the start 
      // bound by 1 and update the product 
      while (i <= j && product >= k) {
        product /= arr[i++];
      }

      // else we will update the count of subarrays
      count += j - i + 1;
    }

    return count;
  } 

  public static void main(String[] args) {
    long[] a = {1, 1, 1};
    long k = 1;
    long n = 3;
    System.out.println(countSubarraysProduct(a, n, k));
  }
  
}
