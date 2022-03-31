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
		// d1.shuffle();
		// System.out.println("\n\n\n\n");
		// for (int i = 0; i < 5; i++) {
		// 	System.out.println(d1.Distribute());
			
		// }

		CasinoWars game1 = new CasinoWars("Game");
		game1.play();
	}

}