package ca.sheridancollege.project;

public class CasinoWars extends Game {

	private int roundsPlayed;

        
        public CasinoWars(String s){
            super(s);
        }
       
        @Override
	public void play() {
		Dealer dealer = new Dealer();
		dealer.shuffle();
		for (int i = 0; i < 5; i++) {
			System.out.println(dealer.Distribute());
		}
	}
        
        
        @Override
	public void declareWinner() {
		// TODO - implement CasinoWars.declareWinner
		throw new UnsupportedOperationException();
               
	}

	public Boolean confirmPlayerBalance() {
		// TODO - implement CasinoWars.confirmPlayerBalance
		throw new UnsupportedOperationException();
	}

	public int getRoundsPlayed() {
		return this.roundsPlayed;
	}

	/**
	 * 
	 * @param roundsPlayed
	 */
	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

}