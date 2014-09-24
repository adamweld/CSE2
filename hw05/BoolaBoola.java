// Adam Weld
// Wed 24 Sep 2014 02:19:53 PM EDT
// CSE2
// HW05
// BoolaBoola.java
//
// Program to test user on boolean manipulation
//

//import Scanner util
import java.util.Scanner;

//create main class
public class BoolaBoola {

	//create main method
	public static void main(String args[]) {

		//create new Scanner to take user input
		Scanner input = new Scanner(System.in);
		
		//create 3 random booleans
		//value 0 is false, value 1 is true
		boolean boolA = (int) (Math.random()*2) == 0; //returns either 0 or 1
		boolean boolB = (int) (Math.random()*2) == 0; //50% of the time will be true
		boolean boolC = (int) (Math.random()*2) == 0; //else false

		//create random operators (&& or ||)
		//value 0 is AND, value 1 is OR
		boolean opA = (int) (Math.random()*2) == 0;
		boolean opB = (int) (Math.random()*2) == 0;
		
		//start to create question for user
		//a string will be assembled
		String question = "Does ";
		//switches will be used to add on to the question
		//also a few if/else statements
		if (boolA) question += "true "; //if boolA is true, add "true" to the question string
		else question += "false "; //otherwise add false

		//assemble statement
		//first two booleans and first operator are assessed
		boolean firstOp;
		if (opA) { //OR operator
			//are boolA OR boolB true?
			firstOp = boolA || boolB;
			question += "|| ";
		}			
		else { //AND operator
			//are boolA AND boolB true?
			firstOp = boolA && boolB;
			question += "&& "; //keep adding to question string!
		} //firstOp is now assigned to the result of the first operator

		//this is the same logic as above	
		if (boolB) question += "true "; //if boolA is true, add "true"
		else question += "false "; //otherwise add false

		//now test rest of statement
		boolean secondOp;
		if (opB) { //OR operator
			//are first part of statement OR boolC true?
			secondOp = firstOp || boolC;
			question += "|| ";
		}			
		else { //AND operator
			//are first part of statement AND boolC true?
			secondOp = firstOp && boolC;
			question += "&& ";
		} //secondOp now contains the final problem answer

		if (boolB) {
			question += "true "; //if boolA is true, add "true"
		}
		else {
			question += "false "; //otherwise add false
		}

		//now finish question and prompt user
		System.out.print(question + "have the value true(t/T) or false(f/F)? ");
		String response = input.next();
		//interpret response
		boolean responseBool;
		switch (response) {
			case "t": case "T": responseBool = true; break;
			case "f": case "F": responseBool = false; break;
			default: System.out.println("Not a valid response!"); return;
		}
		//did they answer correctly?
		if (responseBool == secondOp) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect! Try again.");
		}
	}

}

