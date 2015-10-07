//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Keeps track of all the records for the hourly workers.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Child class       
//          ***********************************************************************************     
//Class:      Hourly
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            -hoursWorked: int
//            +addHours(moreHours: int): void
//            +pay():double
//            +toString(): String
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) assigns pay and vacation to hourly employee
//                  2) creates a constructor
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          read many classes
//          output the data
//*******************************************************************************
public class Hourly extends Employee
{

	private int				hoursWorked;

	private final double	overtimeRate;
	private int				overtimeWorked;

	public Hourly(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate)
	{
		this(eName, eAddress, ePhone, socSecNumber, rate, rate * 1.5);
	}

	
	public Hourly(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double overtimeRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.overtimeRate = overtimeRate;
		this.overtimeWorked = 0;
		this.hoursWorked = 0;
	}

	
	public void addHours(int moreHours)
	{
		this.hoursWorked += moreHours;
	}

	
	public void addOvertime(int hours)
	{
		this.overtimeWorked += hours;
	}

	
	public double pay()
	{
		final double payment = (this.payRate * this.hoursWorked)
				+ (this.overtimeRate * this.overtimeWorked);
		this.hoursWorked = 0;
		this.overtimeWorked = 0;
		return payment;
	}

	

	public String toString()
	{
		String result = super.toString();

		result += "\nCurrent hours: " + this.hoursWorked;

		return result;
	}

	

	public int vacation()
	{
		return 2;
	}
}
