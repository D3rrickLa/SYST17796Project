package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CasinoWars extends Game {

    private int roundsPlayed;
    private ArrayList<CasinoWarsPlayer> players;
    private final int numOfPlayers = 5;
    private final int numOfRounds = 10;
    public CasinoWars(String s){
            super(s);
            roundsPlayed = 0;
            players = new ArrayList<>();

    }
       
    @Override
    public void play() {

        try {
            Thread.sleep(500);
            System.out.println("---------------Hello Welcome to Casnio Wars---------------");
            Thread.sleep(1000);
            System.out.println("In this game, 5 players will be given a random card by the dealer");
            Thread.sleep(1000);
            System.out.println("Players will bet $25 and when ready, the dealer will ask the players");
            Thread.sleep(1000);
            System.out.println("to reveal their hand, the player with the highest card wins that around");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner input = new Scanner(System.in);
        int counterPlayers = 1;
        System.out.println("Ready to player?(Yes/No):");
        boolean run = true;
        while(run){
            String playersAns = input.next();
            if(playersAns.equalsIgnoreCase("yes") || playersAns.equalsIgnoreCase("y")){
                for (int i = 0; i < numOfPlayers; i++) {
                    String playerName;
                    int balance = 0;
                    System.out.println("Player"+ counterPlayers++ +", please enter your name");
                    playerName = input.next();
                    while(true){
                        System.out.println("Please enter your balance");
                        balance = input.nextInt();
                        input.nextLine(); //eats the nextline from the nextInt
                        if(confirmPlayerBalance(balance)){
                            break;
                        }
                    }	
                    players.add(new CasinoWarsPlayer(playerName, balance, new StandardPlayingCards(Suits.CLUBS, Rank.ACE)));
                }
                
                run = false;
            }
            else if(playersAns.equalsIgnoreCase("no") || playersAns.equalsIgnoreCase("no")){
                System.out.println("Leaving the game. Goodbye");
                System.exit(0);
            }
            else{
                System.out.println("Please enter a value input");
            }
        }
       

        while(roundsPlayed <= numOfRounds){
            if(roundsPlayed != numOfRounds){
                try {
                    Thread.sleep(500);
                    System.out.println("$25 has been deducted from all Players");
                    Thread.sleep(1000);
                    System.out.println("Dealer is now dealing the cards to the players");
                    System.out.println("Round:" + (roundsPlayed+1));
                    Dealer dealer = new Dealer();
                    dealer.shuffle();
                    for (int i = 0; i < numOfPlayers; i++) {
                            players.get(i).setCard(dealer.Distribute());
                            players.get(i).play();
                    }	


                } catch (InterruptedException ex) {
                    Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
           
            roundsPlayed++;
            declareWinner();
        }
        input.close();
        
    }  
        
    @Override
    public void declareWinner() {
        if(roundsPlayed <= numOfRounds){
            int max = players.get(0).getCard().getRanks().rankKey;
            int suit = players.get(0).getCard().getSuits().suitOrder;
            int index = 0;
            for(int i = 0; i <players.size(); i++ ){
                if(players.get(i).getCard().getRanks().rankKey == max && !(players.get(i).getCard().getSuits().suitOrder == suit)){
                    int comparing = Integer.compare(players.get(i).getCard().getSuits().suitOrder, suit);
                    if(comparing == 1){
                        suit = players.get(i).getCard().getSuits().suitOrder;
                        index = i;
                    }
                }
                if(players.get(i).getCard().getRanks().rankKey > max){
                    max = players.get(i).getCard().getRanks().rankKey;
                    index = i;
                }
            }
           
            try {
                Thread.sleep(1000);
                System.out.println("Cards have been dealt");
                Thread.sleep(1000);
                System.out.println("Reveal your cards in...");
                Thread.sleep(1000);
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println();
                
                for (CasinoWarsPlayer casinoWarsPlayer : players) {
                System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getCard());
                }
                
                Thread.sleep(1000);
                
                players.get(index).setBalance(players.get(index).getBalance() + 100);
                players.get(index).setNumberOfWins(players.get(index).getNumberOfWins() + 1);
                System.out.println("Player: "+players.get(index).getPlayerID() +" won this round.");
                System.out.println("-----------");
                
                for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + "| Balance: " + casinoWarsPlayer.getBalance() + "| Number of Wins: " + casinoWarsPlayer.getNumberOfWins());
                } 
                
            } catch (InterruptedException ex) {
                Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
            } 
            System.out.println("-----------");
            Scanner input = new Scanner(System.in);
            boolean cont = true;
            while(cont) {
                System.out.println("This is the end round, press <enter> to continue");
                String readString = input.nextLine();
               

                if (readString.isEmpty()) {
                    cont = false;
                }

            }
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

            ArrayList<Integer> dupWins = new ArrayList<>();
            for (int i = 0; i < lstOfWins.length; i++) {
                if(lstOfWins[i] == maxWins || !(i == players.indexOf(players.get(i)))){
                    dupWins.add(i);
                }
            }

            if(dupWins.size() == 1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Congraulations " + players.get(indexOfWinner).getPlayerID() + " You won the game!!!");
                System.out.println("Final Scores and Balance:");
                for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getBalance() + "| Number of Wins: " + casinoWarsPlayer.getNumberOfWins());
                }
                
            }
            else{
                
                try {
                    Thread.sleep(1000);
                    System.out.println("Uh oh, looks like there is a tie between players...");
                    Thread.sleep(1000);
                    System.out.println("We are now entering to sudden death");
                } catch (InterruptedException ex) {
                    Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                try {
                    Thread.sleep(1000);
                    System.out.println("Cards have been dealt");
                    Thread.sleep(1000);
                    System.out.println("Reveal your cards in...");
                    Thread.sleep(1000);
                    System.out.println("3");
                    Thread.sleep(1000);
                    System.out.println("2");
                    Thread.sleep(1000);
                    System.out.println("1");
                    Thread.sleep(1000);
                    for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getCard());
                    }
                    Thread.sleep(1000);
                    players.get(index).setBalance(players.get(index).getBalance() + 100);
                    players.get(index).setNumberOfWins(players.get(index).getNumberOfWins() + 1);
                    System.out.println("\nPlayer: "+players.get(index).getPlayerID() +" won this round:" + players.get(index).getNumberOfWins() +"\n------");
                    System.out.println("Final Scores and Balance:");
                    for (CasinoWarsPlayer casinoWarsPlayer : players) {
                    System.out.println(casinoWarsPlayer.getPlayerID() + ": " + casinoWarsPlayer.getBalance() + "| Number of Wins: " + casinoWarsPlayer.getNumberOfWins());
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(CasinoWars.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }	
    }

    public Boolean confirmPlayerBalance(int balance) {
        if(balance >= 250){
            return true;
        }
//        System.out.println("Error: Insufficient funds (A minimum of $250 is needed)");
        return false;

    }

    public int getRoundsPlayed() {
        return this.roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }
}
