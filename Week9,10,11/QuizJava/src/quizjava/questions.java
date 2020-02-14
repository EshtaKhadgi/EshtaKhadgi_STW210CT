package quizjava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class questions extends JFrame implements ActionListener {
	JComboBox cmbsubject;
    JButton btnQuiz;
    public questions() 
    {
        btnQuiz = new JButton("Enter Quiz");
        cmbsubject=new JComboBox();
        cmbsubject.addItem("English");
        cmbsubject.addItem("Maths");
        cmbsubject.addItem("Effective Communication");
        cmbsubject.addItem("Computer");
       
        setTitle("Student Examination Form");
        Container c=getContentPane();
        c.setLayout(null);
        setSize(350,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        cmbsubject.setBounds(100,100,100,30);
        btnQuiz.setBounds(100,250,100,30);
        c.add(cmbsubject);c.add(btnQuiz);
        
        btnQuiz.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       
           if(e.getSource().equals(btnQuiz) && cmbsubject.getSelectedItem().equals("Effective Communication"))
           {
           new effectivecommunication();
           dispose();
           }
           
           if(e.getSource().equals(btnQuiz) && cmbsubject.getSelectedItem().equals("Maths"))
           {
           new maths();
           dispose();
           }
           
           if(e.getSource().equals(btnQuiz) && cmbsubject.getSelectedItem().equals("Computer"))
           {
           new computer();
           dispose();
           }
           
           if(e.getSource().equals(btnQuiz) && cmbsubject.getSelectedItem().equals("English"))
           {
           new english();
           dispose();
           }
    }
}
