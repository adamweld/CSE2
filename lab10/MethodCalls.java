// Adam Weld
// 29 Oct 2014 (Wed)
// lab10
// CSE2
//
public class MethodCalls{
  public static int addDigit(int number, int digit) {
    //do conversion with absolute values
    boolean numberPos = (number > 0);
    number = Math.abs(number);
    // if digit is in [0,9] return digit then number (added together)
    if(digit <= 9 && digit >= 0) {
      int digitPower = ("" + number).length();
      //  System.out.println("digitPower = " + digitPower);
      int newDigit = digit * (int) Math.pow(10, digitPower);
      //  System.out.println("newDigit = " + newDigit);
      if(numberPos) {
        return number + newDigit;
      } else {
        return (number + newDigit) * -1;
      }
    }
    // else return number
    if(numberPos) {
      return number;
    } else {
      return -1 * number;
    }
  }

  public static int join(int a, int b) {
    if(a >= 9 || a <= -9) {
      int aPower = ("" + b).length();
      if (b < 0) {
        aPower--;
      }
    //  System.out.println("aPower = " + aPower);
      int newDigit = a * (int) Math.pow(10, aPower);
    //  System.out.println("newDigit = " + newDigit);
      int result = b + newDigit;
      if (a < 0 && b < 0) {
        result *= -1;
      }
      return result;
    }
    return addDigit(b,a);
  }

  public static void main(String []  arg){
    int a=784,b=22,c;
    c=addDigit(a,3);
    System.out.println("Add 3 to "+a+" to get "+c);
    c=addDigit(addDigit(c,4),5);
    System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
    System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
    c=join(a,b);
    System.out.println("Join "+a+" to "+b+" to get "+c);
    System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
    System.out.println("Join -9 and -90 to get "+join(-9,-90));
  }
}

/*
 * Add 3 to 784 to get 3784
 * Add 3, 4, and 5 to 784 to get 543784
 * Add 3 to -98 to get: -398
 * Join 784 to 22 to get 78422
 * Join 87, 42, and 83 to get 874283
 * Join -9 and -90 to get 990
*/
