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
		boolean boolA = (int) (Math.random()*2) == 0;
		boolean boolB = (int) (Math.random()*2) == 0;
		boolean boolC = (int) (Math.random()*2) == 0;