/*
Problem Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/
Title: Greatest Common Divisor of Strings
Difficulty: Easy
Language: Java
*/

public class GcdForStrings {

  static String gcdOfStrings(String str1, String str2) {
    // for this solution we need length of str2 to be less than str1,
    // if length of str1 < str2, we swap str1 and str2 
    if (str1.length() < str2.length()) {
      return gcdOfStrings(str2, str1);

    // if the str1 and str2 totally different strings
    }else if (!str1.startsWith(str2)) {
      return "";

    }else if (str2.length() == 0) {
      return str1;

    // use the same logic as gcd of integers for the strings
    }else {
      return gcdOfStrings(str1.substring(str2.length()), str2);
    }
  }

  public static void main(String[] args) {
    String str1, str2;

    str1 = "ABABAB";
    str2 = "ABAB";
    System.out.print(gcdOfStrings(str1, str2));
  }
}
