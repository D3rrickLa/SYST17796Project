package ca.sheridancollege.project;

public class CasinoWars extends Game {

	private int roundsPlayed;

        
        public CasinoWars(String s){
            super(s);
        }
       
        @Override
	public void play() {
		// TODO - implement CasinoWars.play
		throw new UnsupportedOperationException();
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