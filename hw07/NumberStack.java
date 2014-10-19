// Adam Weld
// CSE2
// HW07
// 10/19/14
//
// Number Stacks using different loops

// import scanner
import java.util.Scanner;

//create class
public class NumberStack {
  //main method
  public static void main(String args[]) {
    System.out.printf("\t \t Enter a number between 1 and 9: "); //prompt
    Scanner input = new Scanner(System.in); //initialize scanner
    
    //make sure input is correct
    while(!input.hasNextInt()) {
      System.out.println("Not an int!");
      return;
    }
    int n = input.nextInt(); //n is inputted num
    if(n < 1 || n > 9) { //check range
      System.out.println("Number must be in range [1,9]");
      return;
    }
    
    //run stack prints with n
    StackFor(n);
    StackWhile(n);
    StackDoWhile(n);
  }
  
  public static void StackFor(int x) { //for loop method
    System.out.println("Using for loops:");
    for(int i = 1; i <= x; i++) { //runs once per number printed
      for(int j = 0; j < i; j++) { //runs once per line of numbers
        
        for(int p = 0; p < i; p++) { //prints a row of numbers
          System.out.print(i); //printing starts at 1, goes to x
        }
        System.out.printf("\n"); //break
      }
      
      //print dashes to seperate numbers
      for(int y = 0; y < i; y++){
        System.out.print("-");
      }
      System.out.printf("\n"); //break
    }
  }
  
  public static void StackWhile(int x) {
  }

  public static void StackDoWhile(int x) {
  }
}
