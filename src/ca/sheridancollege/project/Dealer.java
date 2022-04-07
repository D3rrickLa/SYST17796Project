package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

	private GroupOfCards deck;
	private ArrayList<StandardPlayingCards> getCards;

	public Dealer() {
		deck = new GroupOfCards(52);
		getCards = new ArrayList<>();
		getCards.addAll(deck.showCards()); // this is an arraylist contain all the standard cards
 
	}

	public StandardPlayingCards Distribute() {
		//we now want to take the arraylist from getCards and return only one card from that list, while also removing it
		double randomNumber = Math.random() * (getCards.size());
		StandardPlayingCards b = getCards.get((int)randomNumber);
		String s = String.format("%s", b);
		String[] arr = s.split(" ");
		StandardPlayingCards c = new StandardPlayingCards(Suits.valueOf(arr[2]), Rank.valueOf(arr[0]));
		getCards.remove((int)randomNumber);
		return c; //return new StandardPlayingCards
	}

	public void shuffle() {
		Collections.shuffle(getCards);	
	}

}
