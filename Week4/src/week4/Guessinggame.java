/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
    
	public static void main(String[] args) {
		Random ran = new Random();
	    Scanner reader = new Scanner(System.in);
	    
	    String higher = "higher", lower = "lower", correct = "correct", input;
	    int guess, random, random2 = 1, random3 = 100, randomLast, cntr = 1;
	    int lowerBound = 0;
	    int upperBound = 20000;
	    random = ran.nextInt(upperBound - lowerBound + 1) + lowerBound;
	    randomLast = random;
	    System.out.println("Enter your number: " + random);
	    System.out.println("Input if number is higher, lower, or correct: ");
	    input = reader.next();
	    
	    while (!input.equals("correct")){
	        if (input.equals("lower")){
	            randomLast = random2;
	            random2 = ran.nextInt(100) + 1;
	            if ((random2 < random) && (random2 < randomLast))
	            {
	            random = random2;
	            cntr += 1;
	            System.out.println("Enter your number: " + random);
	            System.out.println("Input if the number is higher, lower, or correct: ");
	            input = reader.next();
	            } else 
	            {
	                input = lower;
	            }
	        } else if (input.equals("higher")){
	            randomLast = random3;
	            random3 = ran.nextInt(100) + 1;
	            if ((random3 > random) && (random3 > randomLast)){
	            random = random3;
	            cntr += 1;
	            System.out.println("Enter your number: " + random);
	            System.out.println("Input if the number is higher, lower, or correct: ");
	            input = reader.next();
	            } else {
	                input = higher;
	            }
	        }

	    }

	    System.out.println("Computer took " + cntr + " inputs of tries to guess your number");

		            
		        }

		    
		    

	}

