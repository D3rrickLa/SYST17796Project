package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class playGame {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
                Scanner s=new Scanner(System.in);
                String pname="";
                int pbalance=0;
                //Players[] pl=new Players[5];
                ArrayList<Players> players= new ArrayList<>(5);
                // GroupOfCards cards = new GroupOfCards(52);
		// System.out.println(cards.showCards());


		// Dealer d1 = new Dealer();
		// System.out.println(d1.Distribute());
		// d1.shuffle();
		// System.out.println("\n\n\n\n");
		// System.out.println(d1.Distribute());
                 
		//CasinoWars game1 = new CasinoWars("Game");
		//game1.play();
                Game g=new Game("Casinowars") {
                    @Override
                    public void play() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }

                    @Override
                    public void declareWinner() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };
                CasinoWarsPlayer p=new CasinoWarsPlayer(pname,pbalance);
                for(int i=0;i<5;i++)
                {
                    System.out.println("Enter Name : ");
                    pname=s.next();
                    System.out.println("Enter balance : ");
                    do
                    {
                        pbalance=s.nextInt();
                    }while(!p.checkBalance(pbalance));
                    p.setPlayerID(pname);
                    p.setBalance(pbalance);
                    players.add(new CasinoWarsPlayer(pname,pbalance));
                    //System.out.println(""+p.toString());
                }
                CasinoWars cw=new CasinoWars("Casinowars");
                cw.setPlayers(players);
                //g.setPlayers((ArrayList<CasinoWarsPlayer>) players);
                for(Players p2: players)
                {
                    System.out.println(p2.toString());
                }
                System.out.println(cw.getGameName());
                System.out.println(cw.getPlayers());
                
        }
}
