//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of many different records for many different staff members
//           and displays the records respectively.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      Firm
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            +main(args: String[] :void 
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) read the many different records for each of the classes
//                  2) output each record
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          read many classes
//          output the data
//*******************************************************************************

import java.util.Scanner;

public class CreatingExceptions
{

   //-----------------------------------------------------------------
   //  Creates an exception object and possibly throws it.
   //-----------------------------------------------------------------
   public static void main (String[] args) 
   {
      final int MAX = 20;

      Scanner scan = new Scanner (System.in);
   while(true)
   {
      StringTooLongException problem =
         new StringTooLongException ("Input value is out of range.");

      System.out.print ("Enter a string with the maximum value of " + MAX + " characters: ");
      String value = scan.nextLine();

     try{
      //  Determine if the exception should be thrown
      if (value.length() >= MAX)
         throw problem;
      }
  catch(StringTooLongException problem1)
        {
         System.out.println("Your string is too long.");
        }
        
        System.out.println("Do you want to quit? (y/n) ");
        String response = scan.nextLine();
        if(response.equals("y")) break;
        
      }//end while
     
   }
}
