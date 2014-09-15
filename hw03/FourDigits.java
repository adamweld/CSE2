// Adam Weld
// CSE2
// Wed 10 Sep 2014 12:29:41 PM EDT
// program to print the first four digits after the decimal point of an inputed double
//

// inputs
import java.util.Scanner;

public class FourDigits { //create main method
	public static void main(String[] args) { //create main method

		// input section
		Scanner myScanner = new Scanner( System.in );
		System.out.print("enter double to be converted: ");
		double nInput = myScanner.nextDouble();

		// computations
		int truncatedInput = (int) nInput;
		double fourDigits = nInput - truncatedInput; 
		int n1 = (int) (fourDigits * 10);
		int n2 = (int) (fourDigits * 100 - n1 * 10);
		int n3 = (int) (fourDigits * 1000 - (n1 * 100 + n2 * 10));
		int n4 = (int) (fourDigits * 10000 - (n1 * 1000 + n2 * 100 + n3 * 10));
		String outDigits = Double.toString(fourDigits);

		//print
		System.out.println("first four decimal digits: " + n1 + n2 + n3 + n4);
	}
}
