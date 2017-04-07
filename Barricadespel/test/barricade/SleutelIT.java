/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author William
 */
public class SleutelIT {
    
    public SleutelIT() {
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
     * Test of loopBaar method, of class Sleutel.
     */
    @Test
    public void testLoopBaar() {
        System.out.println("loopBaar");
        Speler speler = new Speler(0,0);
        Sleutel instance = new Sleutel(new Level(1, 10), 1);
        boolean expResult = true;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }   
}
