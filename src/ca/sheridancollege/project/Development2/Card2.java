package Development2;

public abstract class Card2{
   
    
    

    //so like we we super this by first calling the casinoplayer class than, it would run the dealer class
    //which will then run the group of cards / generate class and hands gives out the player a card suit and value
    //we can then call another class, which will call this class, super the values and we can toString this thing...


    
    @Override
    public abstract String toString(); 
    //this class is used use to return a card - UNO or whatever, so 
    /**
     * Im pretty sure we can have that generate class, but link it to the GroupOfCards.. maybe
     * then propbably have it so THIS prints out the card alongside with the other users stuff
     * or better yet, we call toString from a different class which will give us an output we can combine into
     * one big toString
     */
}