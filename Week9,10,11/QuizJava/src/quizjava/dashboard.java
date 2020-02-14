package quizjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class dashboard extends JFrame implements ActionListener{
	JLabel lbl1;
	 JButton btnadmin,btnstd;
	    public dashboard(){
	    
	    btnadmin=new JButton("Admin");
	    btnstd=new JButton("Student");
	    lbl1=new JLabel("Please choose User Type");
	    
	    
	        setTitle("USER LOGIN");
	        setSize(400, 200);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Container c=getContentPane();
	    c.setLayout(null);

	    btnadmin.setBounds(30,100,120,40);
	    btnadmin.addActionListener(this);
	    btnstd.setBounds(250,100,120,40);
	    btnstd.addActionListener(this);

	    lbl1.setBounds(120,50,200,30);
	    c.add(btnadmin);c.add(btnstd);c.add(lbl1);
	}
	public static void main(String[] args) 
	{
	    new dashboard().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    if(e.getSource().equals(btnadmin)){
	        new admin();
	        dispose();
	    }
	        if(e.getSource().equals(btnstd)){
	        new login();
	        dispose();
	         }
	}
}
