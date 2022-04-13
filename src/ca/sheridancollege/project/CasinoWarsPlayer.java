package ca.sheridancollege.project;

public class CasinoWarsPlayer extends Players {

	private int balance;
	private final int bettingAmount = 25;
	private int numberOfWins;
	private StandardPlayingCards card;

	public CasinoWarsPlayer(String name, int balance, StandardPlayingCards cards){
		super(name);
		setBalance(balance);
		setCard(cards);
		setNumberOfWins(0);
	}

	@Override
	public void play() {
		setBalance(getBalance()-bet());
	}

	//maybe make this a boolean
	public int bet() {
		return bettingAmount;
	}

	public int getBalance() {
		return this.balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	public StandardPlayingCards getCard() {
		return this.card;
	}


  	public void setCard(StandardPlayingCards card) {
		this.card = card;
	}

	public int getNumberOfWins() {
		return this.numberOfWins;
	}

	public void setNumberOfWins(int numberOfWins) {
		this.numberOfWins = numberOfWins;
	}

	//this is used to print out the actual player's name and balance, instead of
	//the memory address
	@Override
	public String toString(){
		return "name: "+super.getPlayerID()+", Balance: "+getBalance() + ", Card:" + getCard();
	}
}