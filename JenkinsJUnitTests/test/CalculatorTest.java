/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bulltrick
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of Add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int a = 2;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.Add(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        int a = 2;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 6;
        int result = instance.Multiply(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of Divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        int a = 6;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.Divide(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Divide method, of class Calculator.
     */
    @Test
    public void testDivide2() {
        System.out.println("Divide2");
        int a = 6;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 1;
        int result = instance.Divide(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of Divide method, of class Calculator.
     */
    @Test
    public void testDivide3() {
        System.out.println("Divide3");
        int a = 1;
        int b = 10;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.Divide(a, b);
        assertEquals(expResult, result);
    }
}
