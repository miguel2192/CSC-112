//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of all the records for executive.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           child class        
//          ***********************************************************************************     
//Class:      Executive
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            -bonus: double
//            +awardBonus(execBonus: double): void
//            +pay(): double
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) assigns pay and vacation to executive
//                  2) creates a constructor
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          creates a constructor
//          assigns pay and vacation
//*******************************************************************************
public class Executive extends Employee
{
	private double	bonus;

	public Executive(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);

		this.bonus = 0;
	}


	public void awardBonus(double execBonus)
	{
		this.bonus += execBonus;		
	}

	

	public double pay()
	{
		final double payment = super.pay() + this.bonus;

		this.bonus = 0;

		return payment;
	}

	public int vacation()
	{
		return 4;
	}
}
