// Adam WEld
// CSE2
// hw09
// 30 Oct 2014 (Thu)
//
// block routine through many sub methods
//

import java.util.Scanner;
public class BlockedAgain {
  //make scanner accessible to all classes
  public static final Scanner myScanner = new Scanner(System.in);

  // take in integer input and check range
  public static int getInt() {
    System.out.print("Enter an int in [1,9]: ");
    while(true) { // continue until good input
      if(!checkInt()) { // check if correct input type
        System.out.print("You did not enter an int, try again: ");
        myScanner.next(); // clean bad input
        continue;
      }
      int input =  myScanner.nextInt(); // we know input is an int now...
      if(!checkRange(input)) { // check range
        System.out.print("You did not enter an int in [1,9], try again: ");
        continue;
      }
      // if we get here, input is good
      return input;
    }
  }
  public static boolean checkInt() {
    return myScanner.hasNextInt(); // checks if scanner has int
  }
  public static boolean checkRange(int x) {
    return x >= 1 && x <= 9; // check against range
  }
  // print every block
  public static void allBlocks(int x) {
    for(int i = 1; i <= x; i++) { // call block x number of times
      block(i, x); // block has to know the max digit to calculate spaces
    }
  }
  // print each block with seperator
  public static void block(int x, int max) {
    int width = 2 * x - 1;
    int spaces = max - x; // num spaces before each line
    char c = (char)('0' + x); // converts int to char
    for(int i = 0; i < x ; i++) {
      line(c, width, spaces); // pass through spaces number
    }
    line('-', width, spaces); // seperator line
  }
  // prints lines of char given length and # spaces before chars
  public static void line(char c, int length, int spaces) {
    for(int p = 0; p < spaces; p++) { // print spaces
      System.out.print(' ');
    }
    for(int i = 0; i < length; i++) { // print chars
      System.out.print(c);
    }
    System.out.print("\n"); // new line
  }
  public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
  }
}

