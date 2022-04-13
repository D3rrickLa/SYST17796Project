package ca.sheridancollege.project;

import java.util.*;

public class GroupOfCards {

	private int size;
	private ArrayList<StandardPlayingCards> cards;

	/**
	 * the size of the grouping <- group - size of each color?
	 * @param givenSize
	 */
	public GroupOfCards(int givenSize) {
		this.cards = new ArrayList<>();
		setSize(givenSize);
		
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}



	/**
	 * A method that will get the group of cards as an ArrayList
	 * @return the group of cards.
	 */
	public ArrayList<StandardPlayingCards> showCards() {
		StandardPlayingCards[] deck = new StandardPlayingCards[getSize()];
		int counter = 0;
		for(Suits s : Suits.values()){
			for(Rank v : Rank.values()){
				deck[counter] = new StandardPlayingCards(s, v);
				counter++;
			}
		}
		Collections.addAll(cards, deck);
		return cards;
	}

}


//we can propbably run that singleton here