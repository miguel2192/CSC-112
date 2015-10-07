/*********************************************************************************
//    Miguel A Rodriguez
//    PostfixTester.java
//    
//    This program creates and computes number stack and outputs the final result.
// 
//
//********************************************************************************/



import java.util.Scanner;

/**
 * Demonstrates the use of a stack to evaluate postfix expressions.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class PostfixTester2
//-------------------------------------
// To Compile:  javac PostfixTester.java
//-------------------------------------    
{
    /**
     * Reads and evaluates multiple postfix expressions.
     */
    public static void main(String[] args)
    {
        String expression, again;
        int result;
    
        Scanner in = new Scanner(System.in);
      
        do
        {  
            PostfixEvaluator2 evaluator = new PostfixEvaluator2();
            System.out.println("Enter a valid post-fix expression one token " +
                "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
            System.out.println("Each token must be an integer or an operator (+,-,*,/)");
            expression = in.nextLine();

            result = evaluator.evaluate(expression);
            System.out.println();
            System.out.println("That expression equals " + result);

            System.out.print("Evaluate another expression [Y/N]? ");
            again = in.nextLine();
            System.out.println();
        }
        while (again.equalsIgnoreCase("y"));
   }
}
/*----jGRASP exec: java PostfixTester2
 
 Enter a valid post-fix expression one token at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)
 Each token must be an integer or an operator (+,-,*,/)
 5 4 + 3 2 1 - + *
 
 That expression equals 36
 Evaluate another expression [Y/N]? Y
 
 Enter a valid post-fix expression one token at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)
 Each token must be an integer or an operator (+,-,*,/)
   70  14  4  5  15  3  /  *  -  -  /  6  + 
 Expanding stack capacity
 
 
 That expression equals 8
 Evaluate another expression [Y/N]? y
 
 Enter a valid post-fix expression one token at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)
 Each token must be an integer or an operator (+,-,*,/)
 6 7 8 + 23 * 1 2 - + *
 
 That expression equals 2064
 Evaluate another expression [Y/N]? n
 
 
  ----jGRASP: operation complete.*/
