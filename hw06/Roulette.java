// Adam Weld
// CSE2
// HW06
// 10/10/14
// Program to simulate Roullete betting system

public class Roulette { //create class
  public static void main(String args[]) { //create 
    int countLostAll = 0; //initialize count vars
    int countLostSome = 0;
    int countWonSome = 0;
    int totalWinnings = 0; //var to carry sum of winnings
    for (int i=0;i<1000;i++) { //play 1000 games
      int gameSum = 0; //initalize game sum every game
      int bet = (int)(Math.random()*38); //random bet
      for (int j=0;j<100;j++) { //100 rounds per game
        int spin = (int)(Math.random()*38); //random spin
        if (bet == spin) { //if spin hits your number
          gameSum += 36; //add winnings to game sum
        }
      }
      if (gameSum > 100) {
        countWonSome++; //increment count rounds with positive winnings
      }
      else if (gameSum == 0) {
        countLostAll++; //didnt win anything
      }
      else {
        countLostSome++; //won less than put in
      }
      totalWinnings += gameSum; //add game sum to total sum
    }
    // print section
    System.out.println("Games with wins less than $100: " + countLostSome);
    System.out.println("Games with zero winnings: " + countLostAll);
    System.out.println("Games with positive winnings: " + countWonSome);
    System.out.println("Total winnings (out of $100,000): " + totalWinnings);
  }
}
