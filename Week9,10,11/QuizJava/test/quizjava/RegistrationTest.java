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
public class RegistrationTest {
    
    public RegistrationTest() {
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
     * Test of actionPerformed method, of class Registration.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("Registered");
       Registration instance = new Registration();
//		JTextField txtFirst = new JTextField();
		instance.txtFirst.setText("eshta");
		instance.txtLast.setText("shahi");
		instance.txtUser.setText("eshta");
		instance.txtDate.setText("date");
		instance.txtEmail.setText("eshta@gmail.com");
		instance.passwordField.setText("eshta");
		instance.confirmPasswordField.setText("eshta");
		
		instance.registerButton.doClick();
    }
    
}
