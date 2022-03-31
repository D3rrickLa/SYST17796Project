package ca.sheridancollege.project;

public class playGame {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// GroupOfCards cards = new GroupOfCards(52);
		// System.out.println(cards.showCards());


		// Dealer d1 = new Dealer();
		// System.out.println(d1.Distribute());
		// d1.shuffle();
		// System.out.println("\n\n\n\n");
		// System.out.println(d1.Distribute());

		CasinoWars game1 = new CasinoWars("Game");
		game1.play();
	}

}