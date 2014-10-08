// Adam Weld
// 10/08/14
// lab07

import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String args[]) {
        System.out.println("Enter an integer between 1 and 15: ");
        Scanner myScanner = new Scanner(System.in);
        if (myScanner.hasNextInt()) {
            int nStars = myScanner.nextInt();
            if (nStars >= 1 && nStars <= 15){
                int count = 0;
                String result = "";
                while (count < nStars) {
                    result += "*";
                    System.out.println(result);
                    count++;
                }
            } else {
                System.out.println("int was not in range [1,15]");
                return;
            }
        } else {
            System.out.println("Incorrect Input (not int)");
            return;
        }
    }
}