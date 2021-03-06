// Adam Weld
// CSE2
// Wed 10 Sep 2014 12:20:09 PM EDT
// program to calculate cyclometer distance travelled and average speed
// wheel diameter is assumed at 27 inches
// inputs: # of seconds recorded, # of counts on cyclometer
// returns: distance travelled, miles per hour

// imports
import java.util.Scanner;

public class Bicycle { //define class

	public static double truncate(double x){ //truncate method to reduce decimals of doubles
		x *= 100; //multiply double by 100
		int n = (int)x; //convert to int
		double d = (double)n / 100; //cast back to double then /100
		return d; //return truncated value
	}

	public static void main(String[] args) { //define main method
		// program input 
		Scanner myScanner = new Scanner(System.in); //create new scanner myScanner to take user input
		System.out.print("Number of seconds in trip: "); //input dialog
		int secsTrip = myScanner.nextInt(); //query user for secsTrip
		System.out.print("Number of counts in trip: ");
		int countsTrip = myScanner.nextInt(); //query user for countsTrip

		// program variables
		double wheelDiameter=27.0; //wheel diameter
		double PI=3.141592657989; //pi value
		double feetPerMile=5280; //number of feet per mile
		double inchesPerFoot=12; //number of inches per foot
		double secondsPerMinute=60; //number of seconds per minute
		double minutesTrip;
		double distanceTrip;
		double milesPerHour;

		// calculations for distance
		minutesTrip = secsTrip / 60d; //the 'd' after 60 assures no loss in precision (stands for double)
		distanceTrip = countsTrip * wheelDiameter * PI / inchesPerFoot / feetPerMile;
		milesPerHour = distanceTrip / (minutesTrip / 60); //60 minutes per hour
		
		// print output data
		System.out.println("Trip Data:");
		System.out.println("The distance was " + truncate(distanceTrip) + " miles and took " //truncate() returns truncated decimal approximations
			+ truncate(minutesTrip) + " minutes.");
		System.out.println("The average MP/H was " + truncate(milesPerHour) + ".");
	}
}
