/*
Problem Link: https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1
Title: Find total number of Squares in a N*N chessboard
Difficulty: Basic
Language: Java
*/

public class NxNChessboard {

  static Long squaresInChessBoard(long N) {
    // The total no. of squares on a chessboard is n*n+(n-1)*(n-1)+...+1*1
    // i.e. the sum of the squares on 'n' natural numbers
    long result = (N*(N+1)*(2*N+1))/6;
    return result;
  }

  public static void main(String[] args) {
    long n = 8;
    Long ans = squaresInChessBoard(n);
    System.out.println(ans);
  }
  
}
