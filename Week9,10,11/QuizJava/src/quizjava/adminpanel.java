package quizjava;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class adminpanel extends JFrame implements ActionListener {
	JLabel lblDisplay,lblCourse,lblQno,lblQst,lblOpt1,lblOpt2,lblOpt3,lblOpt4,lblCAns;
    JTextField txtQno,txtQst,txtOpt1,txtOpt2,txtOpt3,txtOpt4,txtCAns;
    JComboBox module;
    JButton btnset,btnBack;
    
    
    public adminpanel() 
    {
        setTitle("Admin Questions Management Form");
        setSize(700,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
        setVisible(true); 
        
        lblDisplay= new JLabel("Welcome to Admin Panel");
        lblCourse= new JLabel("Module :");
      
         
        module=new JComboBox();
        module.addItem("Computer");
        module.addItem("Maths");
        module.addItem("EffectiveCommunication");
        module.addItem("English");
       
        lblQno= new JLabel("Q No. :");   
        lblQst= new JLabel("Question :");
        lblOpt1= new JLabel("Options 1");
        lblOpt2= new JLabel("Options 2");
        lblOpt3= new JLabel("Options 3");
        lblOpt4= new JLabel("Options 4");
        lblCAns=new JLabel("Correct Ans :");
      
        txtQno=new JTextField();   
        txtQst=new JTextField();
        txtOpt1=new JTextField();
        txtOpt2=new JTextField();
        txtOpt3=new JTextField();
        txtOpt4=new JTextField();
        txtCAns=new JTextField();
           
        btnset= new JButton("Add");
        btnBack= new JButton("Back");
        
        lblDisplay.setBounds(300,15,180,30);
        lblCourse.setBounds(40,60,180,30);
        module.setBounds(100,60,180,35);
        
        lblQno.setBounds(60,150,160,10);
        lblQst.setBounds(60,205,160,10);
        lblOpt1.setBounds(60,260,160,10);
        lblOpt2.setBounds(60,315,160,10);
        lblOpt3.setBounds(60,370,160,10);
        lblOpt4.setBounds(60,425,160,10);
        lblCAns.setBounds(60,480,160,10);
         
        txtQno.setBounds(160,135,100,40);
        txtQno.setForeground(Color.blue);
        txtQst.setBounds(160,190,500,40);
        txtOpt1.setBounds(160,245,200,40);
        txtOpt2.setBounds(160,300,200,40);
        txtOpt3.setBounds(160,355,200,40);
        txtOpt4.setBounds(160,410,200,40);
        txtOpt1.setForeground(Color.green);
        txtOpt2.setForeground(Color.green);
        txtOpt3.setForeground(Color.green);
        txtOpt4.setForeground(Color.green);
        txtCAns.setBounds(160,465,200,40);
        txtCAns.setForeground(Color.red);
          
        btnset.setBounds(60,540,120,35);
        btnset.addActionListener(this);
        
        btnBack.setBounds(280,540,120,35);
        btnBack.addActionListener(this);
     
   
        c.add(lblDisplay);c.add(lblCourse);c.add(module);
        c.add(lblQno);c.add(lblQst);c.add(lblOpt1);c.add(lblOpt2);c.add(lblOpt3);c.add(lblOpt4);c.add(lblCAns);
        c.add(txtQno);c.add(txtQst);c.add(txtOpt1);c.add(txtOpt2);c.add(txtOpt3);c.add(txtOpt4);c.add(txtCAns);
        c.add(btnset);c.add(btnBack);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource().equals(btnset))
       {
         if(module.getSelectedItem()=="Computer")
         {
              dbconnection d = new dbconnection();
              d.computer(txtQno.getText(),txtQst.getText(),txtOpt1.getText(), txtOpt2.getText(),txtOpt3.getText(),txtOpt4.getText(),txtCAns.getText());
         }
          if(module.getSelectedItem()=="Maths")
          {
               dbconnection d = new dbconnection();
               d.maths(txtQno.getText(),txtQst.getText(),txtOpt1.getText(), txtOpt2.getText(),txtOpt3.getText(),txtOpt4.getText(),txtCAns.getText());
          }
           if(module.getSelectedItem()=="EffectiveCommunication")
           {   
               dbconnection d = new dbconnection();
               d.effectivecommunication(txtQno.getText(),txtQst.getText(),txtOpt1.getText(), txtOpt2.getText(),txtOpt3.getText(),txtOpt4.getText(),txtCAns.getText());
           }
            if(module.getSelectedItem()=="English")
            {    
                dbconnection d = new dbconnection();
                d.english(txtQno.getText(),txtQst.getText(),txtOpt1.getText(), txtOpt2.getText(),txtOpt3.getText(),txtOpt4.getText(),txtCAns.getText());
            }
       }
          
          if(e.getSource().equals(btnBack))
          {
           new admin();
           dispose();
          }
    }
    
}







