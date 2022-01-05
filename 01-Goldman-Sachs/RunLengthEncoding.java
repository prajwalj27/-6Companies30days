/*
Problem Link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1/
Title: Run Length Encoding
Difficulty: Easy
Language: Java
*/

public class RunLengthEncoding {

  static String encode(String str) {
    String ans = "";
    int n = str.length();

    for (int i = 0; i < n; i++) {
      int count = 1;

      // count the occurence of the current character
      while (i < n-1 && str.charAt(i) == str.charAt(i+1)) {
        count++;
        i++;
      }

      // append the character and its count
      ans += str.charAt(i);
      ans += String.valueOf(count);
    }

    return ans;
  } 

  public static void main(String[] args) {
    String str = "wwwwaaadexxxxxxywww";
    System.out.println(encode(str));
  }  
}
