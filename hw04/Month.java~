
// Adam Weld
// CSE2
// hw04
// Wed 17 Sep 2014 07:02:04 PM EDT 
// Month.java
// i month by calendar date (1-12)
// output # of days in that month
//

// import scanner util
import java.util.Scanner;

// create main class
public class Month {
	// create main method
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); //new scanner
		System.out.print("Enter an int giving the number of the month (1-12): "); //query user for month input
		int i = myScanner.nextInt(); //set var for month to input
		int days; //initalize var days
		if (i > 12 || i < 1) { //must be a valid month
			System.out.println("Input must be between 1 and 12");
			return;
		} else if (i == 1 || i == 3 || i == 4 || i == 7 || i == 8 || i == 10 || i == 12) { //months with 31 days
			days = 31;
		} else if (i == 4 || i == 6 || i == 9 || i == 11) { //months with 30 days
			days = 30;
		} else { //months that change # days during leap year
			System.out.print("Enter an int giving the year: ");
			int year = myScanner.nextInt();
			if (year%4 == 0) { //is leap year? (2000,2004,2008,etc)
				days = 29;
			} else days = 28; //otherwise... 28 days
		}
		// print section
		System.out.println("The month has " + days + " days");
	}
}
		
