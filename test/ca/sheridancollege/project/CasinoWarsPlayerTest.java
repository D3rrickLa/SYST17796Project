/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gen3r
 */
public class CasinoWarsPlayerTest {
    
    public CasinoWarsPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class CasinoWarsPlayer.
     */
//    @Test
//    public void testPlay() {
//        System.out.println("play");
//        CasinoWarsPlayer instance = null;
//        instance.play();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of bet method, of class CasinoWarsPlayer.
     */
    @Test
    public void testBetTrue() {
        System.out.println("betTrue");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        int expResult = 25;
        int result = instance.bet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testBetFalse() {
        System.out.println("betFalse");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        boolean expResult = false;
        int betAmount = 15;
        boolean result = false;
        if(instance.bet() == betAmount){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
        @Test
    public void testBetBoundary() {
        System.out.println("betBoundary");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        boolean expResult = false;
        int betAmount = 0;
        boolean result = false;
        if(instance.bet() == betAmount){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class CasinoWarsPlayer.
     */
    @Test
    public void testGetBalanceTrue() {
        System.out.println("getBalanceTrue");
        int expResult = 500;
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetBalanceFalse() {
        System.out.println("getBalanceTrue");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        boolean expResult = false;
        boolean result = false;
        int balance = 100;
        if(instance.getBalance() == balance){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetBalanceBoundary() {
        System.out.println("getBalanceTrue");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.CLUBS, Rank.ACE));
        boolean expResult = false;
        boolean result = false;
        int balance = 0;
        if(instance.getBalance() == balance){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
//
//    /**
//     * Test of setBalance method, of class CasinoWarsPlayer.
//     */
//    @Test
//    public void testSetBalance() {
//        System.out.println("setBalance");
//        int balance = 0;
//        CasinoWarsPlayer instance = null;
//        instance.setBalance(balance);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCard method, of class CasinoWarsPlayer.
//     */
    @Test
    public void testGetCardTrue() {
        System.out.println("getCardTrue");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.HEARTS, Rank.ACE));
        StandardPlayingCards instance2 = new StandardPlayingCards(Suits.HEARTS, Rank.ACE);
        String expResult = instance2.toString();
        String result = instance.getCard().toString();
          
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetCardFalse() {
        System.out.println("getCardFalse");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.HEARTS, Rank.ACE));
        StandardPlayingCards instance2 = new StandardPlayingCards(Suits.DIAMONDS, Rank.TWO);
        String expResult = instance2.toString();
        String result = instance.getCard().toString();
          
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetCardBoundary() {
        System.out.println("getCardBoundary");
        CasinoWarsPlayer instance = new CasinoWarsPlayer("derrick", 500, new StandardPlayingCards(Suits.HEARTS, Rank.ACE));
        String expResult = null;
        String result    = instance.getCard().toString();
          
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of setCard method, of class CasinoWarsPlayer.
//     */
//    @Test
//    public void testSetCard() {
//        System.out.println("setCard");
//        StandardPlayingCards card = null;
//        CasinoWarsPlayer instance = null;
//        instance.setCard(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNumberOfWins method, of class CasinoWarsPlayer.
//     */
//    @Test
//    public void testGetNumberOfWins() {
//        System.out.println("getNumberOfWins");
//        CasinoWarsPlayer instance = null;
//        int expResult = 0;
//        int result = instance.getNumberOfWins();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNumberOfWins method, of class CasinoWarsPlayer.
//     */
//    @Test
//    public void testSetNumberOfWins() {
//        System.out.println("setNumberOfWins");
//        int numberOfWins = 0;
//        CasinoWarsPlayer instance = null;
//        instance.setNumberOfWins(numberOfWins);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class CasinoWarsPlayer.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        CasinoWarsPlayer instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
