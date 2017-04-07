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
public class BarricadeIT {
    Speler speler;
    Level level;
    
    public BarricadeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        speler = new Speler(0,0);
        level = new Level(1, 10);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of loopBaar method, of class Barricade.
     */
    @Test
    public void testLoopBaarb1s0() {
        System.out.println("test of de speler naar deze barricade met code 1 kan lopen zonder sleutel");
        Speler speler = this.speler;
        speler.setSleutel(0);
        Barricade instance = new Barricade(level,1);
        boolean expResult = false;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }

    /**
     * Test of loopBaar method, of class Barricade.
     */
    @Test
    public void testLoopBaarb1s1() {
        System.out.println("test of de speler naar deze barricade met code 1 kan lopen met sleutel 1");
        Speler speler = this.speler;
        speler.setSleutel(1);
        Barricade instance = new Barricade(level,1);
        boolean expResult = true;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopBaarb1s2() {
        System.out.println("test of de speler naar deze barricade met code 1 kan lopen met sleutel 2");
        Speler speler = this.speler;
        speler.setSleutel(2);
        Barricade instance = new Barricade(level,1);
        boolean expResult = false;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of loopBaar method, of class Barricade.
     */
    @Test
    public void testLoopBaarb2s0() {
        System.out.println("test of de speler naar deze barricade met code 2 kan lopen zonder sleutel1");
        Speler speler = this.speler;
        speler.setSleutel(1);
        Barricade instance = new Barricade(level,1);
        boolean expResult = true;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testLoopBaarb2s1() {
        System.out.println("test of de speler naar deze barricade met code 2 kan lopen met sleutel 1");
        Speler speler = this.speler;
        speler.setSleutel(1);
        Barricade instance = new Barricade(level,2);
        boolean expResult = false;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoopBaarb2s2() {
        System.out.println("test of de speler naar deze barricade met code 2 kan lopen met sleutel 2");
        Speler speler = this.speler;
        speler.setSleutel(2);
        Barricade instance = new Barricade(level,2);
        boolean expResult = true;
        boolean result = instance.loopBaar(speler);
        assertEquals(expResult, result);
    }  
}
