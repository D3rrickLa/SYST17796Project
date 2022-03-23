package Development2;

public class testing {
    public static void main(String[] args) {
    //so like we should do this in the casino players class, then this will go into the Game Class player arraylist
      // CardsAssignment p1 = new CardsAssignment();

      // p1.assignRankstoDeck();

      // System.out.println(p1.toString());


      GroupOfCards2 cards = new GroupOfCards2(13);

      cards.getDeck();
      cards.shuffle();
      System.out.println("\n-------------\n" + cards.showCards());

    
    }
}
