// Adam Weld
// lab11
// 10 Nov 2014 (Mon)
// Arrays

import java.util.Scanner;

public class Arrays {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner (System.in);
    int[] myArray = new int [10];
    int myArrayMax = 0, myArrayMin = 0, sum = 0;
    System.out.println("Enter 10 ints: ");
    for(int i = 0; i < 10; i++) {
      System.out.print(i+": ");
      myArray[i] = myScanner.nextInt();
      sum += myArray[i];
      if(myArray[i] > myArrayMax) {
        myArrayMax = myArray[i];
      } else if (myArray[i] < myArrayMin) {
        myArrayMin = myArray[i];
      }
    }
    System.out.println("The lowest entry is " + myArrayMin);
    System.out.println("The highest entry is " + myArrayMax);
    System.out.println("The sum is " + sum);

    int[] myArrayBack = new int [10];
    for(int p = 0; p < 10; p++) {
      myArrayBack[p] = myArray[9-p];
    }
    for(int j = 0; j < 10; j++) {
      //System.out.println(myArray[j] + "   " + myArrayBack[j]);
      System.out.printf("%-5d   %-5d \n",myArray[j],myArrayBack[j]);
    }


  }
}

