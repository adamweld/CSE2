// Adam Weld
// CSE2
// LAB03
// Wed 10 Sep 2014 12:34:25 PM EDT
// program to compute the cost of buying big macs
//
import java.util.Scanner;

public class BigMac {
	public static void main(String[] args) {
		// input section
		Scanner myScanner = new Scanner( System.in );
		System.out.print("Enter the number of Big Macs: ");
		int nBigMacs = myScanner.nextInt();
		System.out.print("Enter the cost per Big Mac: $");
		double costBigMac = myScanner.nextDouble();
		System.out.print("Enter the percent tax: %");
		double taxRate = myScanner.nextDouble();
		taxRate /= 100; // convert percentage to decimal value
		// calculations
		double costOrder;
		int dollars,
		    dimes,
		    pennies;
		costOrder = nBigMacs * costBigMac * (1 + taxRate);
		dollars = (int) costOrder;
		dimes = (int) (costOrder * 10) % 10;
		pennies = (int) (costOrder * 100) % 10;
		// print section
		System.out.println("The total cost of " + nBigMacs + " Big Macs, at $"
				+ costBigMac + " per Big Mac, with"
				+ " sales tax of " + (int)(taxRate * 100) + "%"
				+" is $" + dollars + '.' + dimes + pennies);
	}
}
