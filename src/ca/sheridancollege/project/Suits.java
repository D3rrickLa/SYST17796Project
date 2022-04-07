package ca.sheridancollege.project;

public enum Suits {
	//key and value
	HEARTS(4,"Heart"),
	SPADES(3,"Spade"),
	DIAMONDS(2,"Diamonds"),
	CLUBS(1,"Club");

	public final String suitText;
	public final int suitOrder;

	/**
	 * NOTE - order matters for enums constructor 
	 * @param suittext
	 */
    Suits(int suitOrder, String suittext){
        this.suitText = suittext;
		this.suitOrder = suitOrder;
    }
    public String getSuit(){
        return suitText;
    }

	public int getSuitRank(){
		return suitOrder;
	}
//maybe key and value
}