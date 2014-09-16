// Adam Weld
// CSE2
// Wed 10 Sep 2014 12:27:22 PM EDT
// program to estimate cube root of inputed number
// also prints the value of the estimate cubed

// imports
import java.util.Scanner;

public class Root {
	
	// define main method
	public static void main(String[] args) {
		
		// program input 
		Scanner myScanner = new Scanner(System.in); //create new scanner myScanner to take user input
		System.out.print("Input a double for root approximation: "); //input dialog
		double nInput = myScanner.nextDouble(); //query user for a double input
		
		// calculations
		// 8 iterations of increasing accuracy to guess the root
		double rootGuess = (nInput / 3); //first guess root as input / 3
		rootGuess = (rootGuess * rootGuess * rootGuess * 2 + nInput) / (rootGuess * rootGuess * 3); //improve guess
		rootGuess = (rootGuess * rootGuess * rootGuess * 2 + nInput) / (rootGuess * rootGuess * 3);
		rootGuess = (rootGuess * rootGuess * rootGuess * 2 + nInput) / (rootGuess * rootGuess * 3);
		rootGuess = (rootGuess * rootGuess * rootGuess * 2 + nInput) / (rootGuess * rootGuess * 3);
		rootGuess = (rootGuess * rootGuess * rootGuess * 2 + nInput) / (rootGuess * rootGuess * 3);
		System.out.println("Cube root guess: " + rootGuess); //print best approximation
		System.out.println("Guess to the third power: " + rootGuess * rootGuess * rootGuess); //print apprximation to the third power, to see how close it is to the real cube root
	}
}
