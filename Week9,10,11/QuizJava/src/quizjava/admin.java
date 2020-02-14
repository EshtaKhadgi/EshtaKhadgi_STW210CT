package quizjava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class admin extends JFrame implements ActionListener{
	 JLabel lblUsr,lblPw;
	    JTextField textusernm;
	    JPasswordField pass;
	    JButton btnlog;

	    public admin()
	    {
	     lblUsr=new JLabel("User Name");
	     
	     lblPw=new JLabel("Password");
	     textusernm=new JTextField();
	     pass =new JPasswordField();
	     btnlog=new JButton("Login");
	     
	     setTitle("Admin Login");
	     
	     setSize(450,400);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	     Container c=getContentPane();
	     c.setLayout(null);
	     setVisible(true);
	    
	     lblUsr.setBounds(20,60,200,20);
	     lblPw.setBounds(20,120,200,20);
	     textusernm.setBounds(180,60,200,30);
	     pass.setBounds(180,120,200,30);
	     btnlog.setBounds(220,200,100,35);
	     btnlog.addActionListener(this);
	        
	     c.add(lblUsr);c.add(lblPw);c.add(textusernm);c.add(pass);c.add(btnlog);
	    }
	    
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	      if (e.getSource() == btnlog) 
	       {
	            String usr;
	            String pw;
	            usr = textusernm.getText();
	            pw = pass.getText();
	            if (usr.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("admin"))
	            {
	                JOptionPane.showMessageDialog(this, "Login Successful");
	                new adminpanel();
	                dispose();
	            } 
	            else 
	            {
	                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	            }
	               
	        }
	    
	}

}
