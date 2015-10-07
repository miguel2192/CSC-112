/* e)  PP 12.2 on p. 515: Read a sentence and display the sentence so that the characters
        of each word are backward.
        1.  Create an ArrayStack of characters called reverseStack.
        2.  Ask for and enter a sentence using a Scanner object called in.
        
        3.  Create another Scanner object called scan to scan the sentence.
        4.  Use an outside while loop which peels each word from the sentence and continues
            as long as there are words in the sentence.  This while loop encompasses steps 5-7.
        5.  Use an inside for loop to push each character in the peeled word onto the stack.
        6.  Use an inside while loop to pop each character off the stack and display it.
        7.  Make sure to skip a space after each word.*/
        
/**************************************************************************
*   Author: Miguel A Rodriguez                                            *   
*   CSC112                                                                *
*   Description: Read a sentence and display the sentence so that the     *
*    characters of each word are backward.                                *
*                                                                         *
*                                                                         *
*                                                                         *
**************************************************************************/

import java.util.Scanner;
import jsjf.ArrayStack;


public class Reverse
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
      
      
		String again = null;
      String word;
      String reversedString;
      
		do
		{
         // 1.  Create an ArrayStack of characters called reverseStack.
			ArrayStack<Character> reverseStack = new ArrayStack<Character>();
         
         //2.  Ask for and enter a sentence using a Scanner object called in.
			System.out.println("PLEASE ENTER A SENTENCE:");
			String input = in.nextLine();
         
         //3.  Create another Scanner object called scan to scan the sentence.
         Scanner scan = new Scanner(input);
         
         //4.  Use an outside while loop which peels each word from the sentence and continues
         //    as long as there are words in the sentence.  This while loop encompasses steps 5-7.
         
        reversedString = "";  //initializes reverString
         
         while (scan.hasNext())
         {
             word = scan.next();
             
         // 5.  Use an inside for loop to push each character in the peeled word onto the stack. 
             for (int i = 0; i < word.length(); i++)
             {
                 
                 reverseStack.push(word.charAt(i));
             }
        
        // 6.  Use an inside while loop to pop each character off the stack and display it.
        
             while(!reverseStack.isEmpty())
			    {
				     reversedString+=reverseStack.pop();
			    }
			    //System.out.println(reversedString);
             reversedString+= " ";
       
        
		//System.out.println("PLEASE ENTER 'Y' TO CONTINUE OR PRESS ANY OTHER KEY TO STOP: ");
			//again = in.nextLine();
            
		   }
         System.out.println(reversedString);
         System.out.println("");
         System.out.println("PLEASE ENTER 'Y' TO CONTINUE OR PRESS ANY OTHER KEY TO STOP: ");
			again = in.nextLine();

        //4.  Use an outside while loop which peels each word from the sentence and continues
        //    as long as there are words in the sentence.  This while loop encompasses steps 5-7.
      }  
		while(again.equalsIgnoreCase("Y"));
		System.out.println("**********HASTA LA VISTA**********");
		in.close();
	}
}
