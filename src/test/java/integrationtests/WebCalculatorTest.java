/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import calculator.simplecalculator.Calculator;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

public class WebCalculatorTest {
    
    HttpClient client = new HttpClient("http://localhost:7777/WebCalculator/calculator");
    
    @Test
    public void addTest() throws IOException {
        String res = client.makeHttpRequest("?operation=add&n1=3&n2=3");
        String expected = "Result of: 3+3= 6";
        assertEquals(expected, res);
    }
    
        @Test
    public void subTest() throws IOException {
        String res = client.makeHttpRequest("?operation=sub&n1=3&n2=3");
        String expected = "Result of: 3-3= 0";
        assertEquals(expected, res);
    }
    
        @Test
    public void mulTest() throws IOException {
        String res = client.makeHttpRequest("?operation=mul&n1=3&n2=3");
        String expected = "Result of: 3*3= 9";
        assertEquals(expected, res);
    }
    
        @Test
    public void divTest() throws IOException {
        String res = client.makeHttpRequest("?operation=div&n1=3&n2=3");
        String expected = "Result of: 3/3= 1";
        assertEquals(expected, res);
    }
    
    @Test (expected = IOException.class)
    public void divTestByZero() throws IOException {
        String res = client.makeHttpRequest("?operation=div&n1=3&n2=0");
    }
    
//    @Test
//    public void dummyTest()
//    {
//        assertTrue( false );
//    }
}
