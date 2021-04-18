package Unit9Class;
/**
 * This program tests the CardDeck and Card class 
 * @author Lu Chen
 *
 */
public class Main {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck(); //create a deck of cards
		System.out.println("Before shuffling the deck");
		deck.display();
		
		deck.shuffle(); //shuffle the deck with the method
		
		System.out.println("\n==================");
		System.out.println("After shuffling the deck");
		deck.display();
	}

}
