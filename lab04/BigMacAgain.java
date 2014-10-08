// Adam Weld
// CSE2
// Lab04
// Wed 17 Sep 2014 12:07:36 PM EDT
//
// Calculate cost of BigMac order
//

// import scanner util
import java.util.Scanner;

public class BigMacAgain {
	public static void main(String[] args) {
		double costFries = 2.15;
		double costBigMac = 2.22;
		int nBigMacs;
		int nFries;
		// input section
		// How many Big Macs?
		Scanner myScanner = new Scanner( System.in );
		System.out.print("Enter the number of Big Macs: ");
		if(myScanner.hasNextInt()){
			nBigMacs = myScanner.nextInt();
		} else {
			System.out.println("Please enter an integer!");
			return;
		}
		if(nBigMacs <= 0) {
			System.out.println("Integer must be larger than 0!");
			return;
		} else {
			System.out.println("You ordered " + nBigMacs +
			" Big Macs for a cost of " + nBigMacs + "x" +
			costBigMac + " = $" + nBigMacs * costBigMac);
		}
		System.out.print("Do you want an order of fries? (y/n)");
		// Do you want fries??
		String friesAnswer = myScanner.next();
		if(friesAnswer.equals("Y") || friesAnswer.equals("y")) {
			nFries = 1;
			System.out.println("You ordered fries at a cost of $"
			+ costFries);
		} 
		else if(friesAnswer.equals("N") || friesAnswer.equals("n")) {
			nFries = 0;
		} else {
			System.out.println("Answer must be (Y/y/N/n)!");
			return;
		}
		// calculations
		double costOrder;
		int dollars,
		    dimes,
		    pennies;
		costOrder = nBigMacs * costBigMac + nFries * costFries;
		dollars = (int) costOrder;
		dimes = (int) (costOrder * 10) % 10;
		pennies = (int) (costOrder * 100) % 10;
		// print section
		System.out.println("The total cost of " + nBigMacs + " Big Macs and "
				+ nFries + " orders of fries"
				+" is $" + dollars + '.' + dimes + pennies);
	}
}
