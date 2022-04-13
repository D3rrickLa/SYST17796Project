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
		setSuits(suits);
		setRanks(ranks);
	}

	@Override
	public String toString() {
		return getRanks() + " of " + getSuits();
	}

}