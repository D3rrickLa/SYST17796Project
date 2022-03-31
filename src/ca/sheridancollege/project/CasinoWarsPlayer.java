package ca.sheridancollege.project;

import java.util.ArrayList;

public class CasinoWarsPlayer extends Players {

	private int balance;
	private StandardPlayingCards card;
	private int bettingAmount;
	private int numberOfWins;

	/**
	 * 
	 * @param name
	 */
	public CasinoWarsPlayer(String name, int bettingAmount, int balance){
		super(name);
		setBettingAmount(bettingAmount);
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






	public int getBettingAmount() {
		return this.bettingAmount;
	}

	/**
	 * 
	 * @param bettingAmount
	 */
	public void setBettingAmount(int bettingAmount) {
		this.bettingAmount = bettingAmount;
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

}