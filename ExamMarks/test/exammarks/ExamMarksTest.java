/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exammarks;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author 19057
 */
public class ExamMarksTest {
    
    public ExamMarksTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of test1Mark method, of class ExamMarks.
     */
    @Test
    public void testTest1MarkGood() {
        System.out.println("test1Mark");
        int mark1 = 51;
        ExamMarks instance = new ExamMarks();
        boolean expResult = true;
        boolean result = instance.test1Mark(mark1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTest1MarkBad() {
        System.out.println("test1Mark");
        int mark1 = 49;
        ExamMarks instance = new ExamMarks();
        boolean expResult = false;
        boolean result = instance.test1Mark(mark1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTest1MarkBoundary() {
        System.out.println("test1Mark");
        int mark1 = 0;
        ExamMarks instance = new ExamMarks();
        boolean expResult = false;
        boolean result = instance.test1Mark(mark1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ExamMarks.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        ExamMarks.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of test2Mark method, of class ExamMarks.
     */
    @Test
    public void testTest2MarkGood() {
        System.out.println("test2Mark");
        int mark2 = 55;
        ExamMarks instance = new ExamMarks();
        boolean expResult = true;
        boolean result = instance.test2Mark(mark2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTest2MarkBad() {
        System.out.println("test2Mark");
        int mark2 = 10;
        ExamMarks instance = new ExamMarks();
        boolean expResult = false;
        boolean result = instance.test2Mark(mark2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTest2MarkBoundary() {
        System.out.println("test2Mark");
        int mark2 = 0;
        ExamMarks instance = new ExamMarks();
        boolean expResult = false;
        boolean result = instance.test2Mark(mark2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
