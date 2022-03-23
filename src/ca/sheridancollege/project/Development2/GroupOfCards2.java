package Development2;

import java.util.ArrayList;
import java.util.Collections;


public class GroupOfCards2 {

    private StandardPlayingCards[] deck;
    private ArrayList <StandardPlayingCards> cards;
    private int size;//the size of the grouping <- group - size of each color?
    
    public GroupOfCards2(int givenSize)
    {
        this.cards = new ArrayList<StandardPlayingCards>();
        this.deck = new StandardPlayingCards[Suits.values().length * Rank.values().length];
        size = givenSize;

  }

    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<StandardPlayingCards> showCards()
    {
        getDeck();
        Collections.addAll(cards, deck);
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }


    public void getDeck(){
        int counter = 0;
        for( Suits s: Suits.values()){ 
            for(Rank v: Rank.values()){
                deck[counter] = new StandardPlayingCards(s,v); 
                counter++;  
            }
        }
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}





