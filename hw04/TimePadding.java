// Adam Weld
// Wed 17 Sep 2014 07:48:54 PM EDT
// CSE2
// HW04
//

//import Scanner util
import java.util.Scanner;

//create class
public class TimePadding {
  // create main method
  public static void main(String[] args) {

    // take input
    Scanner myScanner = new Scanner(System.in); //create scanner object
    System.out.print("Enter the time in seconds: ");
    int input = myScanner.nextInt(); //take user input

    int hours = (int) (input / 3600); //hours
    int minutes = (int) ((input / 60) - 60 * hours); //total minutes minus hours * 60
    int seconds = (int) (input - minutes * 60 - hours * 3600); //subtract minutes converted back to seconds, hours converted back to seconds

    String minutesFormatted = "" + minutes; //the blank "" lets the int be converted to string
    String secondsFormatted = "" + seconds; //without throwing compile errors

    if (minutes < 10) minutesFormatted = "0" + minutes; //if less than two digits...
    if (seconds < 10) secondsFormatted = "0" + seconds; //format with 0 in front

    // print section
    System.out.println("The time is " + hours + ":" + minutesFormatted
        + ":" + secondsFormatted + ".");
  }
}
