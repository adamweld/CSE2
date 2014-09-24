// Adam Weld
// Wed 24 Sep 2014 01:20:07 PM EDT
// CSE2
// HW04
// BurgerKing.java
//
// Program to take user order of a Burger, fries etc.
//

//import Scanner util
import java.util.Scanner;

//create main class
public class BurgerKing {

	//create main method
	public static void main(String args[]) {

		//create new Scanner to take user input
		Scanner input = new Scanner(System.in);

		//initial query
		System.out.println("Enter a letter to indicate a choice of");
		System.out.println("    Burger (b)");
		System.out.println("    Soda   (s)");
       		System.out.println("    Fries  (f)");
		System.out.print("What is your input? ");

		//take input
		String firstOrder = input.next();
		//check length
		if (firstOrder.length()>1) {
			System.out.println("Single character expected");
			return; //exit on error
		}
		//switch to interpret initial input
		switch (firstOrder) {
			case "b": case "B": {
				//cust orders burger
				String burgerTopping;
				//ask what they want on it
				System.out.println("Enter a letter to indicate a choice of");
				System.out.println("    All Fixings (a)");
				System.out.println("    Cheese      (c)");
			       	System.out.println("    Nothing     (n)");
				System.out.print("What is your input? ");
				String burgerOrder = input.next(); //take input

				//interpret burger order
				switch (burgerOrder) {
					case "a": case "A": burgerTopping = "all fixings"; break;
					case "c": case "C": burgerTopping = "cheese"; break;
					case "n": case "N": burgerTopping = "nothing"; break;
					default: System.out.println("Incorrect input!"); return;
				}
				//print burger order
				System.out.println("You ordered a burger with " + burgerTopping);
				return;
			}
			case "s": case "S": {
				//cust orderes soda
				System.out.println("Enter a letter to indicate a choice of");
				System.out.println("    Coke        (c)");
				System.out.println("    Sprite      (s)");
			       	System.out.println("    Mountain Dew(m)");
				System.out.print("What is your input? ");
				String sodaOrder = input.next(); //take input

				//interpret input
				switch (sodaOrder) {
					case "c": case "C": System.out.println("You ordered a coke"); break;
					case "s": case "S": System.out.println("You ordered a sprite"); break;
					case "m": case "M": System.out.println("You ordered a maintain dew"); break;
					default: System.out.println("Incorrect input!"); return; //error return
				}
				return;
			}
			case "f": case "F": {
				//cust orders fries
				System.out.println("Enter a letter to indicate a choice of");
				System.out.println("    Large  (l)");
				System.out.println("    Small  (s)");
				System.out.print("What is your input? ");
				String friesOrder = input.next(); //take input

				//interpret input
				switch (friesOrder) {
					case "l": case "L": System.out.println("You ordered a large fries"); break;
					case "s": case "S": System.out.println("You ordered a small fries"); break;
					default: System.out.println("Incorrect input!"); return; //error return
				}
				return;
			}
			//return error if input is not as specified
			default: System.out.println("You did not enter any of B, b, S, s, F, or f");
		}
	}
}
