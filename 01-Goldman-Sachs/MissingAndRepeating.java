import java.util.Arrays;

public class MissingAndRepeating {

  static int[] findTwoElements (int[] arr, int n) {
    int[] countArray = new int[n+1];
    int[] result = new int[2];

    for (int i = 0; i < arr.length; i++) {
      // increase the index of countArray that has appeared in the input array
      countArray[arr[i]]++;
    }

    for (int i = 1; i < countArray.length; i++) {
      // find the repeating number
      if (countArray[i] == 2) result[0] = i;

      // find the missing number
      if (countArray[i] == 0) result[1] = i;
    }
    return result;
  } 

  public static void main(String[] args) {
    int[] arr = {2, 2};
    int n = 2;
    int[] result = findTwoElements(arr, n);
    System.out.println(Arrays.toString(result));
  }
  
}
