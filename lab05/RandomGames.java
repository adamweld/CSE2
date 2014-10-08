// Adam Weld
// Wed 24 Sep 2014 12:10:40 PM EDT
//
import java.util.Scanner;

public class RandomGames {
	public static String roulette() {
		int result;
		int rand = (int) (Math.random()*37);
		if (rand <= 36) return "Roulette: " + rand;
		return "Roulette: 00";
	}

	public static String  craps() {
		int roll1 = (int) (Math.random()*6) +1;
		int roll2 = (int) (Math.random()*6) +1;
		return "Craps: " + roll1 + " + " + roll2 + " = " + (roll1 + roll2);
	}

	public static String cards() {
		int suite = (int) (Math.random() * 4);
		int card = (int) (Math.random() * 13) +1;
		String suiteName = "";
		switch (suite) {
			case 0: suiteName = "Spades"; break;
			case 1: suiteName = "Clubs"; break;
			case 2: suiteName = "Hearts"; break;
			case 3: suiteName = "Diamonds"; break;
		}
		String cardName = "";
		switch (card) {
			case 1: cardName = "Ace"; break;
			case 2: cardName = "Two"; break;
			case 3: cardName = "Three"; break;
			case 4: cardName = "Four"; break;
			case 5: cardName = "Five"; break;
			case 6: cardName = "Six"; break;
			case 7: cardName = "Seven"; break;
			case 8: cardName = "Eight"; break;
			case 9: cardName = "Nine"; break;
			case 10: cardName = "Ten"; break;
			case 11: cardName = "Jack"; break;
			case 12: cardName = "Queen"; break;
			case 13: cardName = "King"; break;
		}
		return cardName + " of " + suiteName;

	}
	
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter your choice for game: ");
		String playerInput = myScanner.next();
		if (playerInput.length() > 1) {
			System.out.println("Single character input expected!");
			return;
		}
		char playerInputChar = playerInput.charAt(0);

		switch (playerInputChar){
			case 'R': System.out.println(roulette()); break;
			case 'r': System.out.println(roulette()); break;
			case 'C': System.out.println(craps()); break;
			case 'c': System.out.println(craps()); break;
			case 'P': System.out.println(cards()); break;
			case 'p': System.out.println(cards()); break;
			default: System.out.println("Incorrect input!");
		}
	}
}
