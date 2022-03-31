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
		double randomNumber = Math.random() * 52;
		ArrayList<StandardPlayingCards> re= new ArrayList<>();
		re.add(getCards.get((int) randomNumber)); 
		getCards.remove((int) randomNumber);
		return re;
	}

	public void shuffle() {
		Collections.shuffle(getCards);	
	}

}