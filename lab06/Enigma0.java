/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg[]){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n = 4;
    if(scan.hasNextInt()){
      n=scan.nextInt();
    }
    
    System.out.println("You entered "+n);

    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 space between srg and [] in method definition
 --> remove space
 n was not initialized in method's inital scope
 --> define n as 4 before if statement rather than in else statement
 n is defined twice
 --> remove n from secont int definition
 */
