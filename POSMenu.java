//******************************************************************************
//   POSMenu2.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 11/16/2015
//  Course: CSC 112-001
//  Description:
//         Creates a list and a menu and the user is able to add, remove, update, list
//         etc the courses.
//
//  
//******************************************************************************
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      POSMenu2
//          ***********************************************************************************
//Variables&Objects: 
//            +another String
//            +again   String
//            +another2 String
//            +resultant String
//            +resultant1 String
//            +resultant4 String
//            +fileName String
//            +storage String
//            +choice    int
//          ************************************************************************************
//Methods:
//            +main(args: String[] :void 
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                     1) creates a menu using lists
//                     2) provides menu with different options 
//                     3) uses a do while loop to create repetition
//                     4) Displays information based on what the user chooses
//                     5) Allows user to add, remove, list, update, load, save etc courses
//                     5) Quitt the application if the user types 10
//  **********************************************************************************************    


/*10. Course Management Project: Chapter 15, Programming Project #17 on p. 616. 

    a)  Modify Course.java to become Course2.java so that it implements the Comparable  
        interface.  Order the courses first by department and then by course number.
        
    b)  Modify ProgramOfStudy.java to become ProgramOfStudy2.java so that it uses
        ArrayOrderedList.java to add, and ArrayList.java to find and remove.
        ProgramOfStudy2.java will continue to support find, replace, size, save and load.
        
    c)  Modify POSTester.java to become POSTester2.java and test all capabilities.
    
    d)  Write a new program, POSMenu, to maintain a list of courses, including:
        1.  Load  10%                       6.  Find  5%
        2.  list   5%                       7.  Size  5%
        3.  Add   10%                       8.  Save 10%
        4.  Remove 5%                       9.  Quit  5%
        5.  Update 5%   
                                   
    e)  Grading Ruberic:  
         5% 1.  Basic version: Introduction - Author, program name, date, description;
        15% 2.  UML Diagrams - POSMenu.java, ProgramOfStudy2.java and Course2.java;  
        10% 3.  Program Logic - POSMenu.java.   
        10% 4.  Sample Output showing testing of all options
        50% 5.  Program works properly (This is split among d1 - d10 above)
        10% 6.  Creativity, includes GUI interface*/


import java.io.*;
import java.util.*;
import java.io. IOException;

public class POSMenu2
{
	/**
	 * Creates and populates a Program of Study. Then saves it using serialization.
	 */
   public static void main(String[] args) throws IOException
   {
      //variables
      String another="", again="",another2="",resultant="", resultant1="", resultant4="",fileName="",storage="";
      int choice = 0;
   
      ProgramOfStudy2 pos = new ProgramOfStudy2();
     
      Scanner scan = new Scanner(System.in);
   
      do
      {
      
         System.out.println("Please choose from the following options: \n" 
               + "Add <1>\n" + "Remove <2>\n" + "List <3>\n"
               + "Load <4>\n" + "Update <5>\n" + "Find <6>\n" + "Select File & save <7>\n" + "Size <8>\n"
               + "Quit <10>\n");
         choice = scan.nextInt();        
        
        switch(choice)
         {
            case 1:  
               do
               {
               
                  int quantity;
                  int loop=0, num;
                  String prefix,name, grade;
             
                  System.out.println("How many courses would you like to add?: ");
                  quantity = scan.nextInt();
               
                  while(quantity>loop)
                  {
                     Scanner in = new Scanner(System.in);
                     Scanner in1 = new Scanner(System.in);
                  
                     System.out.println("Please enter the course prefix: ");
                     prefix = in.nextLine();
                  
                  
                     System.out.println("Please enter the course number: ");
                     num = in.nextInt();
                  
                  
                  
                     System.out.println("Please enter the course name: ");
                     name = in1.nextLine();
                  
                  
                     System.out.println("Please enter the course grade: ");
                     grade = in1.nextLine();
                  //scan.nextLine();
                  
                     Course2 Course = new Course2(prefix, num, name, grade);
                     pos.addCourse(Course);
                  
                     quantity--;
                     //pos.save(Course.toString());	
                     System.out.println();
                  
                  }
               //System.out.println(pos);
               
                  System.out.println("Would you like to continue adding courses<y or N>?: ");
                  another = scan.next();
                  System.out.println();
               
               
               }while(another.equalsIgnoreCase("y"));
            
               break;
              
            case 2://removes
            
               System.out.println("Here are the courses to select from :");
               System.out.println(pos);
            
            
               Scanner finder0 = new Scanner (System.in);
            
               System.out.println("Please enter the prefix of the course you wish to remove: ");
               String prefc0 = finder0.nextLine();
               System.out.println("Please enter the course number of the course you wish to remove: ");
               int numc0 = finder0.nextInt();
                
                
                
               Course2 remove = pos.find(prefc0, numc0);//finds 
               if(remove != null)
               {
                  pos.removeCourse(remove);//removes
                  
                  System.out.println("You have sucessfully removed a course!");
                  System.out.println("Your new Courses are: ");
                  System.out.println(pos);
                  }
               else
                  {
                  System.out.println("Course does not exist");
                  }
              
             
               
               break;
            case 7://lets user choose file and save
                Scanner sca2 = new Scanner(System.in);
                System.out.println("Enter a .txt file name: ");
                fileName = sca2.nextLine();
                
                pos.save(fileName);//saves
                System.out.println("File found & its been saved");
                System.out.println();
                
                break;
         
         
              
            case 3://lists
               System.out.println(pos);
               System.out.println();
            
               break;
            case 4://loads
            
                    try
		                {
		                 pos = pos.load(fileName);
			             }
	          	     catch ( ClassNotFoundException e ) {
                     // TODO handle me
                      }              
                    System.out.println(storage);
                    System.out.println(pos);
                    System.out.println();
                  break;
             case 5://updates
                   
                    Scanner updater = new Scanner (System.in);//scanner object
                    System.out.println("Here are the courses to select from :");
                    System.out.println(pos);
            
            
                    Scanner finder1 = new Scanner (System.in);
            
                    System.out.println("Please enter the prefix of the course you wish to update: ");
                    String prefc1 = finder1.nextLine();
                    System.out.println("Please enter the course number of the course you wish to update: ");
                    int numc1 = finder1.nextInt();
                 
                    String searchResult = pos.find(prefc1, numc1).toString();//finds course
            
                    System.out.println ("Course Found!:\n" + searchResult);
            
                    Scanner in = new Scanner(System.in);
                    Scanner in1 = new Scanner(System.in);
            
                    System.out.println("Please enter the updated course prefix: ");
                    String prefc2 = in.nextLine();
                    System.out.println("Please enter the updated course number: ");
                    int num1 = in.nextInt();
                    System.out.println("Please enter the updated course name: ");
                    String name1 = in1.nextLine();
                    System.out.println("Please enter the updated course grade: ");
                    String grade1 = in1.nextLine();
            
                    Course course10 = new Course(prefc2, num1, name1, grade1);//new course created
            
                    pos.replace(pos.find(prefc1, numc1), new Course2(prefc2, num1, name1, grade1));//replaces
            
                    System.out.println("You have updated a course sucessfully!");
                    System.out.println("Your new courses are: ");
                    System.out.println(pos);//prints courses
                    System.out.println();
                 break;

            case 6://finds
                    Scanner finder = new Scanner(System.in);
                    System.out.println("Please enter the prefix of the course you wish to find: ");
                    String prefc = finder.nextLine();
                    System.out.println("Please enter the course number of the course you wish to find: ");
                    int numc = finder.nextInt();
               
                    resultant = pos.find(prefc ,numc).toString();//finds the course & convert it to a string
               
                    System.out.println("Here is your result: " +"< " + resultant+ " >");
                    System.out.println();
                 break;
            case 8://gets the size
                    System.out.println("Here is the Size: ");
                    System.out.println( pos.getSize());
                    System.out.println();
                 break;
            case 10://quits
                    System.out.println("Thank you!");
                    System.out.println();
                 break;
        
         }//ends switch
         System.out.println("Do you want to enter the main menu<y or n>:? " );//asks user if they wish to continue
         another2 = scan.next();
         scan.nextLine();
      }while(another2.equalsIgnoreCase("y"));//creates repetition
      System.out.println("Good Bye");
     
   }//ends main
}//ends class

