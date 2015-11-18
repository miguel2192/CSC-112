//Author: Miguel A Rodriguez



import java.util.*;

public class factorial2
{
 public static void main (String[] args)
 {
 
 Scanner scan = new Scanner(System.in);
 String another="";

 do
 {
 System.out.println("Please enter a number: ");
 long n = scan.nextLong();
 long result = Factorial(n);
    System.out.println("The factorial of " + n + " is " + result);
    
    System.out.println("Continue <y or n>:?");
     another=scan.next();
    
 }while(another.equalsIgnoreCase("y"));
 
 }
 //method
 public static long Factorial (long n)
{
  //baser case
  
  if(n==1)
       return 1;
  
  else
   //recursive call
  
  return n*Factorial(n-1);
  // return n+Factorial((n+1)/2);
   
   }
 
 }
 

