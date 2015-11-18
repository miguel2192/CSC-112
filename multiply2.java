
//***************************************************
//
//    author: Miguel A Rodriguez
//    date: 11/17/2015
//    Class: CSC-112
//
//***************************************************

import java.util.*;

public class multiply2
{
 public static void main (String[] args)
 {
 
 Scanner scan = new Scanner(System.in);
 String another="";

 do
 {
 
 System.out.println("Please enter a number: ");
 long a = scan.nextLong();
 
 
 System.out.println("Please enter a number another number: ");
 long b = scan.nextLong();
 

 long result = multiply(a,b);

  System.out.println("The Product of " + a +" x "+ b+ " is " + result);
    
    System.out.println("Continue <y or n>:?");
     another=scan.next();
     
     System.out.println("Thanks");
    
 }while(another.equalsIgnoreCase("y"));
 
 }
 //method
 public static long multiply (long a, long b)
{
  //baser case
   if ( b < 0)
   {
     a=a-a-a;
     b=b-b-b;
   }
   if(b==1)
  
       return a;
  
  else
   //recursive zcall
  
  return a+multiply(a,b-1);
  // return n+Factorial((n+1)/2);
   
   }
 
 }
/* ----jGRASP exec: java multiply2
 
 Please enter a number: 
 3
 Please enter a number another number: 
 5
 The Product of 3 x 5 is 15
 Continue <y or n>:?
 y
 Thanks
 Please enter a number: 
 -5
 Please enter a number another number: 
 3
 The Product of -5 x 3 is -15
 Continue <y or n>:?
 y
 Thanks
 Please enter a number: 
 -5
 Please enter a number another number: 
 -5
 The Product of -5 x -5 is 25
 Continue <y or n>:?
 y
 Thanks
 Please enter a number: 
 0
 Please enter a number another number: 
 0
 The Product of 0 x 0 is 0
 Continue <y or n>:?
 n
 Thanks
 
  ----jGRASP: operation complete.*/
  


