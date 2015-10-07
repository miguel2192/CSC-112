//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of the name, address and phone numbers.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           abstract class      
//          ***********************************************************************************     
//Class:      StaffMember
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel 
//            address
//            name
//            phone
//          ************************************************************************************
//Methods:
//            #name: String
//            #address: String
//            #phone: String
//            +toString(): String
//            +pay(): double
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) computes name, address and phone
//                  2) output each name, address and phone
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          read many classes
//          output the data
//*******************************************************************************
abstract public class StaffMember
{
	protected String	address;
	protected String	name;
	protected String	phone;


	public StaffMember(String eName, String eAddress, String ePhone)
	{
		this.name = eName;
		this.address = eAddress;
		this.phone = ePhone;
	}
	
	public String toString()
	{
		String result = "Name: " + this.name + "\n";

		result += "Address: " + this.address + "\n";
		result += "Phone: " + this.phone;

		return result;
	}

	public abstract double pay();
	public abstract int vacation();
}
