/* Information
 Name of program:L NameStackTester.java
 Author: Miguel Rodriguez
 Date: 9/24/15
 Description: Test functions found in ArrayStck.java class*/
 


/*LAB FOR CHAPTER 12

Test these three methods with a program which will:
        1.  import statements
        2.  Create an ArrayStack of strings called nameStack and a Scanner object called in.
        3.  Check to see if nameStack is empty.
        4.  Ask for the number, n, of your friends to be added to the stack.
        5.  Enter the full names of n friends into nameStack using a while or for loop.
        6.  Display the size of nameStack.
        7.  Display nameStack.
        8.  Peek the stack and display the entry that was peeked and the size of the stack.
        9.  Pop 2 names off the stack and display them.
        10. Check to see if nameStack is empty.
        11. Display the size of nameStack.
        12. Display nameStack.
        13. Repeat (y/n)?     */
        
//    import statements

import java.util.*;
import jsjf.*;

public class NameStackTester
{
 
  public static void main(String[] args)
  {
    //variables
    int n;
    String name;
    String Another = "y";
    
 do
 {
  
    Scanner in = new Scanner(System.in);
    //2.  Create an ArrayStack of strings called nameStack and a Scanner object called in.
    
    ArrayStack<String>nameStack = new ArrayStack<String>();
    
    // 3.  Check to see if nameStack is empty.
    if(nameStack.isEmpty()) 
        System.out.println("Stack is Empty");
    else 
       System.out.println("Stack is NOT empty");
   //4.  Ask for the number, n, of your friends to be added to the stack.
    
   System.out.println("How many friends do you want to go onto the stack? ");
   n = Integer.parseInt(in.nextLine());
  
   // 5.  Enter the full names of n friends into nameStack using a while or for loop.
   
   for (int i=0;i<n; i++)
   {
     System.out.println("Enter friend " + (i+1) + ": ");
     name = in.nextLine();
     nameStack.push(name);
   }
   
   // 6.  Display the size of nameStack.
 
   System.out.println("The size of the stack is now " + nameStack.size());
   
   //   7.  Display nameStack.
   
   System.out.println("\nStack contents\n");
   System.out.println(nameStack);
   
   //   8.  Peek the stack and display the entry that was peeked and the size of the stack.
   name = nameStack.peek();
   System.out.println("\n Peeked and found " + name);
   System.out.println("The size of the stack is now" + nameStack.size());
   
   //   9.  Pop 2 names off the stack and display them.
   
   name = nameStack.pop();
   System.out.println("\n Peeked and found " + name);
   name = nameStack.pop();
   System.out.println("\n Peeked and found " + name);
   
   // 10. Check to see if nameStack is empty.
    if(nameStack.isEmpty()) 
        System.out.println("Stack is Empty");
    else 
       System.out.println("Stack is NOT empty");
       
   // 11. Display the size of nameStack.
     
   System.out.println("The size of the stack is now " + nameStack.size());
   
   // 12. Display nameStack.
   
   System.out.println("\nStack contents\n");
   System.out.println(nameStack);
     

   //. Repeat (y/n)? 
   System.out.println("\nContinue (y/n)? ");
   Another = in.next();
    }
   while (Another.equalsIgnoreCase("y"));
 }
} 
   
   
   
   
   




    
   

   
   
   
     
   
   
   
   
  
  
  
