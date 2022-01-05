/*
Problem Link: https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/
Title: Overlapping Rectangles
Difficulty: Easy
Language: Java
*/

public class OverlappingRectangles {
  public static void main(String[] args) {

    int[] L1 = {0, 10};
    int[] R1 = {10, 0};
    int[] L2 = {5, 5};
    int[] R2 = {15, 0};

    int ans = doOverlap(L1, R1, L2, R2);
    System.out.println(ans);

  }

  // to check if the rectangle overlaps or not: 
  // if overlapping, then returns 1, else returns 0
  static int doOverlap(int[] L1, int[] R1, int[] L2, int[] R2) {
    // if one rectangle is on the left side of the other rectangle
    if (L1[0] > R2[0] || L2[0] > R1[0])
      return 0;

    // if one rectangle is above the other rectangle
    if (R1[1] > L2[1] || R2[1] > L1[1])
      return 0;

    return 1;
  }
  
}
