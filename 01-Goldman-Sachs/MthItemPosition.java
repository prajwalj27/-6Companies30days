/*
Problem Link: https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1
Title: Find the position of M-th item 
Difficulty: Easy
Language: Java
*/

public class MthItemPosition {

  static int findPosition(int n, int m, int k) {

    // n-(k-1) is the number of postitions we need to cover from the starting
    // position k to the beginning of the circle i.e the 1st position.
    // If m is less than this value, we can return m+(k-1) 
    if (m <= n - k +1) 
      return m + k - 1;
    
    // now we need to find the remaining no. of items to be distributed 
    // before we reach the 1st position of the circle
    m = m - (n - k + 1);

    return (m % n == 0) ? n : m % n;
  }

  public static void main(String[] args) {
    int n = 5;
    int m = 8;
    int k = 2;

    System.out.println(findPosition(n, m, k));
  }
}
