/*
Problem Link: https://leetcode.com/problems/minimum-size-subarray-sum/
Title: Minimum Size Subarray Sum
Difficulty: Medium
Language: Java
*/

public class MinSizeSubArray {

  static int minSubArrayLen(int target, int[] nums) {
    int i = 0, j = 0, sum = 0;
    int min = Integer.MAX_VALUE;

    while (j < nums.length) {
      sum += nums[j++];

      while (sum >= target) {
        min = Math.min(min, j - i);
        sum -= nums[i++];
      }
    }

    return min == Integer.MAX_VALUE ?  0 : min;
  }
  
  public static void main(String[] args) {
    int[] nums = {2,3,1,2,4,3};
    int target = 7;

    System.out.println(minSubArrayLen(target, nums));
  }
}
