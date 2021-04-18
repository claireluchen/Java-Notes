package Unit9Class;

import java.util.Random;

/**
 * This class provides a unshuffled deck of cards
 * It provides a method where it shuffles the cards
 * @author Lu Chen
 *
 */
public class CardDeck {
	//data field
	private static final Random generator = new Random(); //random number generator used to shuffle the deck
	private Card[] deck = new Card[52];

	//default constructor
	public CardDeck() {
		String[] face = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Club", "Diamond", "Heart", "Spade"};
		
		//fill the deck with cards
		for (int i = 0; i < deck.length; i++) {
			//create new Card object and assign it to the deck array
			deck[i] = new Card(face[i % 13], suit[i / 13]); 
		}
	}
	
	/**
	 * This method shuffles the deck. Random generator is used
	 * precondition: a deck of card is created
	 * postcondition: the deck will be shuffled
	 */
	public void shuffle() {
		for (int i = 0; i < deck.length; i++) { //perform this swap technique to all the cards
			int anotherCard = generator.nextInt(52); //generates a number between 0 and 51
			//swap the two cards
			Card temp = deck[i];
			deck[i] = deck[anotherCard];
			deck[anotherCard] = temp;
		}
	}
	
	/**
	 * This method displays the cards in the deck, five cards each row
	 * precondition: a deck of card is created
	 * postcondition: each card in the deck will be displayed
	 */
	public void display() {
		for (int i = 1; i <= 52; i++) {
			if (i % 5 == 0) {
				System.out.printf("%-15s%n", deck[i-1].toString()); //add new line
			}else {
				System.out.printf("%-15s", deck[i-1].toString());
			}
			
		}
	}
	
}
