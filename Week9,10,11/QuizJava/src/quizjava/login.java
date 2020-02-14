package quizjava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class login extends JFrame implements ActionListener {
	JLabel lblUsrnm,lblGenTok,lblDisplay,lblTok;
    JTextField txtUsrnm,txtGenTok,txtTok;
    JButton btnLogin,btnRegister,btnToken,btnExit;

    public login() 
    {
        
     
     lblUsrnm=new JLabel("Username");
     lblGenTok=new JLabel("Your Token");
     lblTok=new JLabel("Enter Token");
     lblDisplay=new JLabel("Please enter the mentioned details!! If not registered Sign Up Now!!");
     txtUsrnm=new JTextField();
     txtTok =new JTextField();
     txtGenTok=new JTextField();
     btnLogin=new JButton("Studnt Login");
     btnRegister=new JButton("Register");
     btnToken=new JButton("Generate Token");
     btnExit=new JButton("Exit");
     
     setTitle("Student Login");
     setSize(550,350);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container c=getContentPane();
     c.setLayout(null);
     setVisible(true);
    
        lblDisplay.setBounds(90,30,400,60);
        lblDisplay.setForeground(Color.yellow);
        
        lblUsrnm.setBounds(30,80,200,20);
        lblUsrnm.setForeground(Color.WHITE);
        lblGenTok.setBounds(30,120,200,20);
        lblGenTok.setForeground(Color.WHITE);
        lblTok.setBounds(30,160,200,20);
        lblTok.setForeground(Color.WHITE);
        
        txtUsrnm.setBounds(140,80,200,30);
        txtGenTok.setBounds(140,120,200,30);
        txtTok.setBounds(140,160,200,30);
        
        btnToken.setBounds(370,80,125,30);
        btnLogin.setBounds(370,120,125,30);
        btnRegister.setBounds(370,160,125,30);
        btnExit.setBounds(200,220,100,30);
        
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        btnToken.addActionListener(this);
        btnExit.addActionListener(this);
        
        c.add(lblUsrnm);c.add(lblGenTok);c.add(lblDisplay);c.add(txtUsrnm);c.add(txtGenTok);c.add(lblTok);c.add(txtTok);
        c.add(btnToken);c.add(btnLogin);c.add(btnRegister);c.add(btnExit);
    }

 
    @Override
    public void actionPerformed(ActionEvent e) {
    
         if(e.getSource().equals(btnRegister))
         {
             new Registration();
             dispose();
         }
      
         if(e.getSource().equals(btnExit))
         {
             System.exit(0);
         }
         if (e.getSource().equals(btnToken))
              {
                  String usr= txtUsrnm.getText();
                  try
                  {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
                    PreparedStatement pstmt = conc.prepareStatement("SELECT * FROM `resigtration` WHERE Username=? ");
                    pstmt.setString(1, usr);
                    ResultSet rs = pstmt.executeQuery(); 
                    if(txtUsrnm.getText()==("Username"))
                    {
                        JOptionPane.showMessageDialog(null, "sucess");
                    }
                    if (rs.next())
                         {
                            String st= rs.getString("Username");
                            txtGenTok.setText(st +"NiK09");
                         }
                    else 
                    {
                       JOptionPane.showMessageDialog(null, "Please enter a valid Username to generate token11");
                    }
                  }
            
              catch(Exception ae)
                {
                    System.out.println("Error:" + e);
                }
             }
        
          if(e.getSource().equals(btnLogin))
           {
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `stdlogin`(`UserName`, `Password`, `Token`) VALUES(?,?,?)");
             pstmt.setString(1, txtUsrnm.getText());
             pstmt.setString(2, txtGenTok.getText());
             pstmt.setString(3, txtTok.getText());
             
               if(txtUsrnm.getText().equals(""))
                 JOptionPane.showMessageDialog(txtTok, "Please enter correct Username");
                 txtUsrnm.requestFocus();
             
               if(txtTok.getText().equals(""))
                 JOptionPane.showMessageDialog(txtTok, "Please enter token");
               
               if(txtTok.getText().equals(txtGenTok.getText()) &&!txtUsrnm.getText().equals(""))
               {
                 JOptionPane.showMessageDialog(null, "User Logined");
                 new questions();
                 dispose();
               }
               else
               {
               JOptionPane.showMessageDialog(null, "Token Login Failed");
               }
            }
            catch(Exception ae)
            {
                System.out.println("Error:" + e);
            }
        }
    }
}
