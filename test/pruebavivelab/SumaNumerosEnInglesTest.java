/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavivelab;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author richard-usr
 */
public class SumaNumerosEnInglesTest {
    
    public SumaNumerosEnInglesTest() {
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
     * Test of validar method, of class SumaNumerosEnIngles.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        String numero = "";
        boolean expResult = false;
        boolean result = SumaNumerosEnIngles.validar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pivot method, of class SumaNumerosEnIngles.
     */
    @Test
    public void testPivot() {
        System.out.println("pivot");
        ArrayList<String> expResult = null;
        ArrayList<String> result = SumaNumerosEnIngles.pivot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertir method, of class SumaNumerosEnIngles.
     */
    @Test
    public void testConvertir() {
        System.out.println("convertir");
        ArrayList<String> numeros = null;
        long expResult = 0L;
        long result = SumaNumerosEnIngles.convertir(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
