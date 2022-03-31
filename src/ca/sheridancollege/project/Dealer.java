package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

	private GroupOfCards deck;
	private ArrayList<StandardPlayingCards> getCards;

	public Dealer() {
		deck = new GroupOfCards(52);
		getCards = new ArrayList<StandardPlayingCards>();
		getCards.addAll(deck.showCards());
	}

	public ArrayList<StandardPlayingCards> Distribute() {
		getCards.get(1);
		return getCards;
	}

	public void shuffle() {
		Collections.shuffle(getCards);
	
		
	}

}