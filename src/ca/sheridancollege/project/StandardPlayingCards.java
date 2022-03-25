package ca.sheridancollege.project;

public class StandardPlayingCards extends Card {

	private Suits suits;
	private Rank ranks;

	public Suits getSuits() {
		return this.suits;
	}

	public void setSuits(Suits suits) {
		this.suits = suits;
	}

	public Rank getRanks() {
		return this.ranks;
	}

	public void setRanks(Rank ranks) {
		this.ranks = ranks;
	}

	/**
	 * 
	 * @param suits
	 * @param ranks
	 */
	public StandardPlayingCards(Suits suits, Rank ranks) {
		// TODO - implement StandardPlayingCards.StandardPlayingCards
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		// TODO - implement StandardPlayingCards.toString
		throw new UnsupportedOperationException();
	}

}