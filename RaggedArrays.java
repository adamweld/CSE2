// Adam Weld
// CSE2
// 4 Dec 2014 (Thu)
// Ragged Arrays + Sorting

import java.util.*;
public class RaggedArrays {
  public static void main(String args[]) {
    Random rand = new Random();
    int[][] array = new int[5][];
    for(int i = 0; i < 5; i++) {
      array[i] = new int[i * 3 + 5];
      for(int j = 0; j < i * 3 + 5; j++) {
        array[i][j] = rand.nextInt(40);
      }
    }
    System.out.println("The array before sorting");
    print(array);
    sort(array);
    System.out.println("The array after sorting");
    print(array);
  }
  public static void sort(int[][] x) {
    for(int i = 0; i < x.length; i++) {
      Arrays.sort(x[i]);
    }
  }
  public static void print(int[][] x) {
    for(int i = 0; i < x.length; i++) {
      System.out.println(Arrays.toString(x[i]));
    }
  }
}
