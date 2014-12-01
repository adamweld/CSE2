// Adam Weld
// CSE2
// HW11
// Poker hand rank program

import java.util.*;
public class PokerHands {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // create scanner
        String cont = ""; // continue input string
        do {
            int[] hand = new int[5]; // [] to hold cards of hand
            for(int i = 0; i < 5; i++) { // once for each hand index
                int rank = -2;
                do {
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");
                    rank = rankInt(input.next());
                    if(rank == -1) { // default
                        System.out.println("You did not enter a valid response");
                    }
                } while (rank < 0); // keep going until you get a correct response
                
                int suit = -2;
                do {
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");
                    suit = suitInt(input.next());
                    if(suit == -1) {
                        System.out.println("You did not enter a valid response");
                    }
                } while (suit < 0); // keep going until you get a correct response
                hand[i] = suit * 13 + rank; // add it all together
            }
            showOneHand(hand); // show hand
            showRank(hand); // show hand rank
            
            System.out.print("Enter y to input another hand: "); // prompt to go again?
            cont = input.next(); // take response
        } while(cont.equals("y") || cont.equals("Y")); // keep going when user inputs y/Y
    }
    public static int rankInt(String x) {
        switch (x) {
            case "a":
                return 0;
            case "k":
                return 1;
            case "q":
                return 2;
            case "j":
                return 3;
            case "10":
                return 4;
            case "9":
                return 5;
            case "8":
                return 6;
            case "7":
                return 7;
            case "6":
                return 8;
            case "5":
                return 9;
            case "4":
                return 10;
            case "3":
                return 11;
            case "2":
                return 12;
            default:
                return -1; // incorrect input
        }
    }
    public static int suitInt(String y) {
        switch (y) {
            case "c":
                return 0;
            case "d":
                return 1;
            case "h":
                return 2;
            case "s":
                return 3;
            default:
                return -1; // incorrect input
        }
    }
    
    public static void showRank(int[] hand){
        String[] rankNames = {"High Card", "One Pair", "Two Pair", "Straight",
            "Flush", "Full House", "Four of a kind", "Straight Flush", "Royal Flush"};
        int name = 0; // start with High Card
        int[] rankFreq = new int[13]; // frequency of each rank
        int[] freqCount = new int[5]; // freq of # in rankFreq
        for(int i = 0; i < 13; i++) { // fill rankFreq
            for(int j = 0; j < 5; j++) {
                if(hand[j] % 13 == i) rankFreq[i]++;// check if hand rank equals rank pos
            }
        }
        for(int p = 0; p < 5; p++) {
            for(int k = 0; k < 13; k++) {
                if(rankFreq[k] == p) freqCount[p]++;
            }
        }
        
        if(freqCount[2] == 1 && freqCount[3] ==1) name = 5;
        if(freqCount[4] == 1) name = 6;
        
        
        System.out.println("\nThis is a " + rankNames[name]);
        
    }
    
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';
    	}
    	System.out.println(out);
    }
}
