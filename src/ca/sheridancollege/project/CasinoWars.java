package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class CasinoWars extends Game {

    private int roundsPlayed;
    private ArrayList<CasinoWarsPlayer> players;
    private final int numOfPlayers = 2;
    private final int numOfRounds = 2;
    public CasinoWars(String s){
            super(s);
            roundsPlayed = 0;
            players = new ArrayList<>();

    }
       
        @Override
	public void play() {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numOfPlayers; i++) {
                String playerName = "";
                int balance = 0;
                System.out.println("Please enter your name");
                playerName = input.next();
                while(true){
                    System.out.println("Please enter your balance");
                    //try catch block here maybe
                    balance = input.nextInt();
                    if(confirmPlayerBalance(balance)){
                        break;
                    }
                }	
                players.add(new CasinoWarsPlayer(playerName, balance, new StandardPlayingCards(Suits.CLUBS, Rank.ACE)));
            }
            input.close();
	
            while(roundsPlayed <= numOfRounds){
                Dealer dealer = new Dealer();
                dealer.shuffle();
                for (int i = 0; i < numOfPlayers; i++) {
                        players.get(i).setCard(dealer.Distribute());
                        players.get(i).play();

                        System.out.println(players.get(i).getBalance());
                }	
                roundsPlayed++;
                declareWinner();
            }
	}  
        
    @   Override
        public void declareWinner() {
        //get the number of wins for every player, then if there is a tie, do someting
        if(roundsPlayed <= numOfRounds){
            int max = players.get(0).getCard().getRanks().rankKey;
            int suit = players.get(0).getCard().getSuits().suitOrder;
            int index = 0;
            for(int i = 0; i <players.size(); i++ ){
                    if(players.get(i).getCard().getRanks().rankKey == max && !(players.get(i).getCard().getSuits().suitOrder == suit)){
                            int comparing = Integer.compare(players.get(i).getCard().getSuits().suitOrder, suit);
                            switch (comparing) {
                                case 1:
                                    suit = players.get(i).getCard().getSuits().suitOrder;
                                    index = i;
                                    break;
                                default:
                                    break;
                            }
                    }

                    if(players.get(i).getCard().getRanks().rankKey > max){
                            max = players.get(i).getCard().getRanks().rankKey;
                            index = i;
                    }
            }

            for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getCard());
            }
            players.get(index).setBalance(players.get(index).getBalance() + 100);
            players.get(index).setNumberOfWins(players.get(index).getNumberOfWins() + 1);
            System.out.println("\nPlayer: "+players.get(index).getPlayerID() +" won this round:" + players.get(index).getNumberOfWins() +"\n------");
        }
        else{
            int[] lstOfWins = new int[players.size()];
            int indexOfWinner = 0;
            for (int i = 0; i < lstOfWins.length; i++) {
                    lstOfWins[i] = players.get(i).getNumberOfWins();
            }

            int maxWins = 0;
            for (int i = 0; i < lstOfWins.length; i++) {
                    if(lstOfWins[i] > maxWins){
                            maxWins = lstOfWins[i];
                            indexOfWinner = i;
                    }
            }	
            System.out.println(maxWins);

            ArrayList<Integer> dupWins = new ArrayList<>();
            for (int i = 0; i < lstOfWins.length; i++) {
                    if(lstOfWins[i] == maxWins || !(i == players.indexOf(players.get(i)))){
                            dupWins.add(i);
                    }
            }
            System.out.println("\n"+maxWins + " " + players.get(indexOfWinner)); //works
            System.out.println(dupWins +"\n\n"); //this doesn't work, if should be empty
            for (CasinoWarsPlayer i : players) {
                    System.out.println(i.getNumberOfWins() + " " + i.getPlayerID());
            }



            if(dupWins.size() == 1){
                    System.out.println("AMOGNUS");
            }
            else{
                int max = 0;
                int suit = 0;
                int index = 0;
                Dealer dealer =new Dealer();
                for (int i = 0; i < dupWins.size(); i++) {
                    players.get(dupWins.get(i)).setCard(dealer.Distribute());
                    if(players.get(dupWins.get(i)).getCard().getRanks().rankKey == max && !(players.get(dupWins.get(i)).getCard().getSuits().suitOrder == suit)){
                            int comparing = Integer.compare(players.get(dupWins.get(i)).getCard().getSuits().suitOrder, suit);
                            switch (comparing) {
                                case 1:
                                    suit = players.get(dupWins.get(i)).getCard().getSuits().suitOrder;
                                    index = i;
                                    break;
                                default:
                                    break;
                            }
                    }

                    if(players.get(dupWins.get(i)).getCard().getRanks().rankKey > max){
                            max = players.get(i).getCard().getRanks().rankKey;
                            index = i;
                        }
                    }
                for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getCard());
            }
            players.get(index).setBalance(players.get(index).getBalance() + 100);
            players.get(index).setNumberOfWins(players.get(index).getNumberOfWins() + 1);
            System.out.println("\nPlayer: "+players.get(index).getPlayerID() +" won this round:" + players.get(index).getNumberOfWins() +"\n------");
            }
        }	
    }

    public Boolean confirmPlayerBalance(int balance) {
        if(balance < 250){
            System.out.println("Error: Insufficient funds (A minimum of $250 is needed");
            return false;
        }
        return true;

    }

    public int getRoundsPlayed() {
        return this.roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }
}