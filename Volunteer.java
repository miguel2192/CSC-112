//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of the name, address and phone number of volunteer.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           child class       
//          ***********************************************************************************     
//Class:      Volunteer
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            +pay(): double
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) extends StaffMember
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          creates a constructor
//          assigns vacations and pay for volunteer
//*******************************************************************************
public class Volunteer extends StaffMember
{
	
	public Volunteer(String eName, String eAddress, String ePhone)
	{
		super(eName, eAddress, ePhone);
	}

	
	
	public double pay()
	{
		return 0.0;
	}

	
	public int vacation()
	{
		return 0;
	}
}
