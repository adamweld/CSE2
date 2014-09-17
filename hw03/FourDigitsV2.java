// Adam Weld
// CSE2
// Wed 10 Sep 2014 12:29:41 PM EDT
// program to print the first four digits after the decimal point of an inputed double
//

// inputs
import java.util.Scanner;

public class FourDigitsV2 { //create main method
	public static void main(String[] args) { //create main method

		// input section
		Scanner myScanner = new Scanner( System.in ); //create new scanner for user inputs
		System.out.print("enter double to be converted: "); //query user for double input
		double nInput = myScanner.nextDouble(); //set var nInput to user input

		// computations
		int truncatedInput = (int) nInput; //get value left of decimal point
		double fourDigits = nInput - truncatedInput; //get just the decimal value
		int n1 = (int) (fourDigits * 10); //calculate first decial digit
		int n2 = (int) (fourDigits * 100)%10;
		int n3 = (int) (fourDigits * 1000)%10;
		int n4 = (int) (fourDigits * 10000)%10;

		//print
		System.out.println("first four decimal digits: " + n1 + n2 + n3 + n4);
	}
}
