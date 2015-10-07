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
public class Firm
{
	public static void main(String[] args)
	{
		final Staff personnel = new Staff();

		personnel.payday();
	}
}
/*  ----jGRASP exec: java Firm
 
 Name: Tony
 Address: 123 Main Line
 Phone: 555-0469
 Social Security Number: 123-45-6789
 3 week(s) of vaction(s) currently available
 Paid: 2923.07
 -----------------------------------
 Name: Paulie
 Address: 456 Off Line
 Phone: 555-0101
 Social Security Number: 987-65-4321
 2 week(s) of vaction(s) currently available
 Paid: 1246.15
 -----------------------------------
 Name: Vito
 Address: 789 Off Rocker
 Phone: 555-0000
 Social Security Number: 010-20-3040
 2 week(s) of vaction(s) currently available
 Paid: 1169.23
 -----------------------------------
 Name: Michael
 Address: 678 Fifth Ave.
 Phone: 555-0690
 Social Security Number: 958-47-3625
 Current hours: 40
 1 week(s) of vaction(s) currently available
 Paid: 422.0
 -----------------------------------
 Name: Adrianna
 Address: 987 Babe Blvd.
 Phone: 555-8374
 Thanks!
 -----------------------------------
 Name: Benny
 Address: 321 Dud Lane
 Phone: 555-7282
 Thanks!
 -----------------------------------
 Name: Miguel
 Address: 2096 main St.
 Phone: 551-0690
 Social Security Number: 958-67-5678
 Current hours: 70
 1 week(s) of vaction(s) currently available
 Paid: 808.5
 -----------------------------------
 
  ----jGRASP: operation complete.*/
 
