package ca.sheridancollege.project;

import java.util.ArrayList;

public class CasinoWarsPlayer extends Players {

	private int balance;
	private StandardPlayingCards card;
	private final int bettingAmount=25;
	private int numberOfWins;

	/**
	 * 
	 * @param name
	 */
	public CasinoWarsPlayer(String name, int balance){
		super(name);
		setBalance(balance);
	}

	public ArrayList<Dealer> showCard() {
		//returns the card given to by the dealer
		return null;
	}

	public void play() {
		// TODO - implement CasinoWarsPlayer.play
		throw new UnsupportedOperationException();
	}

	//maybe make this a boolean
	public int bet() {
		// TODO - implement CasinoWarsPlayer.bet
		throw new UnsupportedOperationException();
	}

	//maybe make this a boolean
	public void leaveGame() {
		System.exit(0);
	}







	public int getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public StandardPlayingCards getCard() {
		return this.card;
	}
        

	/**
	 * 
	 * @param card
	 */
	public void setCard(StandardPlayingCards card) {
		this.card = card;
	}

	public int getNumberOfWins() {
		return this.numberOfWins;
	}

	/**
	 * 
	 * @param numberOfWins
	 */
	public void setNumberOfWins(int numberOfWins) {
		this.numberOfWins = numberOfWins;
	}
        
        public boolean checkBalance(int balanace)
        {
            return balanace >= 250;
        }
        
        @Override
        public String toString()
        {
            return "name : "+super.getPlayerID()+"\nBalance : "+getBalance();
        }

}
