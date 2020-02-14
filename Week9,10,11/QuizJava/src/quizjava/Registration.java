package quizjava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Registration extends JFrame implements ActionListener {
	JLabel lblFirst,lblLast,lblUser,passwordLabel,confirmPasswordLabel,lblDate,lblEmail;
    JTextField txtFirst,txtUser,txtLast,txtPw, txtRePw,txtEmail,txtDate;
    JButton registerButton,resetButton,backbtn;
    JPasswordField passwordField,confirmPasswordField;
    
    public Registration()
    {
     lblFirst=new JLabel("First Name");
     lblLast=new JLabel("Last Name");
     lblUser=new JLabel("User Name");
     passwordLabel=new JLabel("PASSWORD");
     confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
     lblDate=new JLabel("DATE");
     lblEmail=new JLabel("EMAIL");
     registerButton=new JButton("REGISTER");
     resetButton=new JButton("RESET");
     backbtn=new JButton("Back");
     
     txtFirst=new JTextField();
     txtLast=new JTextField();
     txtUser= new JTextField();
     passwordField=new JPasswordField();
     confirmPasswordField=new JPasswordField();
     txtDate= new JTextField();
     txtEmail=new JTextField();
   
     setTitle("Student Register");
     setSize(450,600);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container c=getContentPane();
     c.setLayout(null);
     setVisible(true);
     c.setBackground(Color.GRAY);
       
        lblFirst.setBounds(20,20,80,70);
        lblLast.setBounds(20,70,80,70);
        lblUser.setBounds(20,120,80,70);
        passwordLabel.setBounds(20,170,100,70);
        confirmPasswordLabel.setBounds(20,220,140,70);
        lblDate.setBounds(20,270,100,70);
        lblEmail.setBounds(20,320,100,70);
        
        txtFirst.setBounds(180,43,165,23);
        txtLast.setBounds(180,93,165,23);
        txtUser.setBounds(180,143,165,23);
        passwordField.setBounds(180,193,165,23);
        confirmPasswordField.setBounds(180,243,165,23);
        txtDate.setBounds(180,293,165,23);
        txtEmail.setBounds(180,343,165,23);
        
        registerButton.setBounds(70,400,100,35);
        resetButton.setBounds(220,400,100,35);
        backbtn.setBounds(150,470,100,35);
        
        c.add(lblFirst);
        c.add(lblLast);
        c.add(lblUser);
        c.add(passwordLabel);
        c.add(confirmPasswordLabel);
        c.add(lblDate);
        c.add(lblEmail);
        
        c.add(txtFirst);
        c.add(txtLast);
        c.add(txtUser);
        c.add(passwordField);
        c.add(confirmPasswordField);
        c.add(txtDate);
        c.add(txtEmail);
        
        c.add(registerButton);
        c.add(resetButton);
        c.add(backbtn);
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        backbtn.addActionListener(this);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==registerButton)
         {   
         dbconnection d = new dbconnection();
          d.resigtration(txtFirst.getText(),txtLast.getText(),txtUser.getText(),passwordField.getText(),confirmPasswordField.getText(),lblDate.getText(),txtEmail.getText());
          try 
            { 
          
                 if(passwordField.getText()== confirmPasswordField.getText() &&!txtUser.getText().equals(""))
                {
                    //Executing query
                    JOptionPane.showMessageDialog(null,"Registered Successfully");
                }

                else
                {
                    JOptionPane.showMessageDialog(null,"Password did not match");
                }
            } 
            catch (Exception ae) 
            {
              System.out.println("Error: "+e);
            }
    }

        if(e.getSource()==resetButton)
        {
            //Clearing Fields
            txtFirst.setText("");
            txtLast.setText("");
            txtUser.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            lblDate.setText("");
            txtEmail.setText("");
        }
        
       if (e.getSource() == backbtn)
         {
         new login();
         dispose();
         }
}    
}



   






