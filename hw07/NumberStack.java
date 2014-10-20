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
      int width = i * 2 - 1; //width starts at one, increases by 2
      int spaces = x-i; //number of spaces to add before line
      for(int j = 0; j < i; j++) { //runs once per line of numbers

        //print blank space to center
        for(int k = 0; k < spaces; k++) {
          System.out.print(" ");
        }

        //print (x) rows of x
        for(int p = 0; p < width; p++) {
          System.out.print(i); //printing starts at 1, goes to x
        }
        System.out.printf("\n"); //break
      }

      //print blank space to center
      for(int k = 0; k < spaces; k++) {
        System.out.print(" ");
      }

      //print dashes to seperate numbers
      for(int y = 0; y < width; y++){
        System.out.print("-");
      }
      System.out.printf("\n"); //break
    }
  }

  public static void StackWhile(int x) {
    System.out.println("Using while loops:");
    //print x iterations of number stacks
    int num = 1; //start with 1
    while(num <= x) {

      //print num lines
      int countLines = 0;
      int width = num * 2 - 1; //width starts at one, increases by 2
      int spaces = x-num; //number of spaces to add before line
      while(countLines < num) {
        //print spaces
        int countSpaces = 0;
        while(countSpaces < spaces) {
          System.out.print(" ");
          countSpaces++;
        }

        //print num rows of num
        int countRows = 0;
        while(countRows < width) { //prints num * width
          System.out.print(num);
          countRows++;
        }
        System.out.printf("\n"); //break
        countLines++;
      }
      //print spaces
      int countSpaces = 0;
      while(countSpaces < spaces) {
        System.out.print(" ");
        countSpaces++;
      }

      //print num dashes to seperate numbers
      int countDashes = 0;
      while(countDashes < width) {
        System.out.print("-");
        countDashes++;
      }
      System.out.printf("\n"); //break
      num++; //increment number being printed
    }
  }

  public static void StackDoWhile(int x) {
    System.out.println("Using do while loops:");
    //print x iterations of number stacks
    int num = 1; //start with 1
    do {

      //print num lines
      int countLines = 0;
      int width = num * 2 - 1; //width starts at one, increases by 2
      int spaces = x-num; //number of spaces to add before line
      do {
        //print spaces
        int countSpaces = 0;
        do {
          if(spaces == 0) break; //exception when spaces is 0; if statement needed
          System.out.print(" ");
          countSpaces++;
        } while(countSpaces < spaces);

        //print num rows of num
        int countRows = 0;
        do { //prints num * width
          System.out.print(num);
          countRows++;
        } while(countRows < width);
        System.out.printf("\n"); //break
        countLines++;
      } while(countLines < num);

      //print spaces
      int countSpaces = 0;
      do {
        if(spaces == 0) break; //special case spaces == 0
        System.out.print(" ");
        countSpaces++;
      } while(countSpaces < spaces);

      //print num dashes to seperate numbers
      int countDashes = 0;
      do {
        System.out.print("-");
        countDashes++;
      } while(countDashes < width);

      System.out.printf("\n"); //break
      num++; //increment number being printed
    } while(num <= x);
  }
}
