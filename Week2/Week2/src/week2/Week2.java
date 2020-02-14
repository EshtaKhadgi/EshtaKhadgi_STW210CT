/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author Eshta Shahi
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str, rev = "";
	      Scanner sac = new Scanner(System.in);
	 
	      System.out.println("Please enter a string:");
	      str = sac.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
    }
    
}
