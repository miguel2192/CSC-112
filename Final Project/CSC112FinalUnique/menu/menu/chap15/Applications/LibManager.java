//******************************************************************************************
//   LibManager.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 12/15/2015
//  Course: CSC 112-001
//  Description:
//         Creates a list and a menu and and the user is able to manage books from the database.
//         In other words the user is able to add books, remove books, update books, list books etc.
//
//
//******************************************************************************
// List of all classes and their functions:
//*********************************************************************************************
//         LibManager.java : This is the main class the runs the program. Its main function is
//                           call all the methods from the other classes
//         Library.java : This is a helper class of the main program. It provides with many
//                        options for the library using different methods.
//         Book.java : This is a helper class from the main application. It creates a book using
//                     books characteristics.
//         About.java : This is the about page in the program.
//         AppWindow.java : This is the main window tab. It calls the main program an it runs it.
//*********************************************************************************************
//         UML Diagram for main Application
//         ************************************************************************************
//           Application Class
//          ***********************************************************************************
//Class:      LibManager.java
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
//            +main(args: String[] :void   runs the program
//          *************************************************************************************

//   ********************************************************************************************
//       Program Logic:
//                     1) creates a menu using lists
//                     2) provides menu with different options
//                     3) uses a do while loop to create repetition
//                     4) Displays information based on what the user chooses
//                     5) Allows user to add, remove, list, update, load, save etc books
//                     5) Quits the application if the user types 10
//  **********************************************************************************************

import java.io.*;
import java.util.*;
import javax.swing.*;

