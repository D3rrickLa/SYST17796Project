package Development2;
public enum Rank {
    //card(key,value)
    ACE(1,"ACE"),
    TWO(2,"2"),
    THREE(3,"3"),
    FOUR(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN(7,"7"),
    EIGHT(8,"8"),
    NINE(9,"9"),
    TEN(10,"10"),
    JACK(11,"JACK"),
    QUEEN(12,"QUEEN"),
    KING(13,"KING");

    public final int rankKey;
    public final String rankValue;
    
    Rank(int rankKey, String rankValue){
        this.rankKey = rankKey;
        this.rankValue = rankValue;
    }

    public int getRankKey() {
        return rankKey;
    }

    public String getRankValue() {
        return rankValue;
    }
   
}
