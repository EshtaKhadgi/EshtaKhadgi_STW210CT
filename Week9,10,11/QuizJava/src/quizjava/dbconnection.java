package quizjava;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbconnection {
	public Connection conc;
    PreparedStatement pstmt;
    ResultSet rs=null;
    
      public dbconnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conc=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
      public void  resigtration(String Firstname,String Lastname,String Username,String Password,String Confirm,String Address,String Email)
      {
        try {
            pstmt=conc.prepareStatement("INSERT INTO `resigtration`( `Firstname`, `Lastname`, `Username`, `Password`, `Confirm`, `Address`, `Email`) VALUES (?,?,?,?,?,?,?)");
           //Specifying the values of it's parameter
            pstmt.setString(1,Firstname);
            pstmt.setString(2,Lastname);
            pstmt.setString(3,Username);
            pstmt.setString(4,Password);
            pstmt.setString(5,Confirm);
            pstmt.setString(6,Address);
            pstmt.setString(7,Email);
         
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password did not match!! Please Try Again");
                }
        } 
        catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
     
     }

       public void computer(String QuestionNo, String Question,String OptionA,String OptionB,String OptionC,String OptionD,String Answer)
       {
        
       try {
            pstmt=conc.prepareStatement("INSERT INTO `computer`(`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES (?,?,?,?,?,?,?)");
            pstmt.setString(1,QuestionNo);
            pstmt.setString(2,Question);
            pstmt.setString(3,OptionA);
            pstmt.setString(4,OptionB);
            pstmt.setString(5,OptionC);
            pstmt.setString(6,OptionD);
            pstmt.setString(7,Answer);
              
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"NewQuestionAdded");
                  
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
        } 
       catch (Exception e)
        {
            System.out.println("Error: "+e);
        }
     }

    public void effectivecommunication(String QuestionNo, String Question,String OptionA,String OptionB,String OptionC,String OptionD,String Answer)
    {
        try 
        {
            pstmt=conc.prepareStatement("INSERT INTO `effectivecommunication`(`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES (?,?,?,?,?,?,?)");
            pstmt.setString(1,QuestionNo);
            pstmt.setString(2,Question);
            pstmt.setString(3,OptionA);
            pstmt.setString(4,OptionB);
            pstmt.setString(5,OptionC);
            pstmt.setString(6,OptionD);
            pstmt.setString(7,Answer);
              
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"NewQuestionAdded");
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
        } 
        catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
    }

    public void english(String QuestionNo, String Question,String OptionA,String OptionB,String OptionC,String OptionD,String Answer)

    {
        try 
        {
            pstmt=conc.prepareStatement("INSERT INTO `english`(`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES (?,?,?,?,?,?,?)"); 
            pstmt.setString(1,QuestionNo);
            pstmt.setString(2,Question);
            pstmt.setString(3,OptionA);
            pstmt.setString(4,OptionB);
            pstmt.setString(5,OptionC);
            pstmt.setString(6,OptionD);
            pstmt.setString(7,Answer);
            
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"NewQuestionAdded");
                  
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }

 public void maths(String QuestionNo, String Question,String OptionA,String OptionB,String OptionC,String OptionD,String Answer)
       {
        
       try {
            pstmt=conc.prepareStatement("INSERT INTO `maths`(`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES (?,?,?,?,?,?,?)");
            pstmt.setString(1,QuestionNo);
            pstmt.setString(2,Question);
            pstmt.setString(3,OptionA);
            pstmt.setString(4,OptionB);
            pstmt.setString(5,OptionC);
            pstmt.setString(6,OptionD);
            pstmt.setString(7,Answer);
              
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"NewQuestionAdded");
                  
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
        } 
       catch (Exception e)
        {
            System.out.println("Error: "+e);
        }
     }

    
}
