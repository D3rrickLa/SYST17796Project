package Development2;
public enum Suits {

    HEARTS("Heart"),
    SPADES("Spade"),
    DIAMONDS("Diamonds"),
    CLUBS("Club");

    public final String suitText;
    Suits(String suittext){
        this.suitText = suittext;
    }
    public String getSuit(){
        return suitText;
    }
}
