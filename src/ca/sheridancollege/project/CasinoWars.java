package ca.sheridancollege.project;

public class CasinoWars extends Game {

	private int roundsPlayed;

        
        public CasinoWars(String s){
            super(s);
			roundsPlayed = 0;
        }
       
        @Override
	public void play() {
		while(roundsPlayed < 10){		
			Dealer dealer = new Dealer();
			dealer.shuffle();
			for (int i = 0; i < 5; i++) {
				System.out.println(dealer.Distribute());
				
			}
			roundsPlayed++;
		}


	}
        
        
        @Override
	public void declareWinner() {

               
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