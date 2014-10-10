// Adam Weld
// CSE2
// HW06
// 10/10/14
//

public class Roulette {
  public static void main(String args[]) {
    int countLostAll = 0; //initialize count vars
    int countLostSome = 0;
    int countWonSome = 0;
    int totalWinnings = 0;
    for (int i=0;i<100000;i++) { //play 100000 games
      int gameSum = 0; //initalize game sum every game
      for (int j=0;j<100;j++) { //100 rounds per game
        int bet = (int)(Math.random()*38); //random bet and random spin
        int spin = (int)(Math.random()*38);
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
      totalWinnings += gameSum;
    }
    System.out.println("Games with wins less than $100: " + countLostSome);
    System.out.println("Games with zero winnings: " + countLostAll);
    System.out.println("Games with positive winnings: " + countWonSome);
    System.out.println("Total winnings (out of $100,000): " + totalWinnings);
  }
}
