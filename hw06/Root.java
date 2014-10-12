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
    System.out.print("Input: "); //ask for user input
    Boolean goodInput = input.hasNextDouble(); //double signifies whether input was a Double or not
    if (goodInput) { //if good
      double x = input.nextDouble(); //assign x to input
      if (x <= 0 ) { //negative input
        System.out.println("Input must be positive");
        return;
      }
      double low = 0, high = x + 1; //vars are upper/lower bounds for root value
      while ((high - low) > (1+x)*0.0000001) { //difference between high and low must be small to satisfy condition, meaning accuracy of root approximation is high
        double middle = (low + high) / 2; //temporarily find middle of high and low vals
        if (Math.pow(middle,2) > x) { //reassign either high or low to middle value
          high = middle; 
        } else {
          low = middle;
        }
      }
      //print results
      System.out.println("Root = " + (high + low)/2);
    } else { //if !goodInput
      System.out.println("Bad Input");
    }
  }
}
