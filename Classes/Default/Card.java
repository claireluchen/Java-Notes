package Unit9Class;
/**
 * This Card class contains the attributes of the card (face, suit)
 * The toString method returns the card in suit-face format, ex: Jack-9
 * @author Lu Chen
 *
 */
public class Card {
	//data field. All declared final so that it cannot be modified once created
	private final String face;
	private final String suit;
	
	//constructor with two arguments
	//default constructor not provided since the fields have to be initialized
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	/**
	 * This method returns the String representation of a card
	 * @return String representation of the card
	 * precondition: a Card object is initialized and created
	 * postcondition: the String value of the card is returned
	 */
	public String toString() {
		return suit + " - " + face;
	}
	
}