public class LibManager
{
	/**
	 * Creates and populates a Library. Then saves it using serialization.
	 */
   public static void main() throws IOException//runs the program and throws a IOException
   {
      
      //variables
      String another="", again="",another2="",resultant="", resultant1="", resultant4="",fileName="",storage="";
      String choice1 = "";
       int response=0;
   
      Library pos = new Library();//creates a new object name lb that calls the class Library


       Scanner scan = new Scanner(System.in);//creates an Scanner odject name scan to input data


       do//do while loop for repetition

       {
           JDialog.setDefaultLookAndFeelDecorated(true);//creates look and feel of the GUI

           choice1 = JOptionPane.showInputDialog("***[PLEASE SELECT FROM THE FOLLOWING OPTIONS]***: \n"
                   + "               ADD A BOOK   [1]\n" + "               REMOVE A BOOK   [2]\n" + "               LIST BOOKS   [3]\n"
                   + "               LOAD FILE   [4]\n" + "               UPDATE A BOOK   [5]\n" + "               FIND A BOOK  [6]\n" + "               SELECT DATABASE   [7]\n" + "               SIZE OF DATABASE   [8]\n" + "               SAVE CONTENTS   [9]\n"
                   + "               QUIT FILE   [10]\n");

           // choice = scan.nextInt();
                
        // choice1 = JOptionPane.showInputDialog("Please choose one from the following: ");
         int choice2 = Integer.parseInt(choice1);//converts the string to an integer

        switch(choice2)//creates a switch statement based on menu input

        {
            case 1:   //adds books

                do
               {
               
                  //int quantity;
                  int loop=0;
                  String prefix,name;

                   String quantity1 = JOptionPane.showInputDialog("HOW MANY BOOKS WOULD YOU LIKE TO ADD?: ");

                   //quantity = scan.nextInt();
                  int quantity2 = Integer.parseInt(quantity1);
               
                  while(quantity2>loop)
                  {
                     Scanner in = new Scanner(System.in);
                     Scanner in1 = new Scanner(System.in);
                  
                     prefix = JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S TITLE: ");
                    // prefix = in.nextLine();
                  
                  
                      String num1 = JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S 4 DIGIT CODE: ");
                     //num = in.nextInt();
                      int num2 = Integer.parseInt(num1);
                  
                  
                     name = JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S CATEGORY: ");
                     //name = in1.nextLine();
                  
                  
                    // System.out.println("Please enter the course grade: ");
                    // grade = in1.nextLine();
                  //scan.nextLine();
                  
                     Book book = new Book(prefix, num2, name); //new object name book
                     pos.addBook(book);
                  
                     quantity2--;
                     //pos.save(Course.toString());	
                     System.out.println();
                  
                  }
               //System.out.println(pos);
               
                  another = JOptionPane.showInputDialog("WOULD YOU LIKE TO CONTINUE ADDING BOOKS [Y or N] ?: ");
                 // another = scan.next();
                  System.out.println();
               
               
               }while(another.equalsIgnoreCase("y"));//if input is y or capital y continue.Otherwise stop
            
               break;
              
            case 2://removes books
            
               JOptionPane.showMessageDialog(null,"HERE ARE THE BOOKS TO SELECT FROM :");
               JOptionPane.showMessageDialog(null,pos);
            
            
               Scanner finder0 = new Scanner (System.in);//Scanner Object
            
              String prefc0=JOptionPane.showInputDialog("PLEASE ENTER THE TITLE OF THE BOOK YOU WISH TO REMOVE: ");
               //String prefc0 = finder0.nextLine();
               String numc0 = JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S 4 DIGIT CODE: ");
              // int numc0 = finder0.nextInt();
                
                 int numc8 = Integer.parseInt(numc0);//converts string to integer
                
                
               Book remove = pos.find(prefc0, numc8);//finds book
               if(remove != null)
               {
                  pos.removeBook(remove);//removes book by calling the method removeBook from class library
                  
                  JOptionPane.showMessageDialog(null,"YOU HAVE SUCCESSFULLY REMOVE A BOOK FROM THE DATABASE!");
                 JOptionPane.showMessageDialog(null,"YOUR NEW BOOKS ARE: ");
                 JOptionPane.showMessageDialog(null,pos);//prints books
                  }
               else
                  {
                  JOptionPane.showMessageDialog(null,"BOOK DOES NOT EXIST");
                  }
                break;//exits case
              
            case 3://lists
               JOptionPane.showMessageDialog(null,pos);//prints books
               System.out.println();//space line
            
               break;
            
            case 4://loads file
                try//catch IOException Error
		                {
		                 pos = pos.load(fileName);
			             }
	          	     catch ( ClassNotFoundException e ) {
                     // TODO handle me
                      }              
                   // JOptionPane.showMessageDialog(null,storage);
                    JOptionPane.showMessageDialog(null,"**[FILE WAS LOADED]**\n"+"HERE ARE YOUR CONTENTS:\n\n"+pos);
                    System.out.println();
                  break; //exits the case
            case 5://updates
                   
                    Scanner updater = new Scanner (System.in);//scanner object
                    JOptionPane.showMessageDialog(null,"HERE ARE THE BOOKS TO SELECT FROM :");
                    JOptionPane.showMessageDialog(null,pos);
                    Scanner finder1 = new Scanner (System.in);//scanner object
            
                    String prefc1=JOptionPane.showInputDialog("PLEASE ENTER THE TITLE OF THE BOOK YOU WISH TO UPDATE: ");
                    //String prefc1 = finder1.nextLine();
                    String numc1 = JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S 4 DIGIT CODE YOU WISH TO UPDATE: ");
                   // int numc1 = finder1.nextInt();
                   int numc7 = Integer.parseInt(numc1);
                   String searchResult = pos.find(prefc1, numc7).toString();//finds book
                   JOptionPane.showMessageDialog(null,"BOOK WAS FOUND!\n" + searchResult);//print book found
            
                    Scanner in = new Scanner(System.in);//scanner object
                    Scanner in1 = new Scanner(System.in);//scanner object
                    String prefc2=JOptionPane.showInputDialog("PLEASE ENTER THE UPDATED BOOK'S TITLE: ");
                    //String prefc2 = in.nextLine();
                    String num1=JOptionPane.showInputDialog("PLEASE ENTER THE UPDATED BOOK'S 4 DIGIT CODE: ");
                   // int num1 = in.nextInt();
                   int num11 = Integer.parseInt(num1);
                    String name1 = JOptionPane.showInputDialog("PLEASE ENTER THE UPDATED CATEGORY: ");
                   // String name1 = in1.nextLine();
                    //System.out.println("Please enter the updated course grade: ");
                   // String grade1 = in1.nextLine();
                  Book course10 = new Book(prefc2, num11, name1);//new book created
                   pos.replace(pos.find(prefc1, numc7), new Book(prefc2, num11, name1));//replaces
            
                    JOptionPane.showMessageDialog(null,"YOUR BOOK HAS BEEN UPDATED SUCCESSFULLY!");
                    JOptionPane.showMessageDialog(null,"YOUR NEW BOOKS ARE: ");
                    JOptionPane.showMessageDialog(null,pos);//prints courses
                    System.out.println();
                 break;//exits the case
            case 6://finds
                    Scanner finder = new Scanner(System.in);//scanner object
                    String prefc=JOptionPane.showInputDialog("PLEASE ENTER THE TITLE OF THE BOOK YOU WISH TO FIND: ");
                   // String prefc = finder.nextLine();
                    String numc=JOptionPane.showInputDialog("PLEASE ENTER THE BOOK'S 4 DIGIT CODE: ");
                   // int numc = finder.nextInt();
                   int numc5 = Integer.parseInt(numc);//converts to int
               
                    resultant = pos.find(prefc ,numc5).toString();//finds the course & convert it to a string
               
                    JOptionPane.showMessageDialog(null,"HERE IS YOUR RESULT: " +"< " + resultant+ " >");
                    System.out.println();//space between lines
                 break;//exits case
  
               
            case 7://lets user choose file and save
                Scanner sca2 = new Scanner(System.in);//scanner object
              fileName= JOptionPane.showInputDialog("PLEASE ENTER A FILENAME WITH THE .TXT EXTENSION: ");
               /// fileName = sca2.nextLine();
                
               // 
               // JOptionPane.showMessageDialog(null,"File found!");
                System.out.println();//space between lines
                
                break;//exits case
            case 8://gets the size of database
                    JOptionPane.showMessageDialog(null,"HERE IS THE SIZE OF THE DATABASE: \nCURRENTLY HAVE: "+ pos.getSize()+" ITEMS IN THE DATABASE ");
                    //JOptionPane.showMessageDialog(null, pos.getSize());
                    System.out.println();//space between lines
                 break;//exits case
                
            case 9://saves contents to specified database
                 pos.save(fileName);//saves contents by calling method save
                 JOptionPane.showMessageDialog(null,"ALL CONTENTS HAVE BEEN SAVED IN THE SPECIFIED DATABASE!");
                 break;//exits case
           
            case 10://quits
                    JOptionPane.showMessageDialog(null,"THANK YOU!");
                    System.out.println();
                 break;//exit case
            
        
         }//ends switch
         another2=JOptionPane.showInputDialog("Do you want to enter the main menu [Y or N] :? " );//asks user if they wish to continue
         //another2 = scan.next();
        // scan.nextLine();
      }while(another2.equalsIgnoreCase("y"));//creates repetition
           JDialog.setDefaultLookAndFeelDecorated(true);//look and feel of the GUI
           //asks user if they want to continue
           /*response = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO CONTINUE?", "Confirm",
                   JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if (response == JOptionPane.NO_OPTION) {
               //System.out.println("No button clicked");
           } else if (response == JOptionPane.YES_OPTION) {
               response = 1;
               // System.out.println("Yes button clicked");
           } else if (response == JOptionPane.CLOSED_OPTION) {
               response = 21;
               System.out.println("JOptionPane closed");

           }
       }while(response == 1);//creates repetition*/

       JOptionPane.showMessageDialog(null,"Good Bye");//says goob bye
    
   }//ends main
}//ends class
