/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizjava;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eshta Shahi
 */
public class adminTest {
    
    public adminTest() {
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
     * Test of actionPerformed method, of class admin.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("admin check");
       admin instance = new admin();
		

		
		instance.textusernm.setText("admin");
		instance.pass.setText("admin");
		
		instance.btnlog.doClick();
//			assertEquals(expResult, expResult);
    }
    
}
