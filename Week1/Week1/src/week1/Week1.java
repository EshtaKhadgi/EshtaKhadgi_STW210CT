/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author Eshta Shahi
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");
		 
		 Scanner rev = new Scanner(System.in);
	        String str = rev.nextLine();
	        
	        StringBuilder strb = new StringBuilder(str);
	        
	        System.out.println(strb.reverse().toString());
    }
    
}
