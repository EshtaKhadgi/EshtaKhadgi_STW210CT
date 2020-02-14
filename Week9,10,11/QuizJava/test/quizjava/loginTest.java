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
public class loginTest {
    
    public loginTest() {
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
     * Test of actionPerformed method, of class login.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("Generated");
        login instance = new login();
		instance.txtUsrnm.setText("eshta");
		instance.txtGenTok.setText("eshtaNiK09");
		instance.txtTok.setText("eshtaNiK09");
		instance.btnLogin.doClick();
    }
    
}
