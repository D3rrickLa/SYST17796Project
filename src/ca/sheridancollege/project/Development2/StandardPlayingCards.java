package Development2;


public class StandardPlayingCards extends Card2{

    private Suits suits;
    private Rank ranks;

    public StandardPlayingCards(Suits suits, Rank ranks){
        this.setSuits(suits);
        this.setRanks(ranks); 
    }


    public Suits getSuits() {
        return suits;
    }


    public void setSuits(Suits suits) {
        this.suits = suits;
    }

    public Rank getRanks(){
        return ranks;
    }

    public void setRanks(Rank ranks){
        this.ranks = ranks;
    }

    @Override
    public String toString() {
    
        return getRanks() + " of " + getSuits();
    }


}

