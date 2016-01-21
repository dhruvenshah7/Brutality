/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.brutality;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mihir
 */
public class CPD4414Assignment1BrutalityTest {
    
    public CPD4414Assignment1BrutalityTest() {
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
     * Test of main method, of class CPD4414Assignment1Brutality.
     */
    
    
    /**
     * Test of stringPower method, of class CPD4414Assignment1Brutality.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String a = "";
        int b = 0;
        String expResult = "";
        String result = CPD4414Assignment1Brutality.stringPower(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }    
}
