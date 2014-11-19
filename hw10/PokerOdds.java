// Adam Weld
// CSE2
// hw11
// 13 Nov 2014 (Thu)
// simulate the odds of a game of poker

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{

  public static String cardFormat(int x) { // formats returns String card rank
    switch (x) {
      case (0) :
        return"A";
      case (1) :
        return"K";
      case (2) :
        return"Q";
      case (3) :
        return"J";
      case (4) :
        return"10";
      case (5) :
        return"9";
      case (6) :
        return"8";
      case (7) :
        return"7";
      case (8) :
        return"6";
      case (9) :
        return"5";
      case (10) :
        return"4";
      case (11) :
        return"3";
      case (12) :
        return"2";
      default:
        return"err";
    }
  }

  public static void showHands() {
    // cards can be [0,51]
    // Clubs [0,12], Diamonds [13,25]
    // then Hearts, Spades
    Scanner scan=new Scanner(System.in); // create scanner object
    Random rand = new Random(); // create random object
    String answer=""; // will be called later if to check if user wants to repeat
    do {
      int[] deck = new int[52];
      for(int y = 0; y < 52; y++) { // initialize deck with [0,51]
        deck[y] = y;
      }
      int deckMax = 52; // the largest 'real' value in deck array
      // note that index will be (deckMax - 1)
      int[] hand = {-1, -1, -1, -1, -1};

      for(int i = 0; i < 5; i++) {
        int n = rand.nextInt(deckMax); // get random value less than deckMax
        hand[i] = deck[n]; // take card into hand
        deck[n] = deck[deckMax-1]; // replace card that was taken with last card in deck
        deck[deckMax-1] = -1; // take a card out of the deck
        deckMax--; // deck now has one less card
        //System.out.println(FindDuplicates.listArray(hand));
      }


      // array of the values of each card, sorted by suit
      // e.g. A Q 3
      String[] cards = {"", "", "", "",}; // clubs, diamonds, hearts, spades
      for(int j = 0; j < 4; j++) {
        for(int f = 0; f < 5; f++) { // check each value of the hand
          if(j == hand[f] / 13) { // if in suit (0,1,2,3,4)
            cards[j] += cardFormat(hand[f] % 13) + " "; // get the card number/letter from rank
            //System.out.println("rank: " + hand[f] + " suit: " + j + " value: "
            //    + hand[f] % 13 + " name: " + cardFormat(hand[f] % 13));
          }
        }
      }



      String labels[] = {"Clubs: ","Diamonds: ","Hearts: ","Spades: "}; // hand labels
      for(int p = 0; p < 4; p++) {
        System.out.println(labels[p]+cards[p]);
      }

      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();

    } while(answer.equals("Y") || answer.equals("y"));
  }

  public static void simulateOdds() {
    Random rand = new Random(); // create random object
    int[] numExactlyOnePair = new int[13];
    int numNotOnePair = 0;
    String[] labels = {"A", "K", "Q", "J", "10", "9"
      , "8", "7", "6", "5", "4", "3", "2"};
    for(int p = 0; p < 10000; p++) { // run 10,000 trials
      int[] deck = new int[52];
      for(int y = 0; y < 52; y++) { // initialize deck with [0,51]
        deck[y] = y;
      }
      int deckMax = 52; // the largest 'real' value in deck array
      // note that index will be (deckMax - 1)
      int[] hand = {-1, -1, -1, -1, -1};

      for(int i = 0; i < 5; i++) {
        int n = rand.nextInt(deckMax); // get random value less than deckMax
        hand[i] = deck[n]; // take card into hand
        deck[n] = deck[deckMax-1]; // replace card that was taken with last card in deck
        deck[deckMax-1] = -1; // take a card out of the deck
        deckMax--; // deck now has one less card
      }
      int[] handRank = {hand[0] % 13, hand[1] % 13, hand[2] % 13, hand[3] % 13,hand[3] % 13,hand[4] % 13}; // hand array with numerical rank

      if(FindDuplicates.numDups(handRank) != 1) { // no pairs / more than one pair
        numNotOnePair++;
      }

      String[] cards = {"", "", "", "",}; // clubs, diamonds, hearts, spades
      for(int j = 0; j < 4; j++) {
        for(int f = 0; f < 5; f++) { // check each value of the hand
          if(j == hand[f] / 13) { // if in suit (0,1,2,3,4)
            cards[j] += cardFormat(hand[f] % 13); // get the card number/letter from rank
          }
        }
      }

      for(int l = 0; l < 4; l++) { // runs once per value in the array
        for(int j = 0; j < 13; j++) { // check array values
          if(cards[l].equals(labels[j])) {
            numExactlyOnePair[j]++;
          }
        }
      }

    }

    System.out.println(" rank  freq of exactly one pair");
    for(int i = 0; i < 13; i++) {
      System.out.printf("%s    %4d \n",labels[i],numExactlyOnePair[i] / 4);
    }
    System.out.println("------------------------------------------");
    System.out.println("total not exactly one pair: " + numNotOnePair);

  }

  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
}

