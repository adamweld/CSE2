// Adam Weld
// CSE2
// HW04
// Wed 17 Sep 2014 07:23:55 PM EDT
//
// Program to give course info from 6 digit number
//

//import Scanner util
import java.util.Scanner;

//create class
public class CourseNumber {
	// create main method
	public static void main(String[] args) {
		
		// take input
		Scanner myScanner = new Scanner(System.in); //create scanner object
		System.out.print("Enter a six digit number giving the course semester: ");
		int input = myScanner.nextInt(); //accept user input
		
		int year = (int) (input/100); //find year by chopping off last two digits
		int semester = input - year * 100; //subtract year from input to get semester identifiers

		// check input
		if (input < 186510 || input  > 201440) { //must be btw spring 1865 and fall 2014
			System.out.println("Not a valid input! Outside year range");
			return;
		}
		
		String semesterName;
		if (semester == 10) { //spring semester?
			semesterName = "Spring";
		} else if (semester == 20) { //summer 1?
			semesterName = "Summer 1";
		} else if (semester == 30) { //summer 2?
			semesterName = "Summer 2";
		} else if (semester == 40) { //fall semester?
			semesterName = "Fall";
		} else {
			System.out.println("Not a valid semester!"); //otherwise its not a valid semester input
			return;
		}
		
		// print output
		System.out.println("The course was offered in the " + 
			semesterName + " semester of " + year);
	}
}
