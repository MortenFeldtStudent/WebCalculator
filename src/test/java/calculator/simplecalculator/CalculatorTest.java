/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.simplecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nr
 */
public class CalculatorTest {

    Calculator calc = new Calculator();

    int minus = -4;
    int zero = 0;
    int one = 4;
    int two = 12;
    int three = 44;
    int four = 678;
    int five = 1699;
    int six = 87754;

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

    @Test
    public void addTest() {
        int actual = calc.add(one, two);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        int actual = calc.sub(one, four);
        int expected = -674;
        assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        int actual = calc.mul(three, five);
        int expected = 74756;
        assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        int actual = calc.div(four, two);
        int expected = 56;
        assertEquals(expected, actual);
    }
    
        @Test (expected = ArithmeticException.class)
    public void divZeroTest() {
        int actual = calc.div(four, zero);
        int expected = calc.div(678, 0);
    }

}
