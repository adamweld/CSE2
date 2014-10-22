import java.util.Scanner;
public class HW8{
  // getInput with scanner name , characters to match ONLY
  public static char getInput(Scanner myScanner, String paramIn) {
    while(true) {
      String input = myScanner.next();
      if(input.length() > 1) {
        System.out.print("Enter exactly one character: ");
        continue;
      }
      for(int i = 0; i < paramIn.length(); i++) {
          // if input is equal to one of the parameters
          if(input.charAt(0) == paramIn.charAt(i)) {
            System.out.println("You entered '" + input + "'.");
            return input.charAt(0); //return a char
          }
      }
      // if we reached the end of the while loop, input was (still) bad
      System.out.print("You did not enter a char from list '" 
          + paramIn + "'; try again: ");
    }
  }

  // getInput with scanner name , characters to match AND # tries
  public static char getInput(Scanner myScanner, String paramIn, int tries) {
    int countTries = 0;
    while(countTries < tries) {
      String input = myScanner.next();
      if(input.length() > 1) {
        System.out.print("Enter exactly one character: ");
        continue;
      }
      for(int i = 0; i < paramIn.length(); i++) {
          // if input is equal to one of the parameters
          if(input.charAt(0) == paramIn.charAt(i)) {
            System.out.println("You entered '" + input + "'.");
            return input.charAt(0); // return a char
          }
      }
      // if we reached the end of the while loop, input was (still) bad
      System.out.print("You did not enter a char from list '" 
          + paramIn + "'; try again: ");
      countTries++;
    }
    // if we get here, user failed after 'tries' # of tries
    System.out.println("You failed after " + tries + " tries.");
    return ' ';
  }

  // getInput with scanner name , user prompt, and characters to match
  public static char getInput(Scanner myScanner, String prompt, String paramIn) {
    while(true) {
      System.out.print(prompt); // print prompt passed to function
      // prompt user with correct input possibilites
      System.out.print("Enter one of: ");
      for(int p = 0; p < paramIn.length()-1; p++) {
        System.out.print("'"+paramIn.charAt(p)+"',");
      }
      System.out.print("'"+paramIn.charAt(paramIn.length())+"': ");


      String input = myScanner.next();
      if(input.length() > 1) {
        System.out.print("Enter exactly one character: ");
        continue;
      }
      for(int i = 0; i < paramIn.length(); i++) {
          // if input is equal to one of the parameters
          if(input.charAt(0) == paramIn.charAt(i)) {
            System.out.println("You entered '" + input + "'.");
            return input.charAt(0); // return a char
          }
      }
      // if we reached the end of the while loop, input was (still) bad
      System.out.print("You did not enter an acceptable character");
    }
  }

  public static void main(String []arg){
  char input;
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
  input=getInput(scan,"Cc");
  System.out.println("You entered '"+input+"'");
  System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
  input=getInput(scan,"yYnN",5); // give up after 5 attempts
  if(input!=' '){
    System.out.println("You entered '"+input+"'");
  }
  input=getInput(scan,"Choose a digit.","0123456789");
  System.out.println("You entered '"+input+"'");
  }
}

