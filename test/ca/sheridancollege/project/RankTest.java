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
public class RankTest {
    
    public RankTest() {
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
     * Test of values method, of class Rank.
     */
//    @Test
//    public void testValues() {
//        System.out.println("values");
//        Rank[] expResult = null;
//        Rank[] result = Rank.values();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of valueOf method, of class Rank.
     */
    @Test
    public void testValueOfTrue() {
        System.out.println("valueOfRankTrue");
        String string = "TWO";
        Rank expResult = Rank.TWO;
        Rank result = Rank.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testValueOfFalse() {
        System.out.println("valueOfRankFalse");
        String string = "THREE";
        Rank expResult = Rank.TWO;
        Rank result = Rank.valueOf(string);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testValueOfBoundary() {
        System.out.println("valueOfRankBoundary");
        String string = "JOKER";
        boolean expResult = false;
        boolean result = false;
       
        try{
            Rank instance = Rank.valueOf(string);
            result = true;
            
        }catch(Exception e){
            result = false;
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankKey method, of class Rank.
     */
//    @Test
//    public void testGetRankKey() {
//        System.out.println("getRankKey");
//        Rank instance = null;
//        int expResult = 0;
//        int result = instance.getRankKey();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getRankValue method, of class Rank.
     */
//    @Test
//    public void testGetRankValue() {
//        System.out.println("getRankValue");
//        Rank instance = null;
//        String expResult = "";
//        String result = instance.getRankValue();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
