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
 * @author gebruiker
 */
public class MuurIT {
    
    public MuurIT() {
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
     * Test of loopBaar method, of class Muur.
     */
    @Test
    public void testLoopBaar() {
        System.out.println("loopBaar");
        Speler speler = new Speler(0,0);
        Muur instance = new Muur(new Level(1,10));
        boolean expResult = false;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }
    
}
