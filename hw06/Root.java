// Adam Weld
// CSE2
// HW06
// Root.java
// Calculate estimate of square root of input double

//import Scanner util
import java.util.Scanner;

//create class + main method
public class Root {
  public static void main(String args[]) {
    //create scanner
    Scanner input = new Scanner (System.in);
    //take double input only
    System.out.print("Input: ");
    Boolean goodInput = input.hasNextDouble();
    if (goodInput) {
      double x = input.nextDouble();
      if (x <= 0 ) {
        System.out.println("Input must be positive");
        return;
      }
      double low = 0, high = x + 1;
      while ((high - low) > (1+x)*0.0000001) {
        double middle = (low + high) / 2;
        if (Math.pow(middle,2) > x) {
          high = middle;
        } else {
          low = middle;
        }
      }
      System.out.println("Root = " + (high + low)/2);
    } else {
      System.out.println("Bad Input");
    }

  }
}
