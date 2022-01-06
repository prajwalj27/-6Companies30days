/*
Problem Link: https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1
Title: Find the position of M-th item 
Difficulty: Easy
Language: Java
*/

public class MthItemPosition {

  static int findPosition(int n, int m, int k) {

    if (m <= n - k +1) 
      return m + k - 1;
    
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
