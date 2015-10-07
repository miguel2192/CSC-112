//******************************************************************************
//  Firm.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 9/8/2015
//  Course: CSC 112-001
//  Description:
//           Creates many different arrays and keeps track of all the staff.
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Helper class        
//          ***********************************************************************************     
//Class:      Staff
//          ***********************************************************************************
//Variables&Objects: 
//            Personnel                
//          ************************************************************************************
//Methods:
//            -StaffList: StaffMember[]
//            +Payday: void
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                  1) creates many different arrays for the staff memebers
//                  2) return the payday to firm
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
//          create many different arrays for the staff 
//          outputs the payday data
//*******************************************************************************
public class Staff
{
	private final StaffMember[]	staffList;
   //-----------------------------------------------------------------
   //  Constructor: Sets up the list of staff members.
   //-----------------------------------------------------------------

	public Staff()
	{
		this.staffList = new StaffMember[7];

		this.staffList[0] = new Executive("Tony", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07);

      this.staffList[1] = new Employee("Paulie", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15);
      this.staffList[2] = new Employee("Vito", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23);

      this.staffList[3] = new Hourly("Michael", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55);

      this.staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.",
         "555-8374");
      this.staffList[5] = new Volunteer("Benny", "321 Dud Lane",
         "555-7282");
      this.staffList[6] = new Hourly("Miguel", "2096 main St.",
         "551-0690", "958-67-5678", 11.55);

		((Executive) this.staffList[0]).awardBonus(500.00);

		((Hourly) this.staffList[3]).addHours(40);
      ((Hourly)staffList[6]).addHours(70);
	}

	 //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------
	public void payday()
	{
		double amount;
		int vacation;

		for ( StaffMember element : this.staffList)
		{
			System.out.println(element.toString());

			amount = element.pay();  // polymorphic
			vacation = element.vacation();

			if (vacation > 0)
			{
				System.out.println( vacation + " week(s) of vaction(s) currently available");
			}

			if (amount == 0.0)
			{
				System.out.println("Thanks!");
			}
			else
			{
				System.out.println("Paid: " + amount);
			}

			System.out.println("-----------------------------------");
		}
	}
}
