/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
public class CasinoWarsTest {
    
    public CasinoWarsTest() {
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
     * Test of play method, of class CasinoWars.
     */
//    @Test
//    public void testPlay() {
//        System.out.println("play");
//        CasinoWars instance = null;
//        instance.play();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of declareWinner method, of class CasinoWars.
//     */
//    @Test
//    public void testDeclareWinner() {
//        System.out.println("declareWinner");
//        CasinoWars instance = null;
//        instance.declareWinner();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of confirmPlayerBalance method, of class CasinoWars.
     */
    @Test
    public void testConfirmPlayerBalanceTrue() {
        System.out.println("confirmPlayerBalanceTrue");
        int balance = 250;
        CasinoWars instance = new CasinoWars("CasinoWars");
        Boolean expResult = true;
        Boolean result = instance.confirmPlayerBalance(balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testConfirmPlayerBalanceFalse() {
        System.out.println("confirmPlayerBalanceFalse");
        int balance = 100;
        CasinoWars instance = new CasinoWars("CasinoWars");
        Boolean expResult = false;
        Boolean result = instance.confirmPlayerBalance(balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        @Test
    public void testConfirmPlayerBalanceBoundary() {
        System.out.println("confirmPlayerBalanceBoundary");
        int balance = 0;
        CasinoWars instance = new CasinoWars("CasinoWars");
        Boolean expResult = false;
        Boolean result = instance.confirmPlayerBalance(balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundsPlayed method, of class CasinoWars.
     */
//    @Test
//    public void testGetRoundsPlayed() {
//        System.out.println("getRoundsPlayed");
//        CasinoWars instance = new CasinoWars("CasinoWars");
//        int expResult = 10;
//        instance.setRoundsPlayed(10);
//        int result = instance.getRoundsPlayed();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
//
//    /**
//     * Test of setRoundsPlayed method, of class CasinoWars.
//     */
//    @Test
//    public void testSetRoundsPlayed() {
//        System.out.println("setRoundsPlayed");
//        int roundsPlayed = 0;
//        CasinoWars instance = null;
//        instance.setRoundsPlayed(roundsPlayed);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
