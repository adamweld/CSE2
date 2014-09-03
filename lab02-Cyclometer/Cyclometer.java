// Adam Weld
// Cyclometer program
// 09/03/14
// CSE2
//
// Program to calculate cycling trip distance and time with cyclometer input
//
public class Cyclometer { //define class
	public static void main(String[] args) { //define main method
		// program input variables
		int secsTrip1=480; //var for seconds elapsed in trip1
		int secsTrip2=3220; //var for seconds elapsed in trip2
		int countsTrip1=1561; //var for rotations in trip1
		int countsTrip2=9037; //var for rotations in trip2
		// program constant variables
		double wheelDiameter=27.0, //wheel diameter
		PI=3.141592657989, //pi value
		feetPerMile=5280, //number of feet per mile
		inchesPerFoot=12, //number of inches per foot
		secondsPerMinute=60; //number of seconds per minute
		double distanceTrip1, distanceTrip2,totalDistance; //
		//print section
		System.out.println("Trip 1 took "+
			(secsTrip1/secondsPerMinute)+" minutes and had "+
			countsTrip1+" counts.");
		System.out.println("Trip 2 took "+
			(secsTrip2/secondsPerMinute)+" minutes and had "+
			countsTrip2+" counts.");
		//calculations for distance
		distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance is #counts times wheel diameter times pi
		distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance is then converted from inches to feet to miles
		//print output data
		System.out.println("Trip 1 was "+distanceTrip1+" miles");
		System.out.println("Trip 2 was "+distanceTrip2+" miles");
		System.out.println("Total distance was "+(distanceTrip1+distanceTrip2)+" miles");
	}
}
