//********************************************************************************************
//  Palindrome.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 10/31/2015
//  Course: CSC 112-001
//  Description:
//           Creates a system using a stack and a queue to test whether a
//           given string is a palindrome.
//  
//*********************************************************************************************
//
//   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      Palindrome
//          ***********************************************************************************
//Variables&Objects: 
//            -message:   String
//            -again:     String
//            -string:    String
//            -letter:    String 
//            -letter2:   String
//            -scan:      Scanner
//            -result:    Character
//            -result2:   Character
//          ************************************************************************************
//Methods:
//            +main(args: String[] :void 
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//              Create Scanner object, String and Character variables
//              Create a Queue and a Stack, as an array or linked list
///             Ask for and enter a message.
//              Place the message into a queue and a stack
//              Initialize a count = 0
//              Remove the characters in the message from the queue and the stack, 
///             When complete, compare the count to the length of the message.
//              If they are the same, the message is a palindrome.
//              If not the message is not a palindrome.
//              Repeat if the user wishes to do so 
//         
//**********************************************************************************************
// Pseudocode 
// 1. Read a string
// 2. Place the message into a queue and a stack
// 3. Remove the characters in the message from the queue and the stack
// 4. compare results and prints out accordingly: whether is a palindrome or not
// 5. Allows the user to continue
//**********************************************************************************************

import java.util.*;
import javax.swing.*;
import jsjf.LinkedStack;
import jsjf.*;


public class Palindrome
{
  public static void main(String[] args)
   {

   String message, again="", string, letter="", letter2=""; //string variables
   char result, result2;//character variables
   
 
   do //creates repetition
   { 

   //Creates Scanner object, String and Character variables//done
   CircularArrayQueue<Character> queue = new CircularArrayQueue<Character>();
   LinkedStack<Character> stack = new LinkedStack<Character>(); 
   
  
   string = JOptionPane.showInputDialog("Please enter a string: ");//ask for to enter a message

    Scanner scan = new Scanner(string);//creates scanner object and reads the string
       
     while (scan.hasNext()) //scans while there are available characters 
      {
       message = scan.next();
         for (int i = 0; i < message.length(); i++)//Place the message into a queue and a stack
          { 
           stack.push(message.charAt(i)); //puts the character on the stack
           queue.enqueue(message.charAt(i));//puts the character on the queue
          }//ends for loop

         for (int i = 0; i < message.length(); i++)//Remove the characters in the message from the queue and the stack
            { 
            result = stack.pop(); // takes the character off stack 
            letter = letter + result;

            result2 = queue.dequeue(); //takes the chracter off the queue
            letter2 = letter2 + result2;

            }//ends for loop

            if (letter.equals(letter2)) //compare results and prints out accordingly
               JOptionPane.showMessageDialog(null,"The string is a palendrome!");

            else
               JOptionPane.showMessageDialog(null,"The string is not a palendrome!");

       } //ends while 

         again = JOptionPane.showInputDialog("Enter 'Y' to continue or you may enter another character to exit: ");
    } while (again.equalsIgnoreCase("y"));//ends do while
    
    JOptionPane.showMessageDialog(null,"Thank you!");//a thank you message

  } //ends main
} //ends class
