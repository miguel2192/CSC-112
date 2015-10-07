//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of name, address, social security and phone numbers for the employees.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           child class       
//          ***********************************************************************************     
//Class:      Employee
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            #socialSecurityNumber: String
//            #payRate: double
//            +toString(): String
//            +pay(): double
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) creates a constuctor
//                  2) assigns pay and vacation to employee
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          creates a constructor 
//          assigns pay and vacation to employee
//*******************************************************************************
public class Employee extends StaffMember
{
	protected double	payRate;
	protected String	socialSecurityNumber;

	
	public Employee(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone);

		this.socialSecurityNumber = socSecNumber;
		this.payRate = rate;
	}


	public double pay()
	{
		return this.payRate;
	}

	
	public String toString()
	{
		String result = super.toString();

		result += "\nSocial Security Number: " + this.socialSecurityNumber;

		return result;
	}

	
	public int vacation()
	{
		return 3;
	}
}
