package ca.sheridancollege.project;

public enum Suits {
	HEARTS("Heart"),
	SPADES("Spade"),
	DIAMONDS("Diamonds"),
	CLUBS("Club");

	public final String suitText;

	/**
	 * 
	 * @param suittext
	 */
    Suits(String suittext){
        this.suitText = suittext;
    }
    public String getSuit(){
        return suitText;
    }

}