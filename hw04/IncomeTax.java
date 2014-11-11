// Adam Weld
// CSE2
// hw04
// Wed 17 Sep 2014 06:34:20 PM EDT
// IncomeTax.Java
// Program to calculate income tax
// input is income in thousands of dollars
//

// import scanner util
import java.util.Scanner;

// create main class
public class IncomeTax {
  // create main method
  public static void main(String[] args) {
    // initialize variables
    int tax;
    int income;
    // input section
    Scanner myScanner = new Scanner( System.in ); //create scanner
    System.out.print("Enter an int giving the number of thousands: "); //query user
    if(myScanner.hasNextInt()){ //only accept int input
      income = myScanner.nextInt();
    } else {
      System.out.println("Please enter an integer!"); //error message
      return;
    }
    if(income <= 0) {
      System.out.println("Integer must be larger than 0!"); //error message for negative integer
      return;
    } else if (income <20) { //first tax bracket (<20)
      tax = 5;
    } else if (income >= 20 && income <40) { //second tax bracket (>=20,<40)
      tax = 7;
    } else if (income >= 40 && income < 78) { //(>=40,<78)
      tax = 12;
    } else {
      tax = 14; //highest bracket; more than 78 thousands
    }

    // calculations
    int incomeWhole = income * 1000; //convert thousands to ones
    double taxRate = tax / 100d; //make tax rate a decimal
    int taxCost = (int) (taxRate * incomeWhole); //calc total tax

    // print sections
    System.out.println("The tax rate on $" + incomeWhole +
        " is " + tax + "%, and the tax is $" + taxCost);
  }
}
