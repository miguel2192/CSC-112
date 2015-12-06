//***********************************************************
//
//    Miguel A Rodriguez
//    CSC 112                  11/24/2015
//    Prof. Page
//***********************************************************
/**
 * SortPhoneList driver for testing an object selection sort.
 *
 * @author Java Foundations
 * @version 4.0
 */
import java.util.*;
public class SortPhoneList
{
    /**
     * Creates an array of Contact objects, sorts them, then prints
     * them.
     */
    
    public static void main(String[] args)
    
    {
       String another="";
      do
      {
        Scanner scan = new Scanner(System.in);
        
        Contact[] friends = new Contact[7];
        
        Contact target;

        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Marsha", "Grant", "243-555-2837");
      //  friends[7] = new Contact("Rodrig", "Miguel", "201-234-2345");
        
         Sorting.insertionSort(friends);

        for (Contact friend : friends)
            System.out.println(friend);
            
         System.out.println("Please enter the first name of the person that you wish to search for: ");
         String fname = scan.nextLine();
         
         System.out.println("Please enter the last name of the person that you wish to search for: ");
         String lname = scan.nextLine();
         
         target = new Contact(fname, lname, "");
        // int min = 0;
        // int max= friends.length();
         
         //boolean binarySearch(T[] data, int min, int max, T target)
         if(Searching.binarySearch(friends,0,6,target))
           System.out.println("Found Using Binary Search!\n");
        else
           System.out.println("Not Found Using Binary Search!\n");
           
          if(Searching.binarySearch2(friends,0,6,target))
           System.out.println("Found Using Binary Search #2!\n");
        else
           System.out.println("Not Found Using Binary Search #2!!\n");
         
          if(Searching.linearSearch(friends,0,6,target))
           System.out.println("Found Using Linear Search");
        else
           System.out.println("Not Found Using Linear Search");
          
           

           System.out.println("Do you want to continue<y or n>?");
           another = scan.next();
           
         }while(another.equalsIgnoreCase("y"));
           
  }
}

/*
 ----jGRASP exec: java SortPhoneList
 
 Barnes, Sarah	215-555-3827
 Getz, Laura	663-555-3984
 Grant, Marsha	243-555-2837
 Phelps, Frank	322-555-2284
 Riley, Mark	733-555-2969
 Smith, John	610-555-7384
 Smith, Larry	464-555-3489
 Please enter the first name of the person that you wish to search for: 
 Sarah
 Please enter the last name of the person that you wish to search for: 
 Barnes
 Found Using Binary Search!
 
 Found Using Binary Search #2!
 
 Found Using Linear Search
 Do you want to continue<y or n>?
 y
 Barnes, Sarah	215-555-3827
 Getz, Laura	663-555-3984
 Grant, Marsha	243-555-2837
 Phelps, Frank	322-555-2284
 Riley, Mark	733-555-2969
 Smith, John	610-555-7384
 Smith, Larry	464-555-3489
 Please enter the first name of the person that you wish to search for: 
 Miguel
 Please enter the last name of the person that you wish to search for: 
 Rodriguez
 Not Found Using Binary Search!
 
 Not Found Using Binary Search #2!!
 
 Not Found Using Linear Search
 Do you want to continue<y or n>?
 n
 
  ----jGRASP: operation complete.*/
 
