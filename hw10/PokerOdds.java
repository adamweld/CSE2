// Adam Weld
// CSE2
// hw11
// 13 Nov 2014 (Thu)
// simulate the odds of a game of poker

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{

  public static void showHands() {
    // cards can be [0,51]
    // Clubs [0,12], Diamonds [13,25]
    // then Hearts, Spades
    Random rand = new Random(); // create random object
    int[] deck = new int[52];
    for(int y = 0; y < 52; y++) { // initialize deck with [0,51]
      deck[y] = y;
    }
    int deckMax = 52;
    int[] hand = {-1, -1, -1, -1, -1};

    for(int i = 0; i < 5; i++) {
      int n = rand.nextInt(deckMax);
      hand[i] = deck[n];
      deck[n] = deck[deckMax-1];
      deck[deckMax-1] = -1;
      deckMax--;
      System.out.println(FindDuplicates.listArray(hand));
    }


    String labels[] = {"Clubs: ","Diamonds: ","Hearts: ","Spades: "};
    //for(int p = 0; p < 4; p++) {
    //  System.out.println(labels[p]+cards[p]);
    //}

  }

  public static void simulateOdds() {

  }

  public static void main(String [] arg){
    showHands();
    //simulateOdds();
  }
}

