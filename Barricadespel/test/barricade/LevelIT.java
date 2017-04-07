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
public class LevelIT {

    Level level;

    public LevelIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        level = new Level(4, 10);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakLeegVak() {
        System.out.println("check een Leeg Vak");
        int rij = 0;
        int kolom = 5;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1ZonderSleutel() {
        System.out.println("check een barricade met code 1 zonder de sleutel");
        int rij = 2;
        int kolom = 2;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1MetSleutel1() {
        System.out.println("check een barricade met code 1 met sleutel met code 1");
        level.checkVak(9, 4);
        int rij = 2;
        int kolom = 2;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1MetSluetel2() {
        System.out.println("check een barricade met code 1 met sleutel met code 2");
        level.checkVak(0, 3);
        int rij = 2;
        int kolom = 2;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1MetSleutel3() {
        System.out.println("check een barricade met code 1 met sleutel met code 3");
        level.checkVak(1, 1);
        int rij = 2;
        int kolom = 2;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1MetSluetel4() {
        System.out.println("check een barricade met code 1 met sleutel met code 4");
        level.checkVak(4, 3);
        int rij = 2;
        int kolom = 2;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade1MetSleutel5() {
        System.out.println("check een barricade met code 1 met sleutel met code 5");
        level.checkVak(2, 5);
        int rij = 2;
        int kolom = 2;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2ZonderSleutel() {
        System.out.println("check een barricade met code 2 zonder de sleutel");
        int rij = 6;
        int kolom = 4;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2MetSleutel1() {
        System.out.println("check een barricade met code 2 met sleutel met code 1");
        level.checkVak(9, 4);
        int rij = 6;
        int kolom = 4;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2MetSluetel2() {
        System.out.println("check een barricade met code 2 met sleutel met code 2");
        level.checkVak(0, 3);
        int rij = 6;
        int kolom = 4;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2MetSleutel3() {
        System.out.println("check een barricade met code 2 met sleutel met code 3");
        level.checkVak(1, 1);
        int rij = 6;
        int kolom = 4;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2MetSluetel4() {
        System.out.println("check een barricade met code 2 met sleutel met code 4");
        level.checkVak(4, 3);
        int rij = 6;
        int kolom = 4;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade2MetSleutel5() {
        System.out.println("check een barricade met code 2 met sleutel met code 5");
        level.checkVak(2, 5);
        int rij = 6;
        int kolom = 4;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3ZonderSleutel() {
        System.out.println("check een barricade met code 3 zonder de sleutel");
        int rij = 1;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3MetSleutel1() {
        System.out.println("check een barricade met code 3 met sleutel met code 1");
        level.checkVak(9, 4);
        int rij = 1;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3MetSluetel2() {
        System.out.println("check een barricade met code 3 met sleutel met code 2");
        level.checkVak(0, 3);
        int rij = 1;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3MetSleutel3() {
        System.out.println("check een barricade met code 3 met sleutel met code 3");
        level.checkVak(1, 1);
        int rij = 1;
        int kolom = 3;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3MetSluetel4() {
        System.out.println("check een barricade met code 3 met sleutel met code 4");
        level.checkVak(4, 3);
        int rij = 1;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade3MetSleutel5() {
        System.out.println("check een barricade met code 3 met sleutel met code 5");
        level.checkVak(2, 5);
        int rij = 1;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4ZonderSleutel() {
        System.out.println("check een barricade met code 4 zonder de sleutel");
        int rij = 8;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4MetSleutel1() {
        System.out.println("check een barricade met code 4 met sleutel met code 1");
        level.checkVak(9, 4);
        int rij = 8;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4MetSluetel2() {
        System.out.println("check een barricade met code 4 met sleutel met code 2");
        level.checkVak(0, 3);
        int rij = 8;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4MetSleutel3() {
        System.out.println("check een barricade met code 4 met sleutel met code 3");
        level.checkVak(1, 1);
        int rij = 8;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4MetSluetel4() {
        System.out.println("check een barricade met code 4 met sleutel met code 4");
        level.checkVak(4, 3);
        int rij = 8;
        int kolom = 3;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade4MetSleutel5() {
        System.out.println("check een barricade met code 4 met sleutel met code 5");
        level.checkVak(2, 5);
        int rij = 8;
        int kolom = 3;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5ZonderSleutel() {
        System.out.println("check een barricade met code 5 zonder de sleutel");
        int rij = 2;
        int kolom = 9;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5MetSleutel1() {
        System.out.println("check een barricade met code 5 met sleutel met code 1");
        level.checkVak(9, 4);
        int rij = 2;
        int kolom = 9;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5MetSluetel2() {
        System.out.println("check een barricade met code 5 met sleutel met code 2");
        level.checkVak(0, 3);
        int rij = 2;
        int kolom = 9;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5MetSleutel3() {
        System.out.println("check een barricade met code 5 met sleutel met code 3");
        level.checkVak(1, 1);
        int rij = 2;
        int kolom = 9;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5MetSluetel4() {
        System.out.println("check een barricade met code 5 met sleutel met code 4");
        level.checkVak(4, 3);
        int rij = 2;
        int kolom = 9;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakBarricade5MetSleutel5() {
        System.out.println("check een barricade met code 5 met sleutel met code 5");
        level.checkVak(2, 5);
        int rij = 2;
        int kolom = 9;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakSleutel1() {
        System.out.println("check een sleutel met code 1");
        int rij = 9;
        int kolom = 4;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakSleutel2() {
        System.out.println("check een sleutel met code 2");
        int rij = 0;
        int kolom = 3;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakSleutel3() {
        System.out.println("check een sleutel met code 3");
        int rij = 1;
        int kolom = 1;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakSleutel4() {
        System.out.println("check een sleutel met code 4");
        int rij = 4;
        int kolom = 3;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakSleutel5() {
        System.out.println("check een sleutel met code 5");
        int rij = 2;
        int kolom = 5;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakMuur() {
        System.out.println("check een muur");
        int rij = 0;
        int kolom = 0;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikN() {
        System.out.println("check buiten bereik boven veld");
        int rij = -1;
        int kolom = 5;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikNO() {
        System.out.println("check buiten bereik boven en rechts van het veld");
        int rij = -1;
        int kolom = 10;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikO() {
        System.out.println("check buiten bereik rechts van het veld");
        int rij = 5;
        int kolom = 10;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikZO() {
        System.out.println("check buiten bereik rechts van het veld en onder het veld");
        int rij = 10;
        int kolom = 10;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikZ() {
        System.out.println("check buiten bereik onder het veld");
        int rij = 10;
        int kolom = 5;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikZW() {
        System.out.println("check buiten bereik onder het veld en links van het veld");
        int rij = 10;
        int kolom = -1;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikW() {
        System.out.println("check buiten bereik links van het veld");
        int rij = 5;
        int kolom = -1;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckbuitenberuikNW() {
        System.out.println("check buiten bereik links van het veld en boven het veld");
        int rij = -1;
        int kolom = -1;
        boolean expResult = false;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkVak method, of class Level.
     */
    @Test
    public void testCheckVakFinish() {
        System.out.println("check de finish");
        int rij = 0;
        int kolom = 9;
        boolean expResult = true;
        boolean result = level.checkVak(rij, kolom);
        assertEquals(expResult, result);
    }
    
    
}
