//******************************************************************************
//  Codes2.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 10/20/2015
//  Course: CSC 112-001
//  Description:
//         Asks the user to enter a message, asks the user to enter a key length,
//         user enter each key index manually, the program encodes and decodes the 
//         message, using queues.
//
//  
//******************************************************************************

/*Change Codes.java so that it:
        1.  Asks for the key array to be entered manually.
        2.  Asks for the message to be encoded to be manually entered.
        3.  Uses our LinkedQueue class instead of the LinkedList class from the Java API.*/
package jsjf;
import java.util.*;
import jsjf.*;
import jsjf.QueueADT;

public class Codes2
{
    /**
     * Encode and decode a message using a key of values stored in
     * a queue.
     */
    public static void main(String[] args)
    { 
      Scanner in = new Scanner(System.in);
      String Another;
      do
      {
          int[] key ={};
          int keysize;
          Integer keyValue;
          String encoded = "", decoded = "", message="";
        
          System.out.println("Please enter the message that you wish to encrypt: ");
		    message = in.nextLine();
          System.out.println("Please enter the length of the key that you wish to use");
		    keysize = in.nextInt();
          key = new int[keysize];
          for (int index = 0; index < keysize; index++)
			 {
				System.out.println("Please enter key index " + (index + 1)
						+ ": ");
				key[index] = in.nextInt();
			 }
         
          /*String message = "All programmers are playwrights and all " +
                     "computers are lousy actors.";*/
        
          System.out.println("\nOriginal Message: \n" + message + "\n");
                     
          LinkedQueue<Integer> encodingQueue = new LinkedQueue<Integer>();
		    LinkedQueue<Integer> decodingQueue = new LinkedQueue<Integer>();
        
          // load key queues 
          for (int scan = 0; scan < key.length; scan++)
          {
             encodingQueue.enqueue(key[scan]);
             decodingQueue.enqueue(key[scan]);
		    }
    
          // encode message 
          for (int scan = 0; scan < message.length(); scan++)
          {
             keyValue = encodingQueue.dequeue();
             encoded += (char) (message.charAt(scan) + keyValue);
             encodingQueue.enqueue(keyValue);
          }
    
          System.out.println ("Encoded Message:\n" + encoded + "\n");
    
          // decode message 
          for (int scan = 0; scan < encoded.length(); scan++)
          {
             keyValue = decodingQueue.dequeue();
             decoded += (char) (encoded.charAt(scan) - keyValue);
             decodingQueue.enqueue(keyValue);
          }
    
          System.out.println ("Decoded Message:\n" + decoded);
          System.out.println();
          in = new Scanner(System.in);//clears the scanner buffer
          System.out.println("Please enter 'y' to run again, or any other character to exit: ");
          Another = in.nextLine();
        
       }
       while(Another.equalsIgnoreCase("Y"));
   
       System.out.println("Thank you!");
    }
}
/*  ----jGRASP exec: java jsjf.Codes2
 
 Please enter the message that you wish to encrypt: 
 My name is Miguel
 Please enter the length of the key that you wish to use
 5
 Please enter key index 1: 
 34
 Please enter key index 2: 
 23
 Please enter key index 3: 
 233
 Please enter key index 4: 
 344
 Please enter key index 5: 
 32
 
 Original Message: 
 My name is Miguel
 
 Encoded Message:
 o?????|???BdŒ????
 
 Decoded Message:
 My name is Miguel
 
 Please enter 'y' to run again, or any other character to exit: 
 y
 Please enter the message that you wish to encrypt: 
 My name is Lawrence
 Please enter the length of the key that you wish to use
 5
 Please enter key index 1: 
 34
 Please enter key index 2: 
 36
 Please enter key index 3: 
 67
 Please enter key index 4: 
 54
 Please enter key index 5: 
 2
 
 Original Message: 
 My name is Lawrence
 
 Encoded Message:
 o?c¤c??c?uBp¤­t??¦?
 
 Decoded Message:
 My name is Lawrence
 
 Please enter 'y' to run again, or any other character to exit: 
 h
 Thank you!
 
  ----jGRASP: operation complete.*/
