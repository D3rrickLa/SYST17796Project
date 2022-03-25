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
	public CasinoWarsPlayer(Players name) {
		// TODO - implement CasinoWarsPlayer.CasinoWarsPlayer
		throw new UnsupportedOperationException();
	}

	public ArrayList<Dealer> showCard() {
		// TODO - implement CasinoWarsPlayer.showCard
		throw new UnsupportedOperationException();
	}

	public void play() {
		// TODO - implement CasinoWarsPlayer.play
		throw new UnsupportedOperationException();
	}

	public int bet() {
		// TODO - implement CasinoWarsPlayer.bet
		throw new UnsupportedOperationException();
	}

	public void leaveGame() {
		// TODO - implement CasinoWarsPlayer.leaveGame
		throw new UnsupportedOperationException();
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