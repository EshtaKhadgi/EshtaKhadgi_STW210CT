/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizjava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class maths extends JFrame implements ActionListener
{
     JLabel lblquestion;
    JRadioButton btnopt[]=new JRadioButton[5];
    JButton btnPrev,btnSave,btnNext;
    String ans[]=new String[11];
    int count=0,current=0;
    
    long StartTime, EndTime, seconds, minutes, flag=0;
    int a;
    String v;
    
    public maths()
    {
   
        ButtonGroup bg=new ButtonGroup();
        for(int i=0;i<5;i++){
            btnopt[i]=new JRadioButton();
            add(btnopt[i]);
            bg.add(btnopt[i]);
        }
        if(current !=1){
           btnopt[0].setBounds(80,200,150,30);
           btnopt[1].setBounds(80,230,150,30);
           btnopt[2].setBounds(80,260,150,30);
           btnopt[3].setBounds(80,290,150,30);
           
        }
        
        lblquestion =new JLabel();
        
        btnPrev=new JButton("Previous");
        btnSave=new JButton("Submit");
        btnNext=new JButton("Next");
        
        lblquestion.setBounds(50,170,500,30);
        
        btnPrev.setBounds(50,350,100,30);
        btnSave.setBounds(300,350,100,30);
        btnNext.setBounds(150,350,100,30);
        
        btnPrev=new JButton("Previous");
        btnSave=new JButton("Submit");
        btnNext=new JButton("Next");
        
        setTitle("Web Quiz");
        Container c=getContentPane();
        c.setLayout(null);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        btnPrev.setBounds(50,350,100,30);
        btnSave.setBounds(300,350,100,30);
        btnNext.setBounds(175,350,100,30);
        c.add(lblquestion);
        c.add(btnPrev);c.add(btnNext);c.add(btnSave);
        
         btnNext.addActionListener(this);
         btnPrev.addActionListener(this);  
         btnSave.addActionListener(this); 
         btnopt[0].addActionListener(this);
         btnopt[1].addActionListener(this);
         btnopt[3].addActionListener(this);
         btnopt[0].addActionListener(this);
         setnext();
    }
 private void setnext() 
     {
        btnopt[4].setSelected(true);  
        int k=0;
        try
        {
          for(int i=1; i<=10;i++){
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
           
            if(current==k)  
            {  
               PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM `maths` order by RAND() Limit 1");
               ResultSet rs = pstmt.executeQuery(); 
               if(rs.next()){  
                String s1 =rs.getString("Question");
                String s2 =rs.getString("OptionA"); 
                String s3 =rs.getString("OptionB"); 
                String s4 =rs.getString("OptionC");
                String s5 =rs.getString("OptionD");
                String s6=rs.getString("Answer");
              
                lblquestion.setText("Q."+i+""+s1); 
                btnopt[0].setText(s2);
                btnopt[1].setText(s3);btnopt[2].setText(s4);btnopt[3].setText(s5);}
            
            }
            k++;
            }
          }   
        catch(Exception ae)
        {
            System.out.println("setnext"+ae);
        }
     }
  
   
         void check()//func to chck corect ans
         {
           try
           {
             dbconnection db= new dbconnection();
             Statement st =  db.conc.createStatement();
             String sq= "select * from maths";
             ResultSet rS= st.executeQuery(sq);
             for (int i=1; i<=10; i++)
             {
                 rS.absolute(i);
                 ans[i] = rS.getString("Answer");
                 for(int j=0; j<4; j++)
                 {
                  if(btnopt[j].isSelected())
                  {
                      v = btnopt[j].getText();
                      String s = v;
                      if (s.equals(ans[i]))
                      {
                          count++;
                      }
                  }
                 }
             }
         }
         catch(Exception e)
         {
             System.out.println("check: CATCH:" + e);
         }
         
         }
         
       void ansDisplay()
        {
          try
           {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
            Statement stmt = con.createStatement();
            String answerkey="";
            answerkey+="Answer Key:\nQ.No.  Your answer is Correct Answer\n";
            for(int i=1;i<=10;i++)
            {
                String sql="select CorrectAns from maths where QuestionNo="+i+"";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                String s2 =rs.getString("Answer"); 
                if(i<=9)
                 answerkey+="   "+(char)(i+48)+" "+s2+"\n";
                else
                 answerkey+="  10"+"      "+s2+"\n";
            }
            JOptionPane.showMessageDialog(this,answerkey); 
            System.exit(0);
            con.close();
        }
          
        catch(Exception e)
        {
            System.out.println("showAnswerKey\n"+e);
        }
    }
        
   

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==btnopt[0])
        {  
          try
          {
              for (int i=0; i<=10;i++)
              {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
          PreparedStatement pstmt = conn.prepareStatement("SELECT Answer FROM `maths` WHERE QuestionNo="+i+"");
          ResultSet rs = pstmt.executeQuery(); 
          }
          }
          catch(Exception ae)
          {
              System.out.println("other"+ae);
          }
            
            count=+1;
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e.getSource()==btnNext && current ==9)
       {
           btnSave.setVisible(true);
           btnNext.setVisible(false);
         JOptionPane.showMessageDialog(this, "End of Questions");
       }
       else if(e.getSource().equals(btnNext))
       {
       if(current==0)
       {
           StartTime=System.currentTimeMillis();
       }
       else
       {
           check();
       }
       current++;
       setnext();
       }
        if(e.getSource()==btnPrev)
       {
         new questions();
        dispose();
       }
    
        if(e.getSource().equals(btnSave))
        {
            try{
           EndTime = System.currentTimeMillis(); //stores time when user ends test
                EndTime-=StartTime; //stores time taken by user to give test in milliseconds
                EndTime/=1000; //stores time taken by user to give test in seconds
                if(EndTime>=60) // if time can be expressed in minutes or hours
                {
                    seconds = EndTime%60; //calculating seconds
                    EndTime/=60; //calculating minutes
                    flag=1;
                    if(EndTime>=60) //if time can be expressed in hours
                    {
                        flag=2;
                        minutes=EndTime%60; //calculating minutes
                        EndTime/=60; //calculating hours
                    }
                }
                current++;
                check();
                   
                 //checks user's responses against correct responses stored in database                
                if(flag==0)
                 a = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" seconds\nYour Score is: "+count+"\nDo you want to see corrct answer ?");  
                else if(flag==1)
                 a = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" minutes "+seconds+" seconds\nYour Score is: "+count+" \nDo you want to see corrct answer ?");     
                else
                 a = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" hours "+minutes+" minutes "+seconds+" seconds\nYour Score is: "+count+"\nDo you want to see corrct answer?");     
                //displays total score and percentage
                if(a==JOptionPane.YES_OPTION) {//checks if user wants to see answer key or not
                    check();
                } else
                {
                    System.exit(0);  //closes interface and exits
                }          
            
            }
        catch(Exception ex)
        {
            System.out.println("actionPerformed"+ex);
        }
       }
    }
}
