/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hockeyregistrar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramneek0308
 */
public class HockeyRegistrarValidatorTest {
    
    public HockeyRegistrarValidatorTest() {
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
     * Test of validateBirthYear method, of class HockeyRegistrarValidator.
     */
    @Test
    public void testValidateBirthYear() {
        System.out.println("validateBirthYear");
        int playerBirthYear = 0;
        HockeyRegistrarValidator instance = new HockeyRegistrarValidator();
        boolean expResult = false;
        boolean result = instance.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