/*   ----jGRASP: operation complete.
 
  ----jGRASP exec: java POSMenu2
 
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 1
 How many courses would you like to add?: 
 2
 Please enter the course prefix: 
 HIS
 Please enter the course number: 
 101
 Please enter the course name: 
 Beginning Hitory
 Please enter the course grade: 
 A
 
 Please enter the course prefix: 
 CSC
 Please enter the course number: 
 112
 Please enter the course name: 
 Data Structures
 Please enter the course grade: 
 A
 
 Would you like to continue adding courses<y or N>?: 
 n
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 3
 CSC  112  Data Structures  A  
 HIS  101  Beginning Hitory  A  
 
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 8
 Here is the Size: 
 2
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 6
 Please enter the prefix of the course you wish to find: 
 HIS
 Please enter the course number of the course you wish to find: 
 101
 Here is your result: < HIS  101  Beginning Hitory  A   >
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 5
 Here are the courses to select from :
 CSC  112  Data Structures  A  
 HIS  101  Beginning Hitory  A  
 
 Please enter the prefix of the course you wish to update: 
 HIS
 Please enter the course number of the course you wish to update: 
 101
 Course Found!:
 HIS  101  Beginning Hitory  A  
 Please enter the updated course prefix: 
 HS
 Please enter the updated course number: 
 111
 Please enter the updated course name: 
 Intermidiate History
 Please enter the updated course grade: 
 B
 HIS  101  Beginning Hitory  A  has been removed 
 
 HS  111  Intermidiate History  B  has been added 
 
 You have updated a course sucessfully!
 Your new courses are: 
 CSC  112  Data Structures  A  
 HS  111  Intermidiate History  B  
 
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 7
 Enter a .txt file name: 
 fileName.txt
 File found & its been saved
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 4
 
 File fileName.txt was loaded!
 
 Here are its contents: 
 
 CSC  112  Data Structures
 HS  111  Intermidiate History
 
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 2
 Here are the courses to select from :
 CSC  112  Data Structures
 HS  111  Intermidiate History
 
 Please enter the prefix of the course you wish to remove: 
 HS
 Please enter the course number of the course you wish to remove: 
 111
 You have sucessfully removed a course!
 Your new Courses are: 
 CSC  112  Data Structures
 
 Do you want to enter the main menu<y or n>:? 
 y
 Please choose from the following options: 
 Add <1>
 Remove <2>
 List <3>
 Load <4>
 Update <5>
 Find <6>
 Select File & save <7>
 Size <8>
 Quit <10>
 
 10
 Thank you!
 
 Do you want to enter the main menu<y or n>:? 
 n
 Good Bye
 
  ----jGRASP: operation complete.*/
