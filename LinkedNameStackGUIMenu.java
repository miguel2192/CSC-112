//******************************************************************************
//   LinkedNameStack.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 10/6/2015
//  Course: CSC 112-001
//  Description:
//         Creates an Link array named nameStack and provides with a menu for 
//         with different options such us push, pop, peek, isempty, exit etc.
//
//  
//******************************************************************************
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      SLinkedNameStack
//          ***********************************************************************************
//Variables&Objects: 
//            +name String
//            +n    int
//          ************************************************************************************
//Methods:
//            +main(args: String[] :void 
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                     1) creates an array named nameStack of data type LinkedStack
//                     2) provides menu with different options 
//                     3) uses a do while loop to create repetition
//                     4) Displays information based on what the user chooses
//                     5) Quitt the application if the user types exit
//  **********************************************************************************************            
/*LAB FOR CHAPTER 12
8.  HW
    a)  Read Chapter 13, p. 519-543
    b)  PP 13.1 on p. 515:  Complete the LinkedStack class adding methods: peek, isEmpty, size and toString.
    c)  Test these methods with a program based on HW e from Chapter 12 which will:
        1.  Create a class called LinkedNameStack.java by: 
            a)  renaming NameStack.java from HW e in Chapter 12 and save it with the new name, LinkedNameStack.java.
            b)  change // 2 to the LinkedStack instead of the ArrayStack.
            c)  Move LinkedStack.java and LinearNode.java into the jsjf folder.
            d)  Run LinkedNameStack, making sure it works.
            e)  Place it in its dropbox with sample a run at the end of the program. (10/1/15)(done)/////////////////////////////////  
            
                   
        2.  Create a menu based version of LinkedNameStack, called LinkedNameStackMenu, having the following options:
            a)  push
            b)  peek
            c)  pop
            d)  list
            e)  size
            f)  isEmpty
            g)  test this and hand it in its dropbox (10/6/15)//done
            
            
        3.  Convert LinkedNameStackMenu.java to LinkedNameStackGUIMenu.java using Dialogue Boxes:
            a) CSC 111, Chapter 6 - Conditionals & Loops and Power Point Slides
            b) #6.  Dialog Boxes
                     a)  Some dialog box methods from JOptionPane 
                     b)  Example of multiple dialog boxes main method:  Listing 6.9 - EvenOdd.java - p. 292   
            c)  test it and place in its dropbox with full documentation according to the ruberic below.  
        4.  Grading ruberic.
            a)  5%  Information at top of the listing: Name of Class, Name of Author, Description
            b)  5%  UML Diagram
            c) 10%  Program Logic or pseudocode
            d) 10%  Comments throughout the class listing
            e) 10%  Sample Output at the end of the listing
            f) 60%  Working program  (10/9/15)  */

import java.util.*;
import jsjf.*;
import javax.swing.*;

public class LinkedNameStackGUIMenu
{
 
  public static void main(String[] args)
  {
    //variables
    int n;
    String name = "";
       
   Scanner in = new Scanner(System.in);
            
   String LinkedNameStackMenu;  
   LinkedStack<String> nameStack = new LinkedStack<String>();

      //4.  Ask for the number, n, of your friends to be added to the stack.
          
 do
 {         //Creates a menu, provides the user with many different options
           LinkedNameStackMenu = JOptionPane.showInputDialog("Please select one from the following options, type the name of your choice: \"push\", \"peek\",\"pop\",\"list\",\"size\",\"isempty\" and \"exit\" : ");
          
         
    switch (LinkedNameStackMenu.toLowerCase())//switch statement
       {
       case "push":
             
              // 5.  Enter the full names of n friends into nameStack using a while or for loop.
              ;
              n = Integer.parseInt(JOptionPane.showInputDialog("How many friends do you want to go onto the stack? "));
            
           for (int i=0;i<n; i++)
             {
             name = JOptionPane.showInputDialog("Enter friend " + (i+1) + ": ");
               nameStack.push(name);             
             }
             break;
       case "peek":
                //   8.  Peek the stack and display the entry that was peeked and the size of the stack.
               name = nameStack.peek();
               JOptionPane.showMessageDialog(null,"\n Peeked and found " + name);
               System.out.println("The size of the stack is now " + nameStack.size());
               break;
       case "pop":
               //   9.  Pop 2 names off the stack and display them.
               name = nameStack.pop();
              JOptionPane.showMessageDialog(null,"\n Peeked and found " + name);
               break;
       case "list":
               // 12. Display nameStack.//not working properly
               JOptionPane.showMessageDialog(null,"\nStack contents\n "+ "\n " +nameStack.toString() );
               break;
       case "size":
               // 6.  Display the size of nameStack.
              JOptionPane.showMessageDialog(null,"The size of the stack is now " + nameStack.size());
               break;
       case "isempty":
               // 3.  Check to see if nameStack is empty.
               if(nameStack.isEmpty()) 
                  JOptionPane.showMessageDialog(null,"Stack is Empty");
               else 
                 JOptionPane.showMessageDialog(null,"Stack is NOT empty");
               break;
       case "exit":
               System.exit(0);
               break;
     }//end switch
  
    } //end of do while loop
   while (true);//creates repetition
   }
} 
/*-jGRASP: process ended by user.
 
  ----jGRASP exec: java LinkedNameStack
 
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 push
 How many friends do you want to go onto the stack? 
 3
 Enter friend 1: 
 Bob Arsenal
 Enter friend 2: 
 Jeannie Wightman
 Enter friend 3: 
 Miguel Rodriguez
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 list
 
 Stack contents
 
 Miguel Rodriguez
 Jeannie Wightman
 Bob Arsenal
 
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 peek
 
  Peeked and found Miguel Rodriguez
 The size of the stack is now 3
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 pop
 
  Peeked and found Miguel Rodriguez
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 list
 
 Stack contents
 
 Jeannie Wightman
 Bob Arsenal
 
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 isempty
 Stack is NOT empty
 Please select one from the following options, type the name of your choice: "push", "peek","pop","list","size","isempty" and "exit" : 
 exit
 
  ----jGRASP: operation complete.  */




    
   

   
   
   
     
   
   
   
   
  
  
  
