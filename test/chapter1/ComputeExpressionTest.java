/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import chapter1.ComputeExpression;

/**
 *
 * @author ialsmadi
 */
public class ComputeExpressionTest {
    public ComputeExpression cp1;
    public ComputeExpressionTest() {
        cp1= new ComputeExpression();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void ch1Test1() {
         cp1.testComputeExpression();
         assertTrue(cp1.k==9);
     }
}
