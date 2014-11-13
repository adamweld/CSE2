// Adam Weld
// CSE2
// hw11
// 13 Nov 2014 (Thu)
// find duplicates in poker hands

import java.util.*;

public class FindDuplicates {

  public static int numDups(int[] x) {
    int num = 0;
    for(int i = 0; i < x.length; i++) { // runs once per value in the array
      int val = x[i]; // get the value of array at current index
      // two for loops check for duplicates
      // one below current value, one above
      for(int j = 0; j < i; j++) { // check array values 0 through current val index
        if(val == x[j]) num++;
      }
      for(int k = i; k < x.length; k++) { // check current index through end of array
        if(val == x[k]) num++;
      }
    }
    num = (num - 10) / 2;
    // the 10 accounts for each time the for loop finds itself
    // divide by two because each duplicate will be found twice
    // System.out.println("num dups: " + num);
    return num;
  }

  public static boolean hasDups(int[] x) {
    return numDups(x) > 0;
  }

  public static boolean exactlyOneDup(int[] x) {
    return numDups(x) == 1;
  }



  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }


}
