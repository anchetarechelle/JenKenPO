/*
*input.util.scanner
*random generate the number
*rock is 1, paper is 2, scissor is 3.Player choose a number.
*compare user input and computer choice
*.=  user choice
*allow user to continue or not
*
 */
package LAB;

import java.util.Scanner;
import java.util.Random;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author reche
 */
public class JenKenPo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Random randomNumber = new Random();  
      Scanner keyboard = new Scanner (System.in); 
      
// intergers that represents items
       String number;
       int rock = 1; 
       int paper = 2;
       int scissor = 3;
       
        int rNumber;
        rNumber = randomNumber.nextInt(3);            //a way to generate a random number of int data type
        int guess = 3;                                                     //declare var to hold guess
        String input;
//tell the players rules of the game
System.out.println("Rules of the game: " + " Type 1 for rock, " + " type 2 for paper, " + " type 3 for scissor. ");
       
//prompts the user to get ready
           input = JOptionPane.showInputDialog("Are you ready to play?");
                
//loop
    while(guess <= 5) {  
// ask player to choose a number
    System.out.println("Jen Ken Po!");
       //when the user type in a int
               guess = keyboard.nextInt();
      
       if (guess == rNumber)
           System.out.println(" We got the same " + rNumber + " Aiko desho! ");
       else if (guess != rNumber) 
           input = JOptionPane.showInputDialog("again?");
       else if (guess <= rNumber)
                   System.out.println (" you lose ");
        else if (guess >= rNumber)
                       System.out.println(" rock ");
        else if (guess <= rNumber)
               System.out.println(" scissor ");}
      
               
       
          }     
       }

