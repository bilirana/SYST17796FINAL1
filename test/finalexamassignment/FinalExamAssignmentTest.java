/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexamassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aljen
 */
public class FinalExamAssignmentTest {
    
    public FinalExamAssignmentTest() {
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
     * Test of main method, of class FinalExamAssignment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FinalExamAssignment.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateNet method, of class FinalExamAssignment.
     */
    @Test
    public void testCalculateNet() {
        //System.out.println("calculateNet");
        int hours = 1000;
        int rate = 1000;
        int tax = 3;
        double expResult = 12.00;
        double result = FinalExamAssignment.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 12.00);
    }
    
}
