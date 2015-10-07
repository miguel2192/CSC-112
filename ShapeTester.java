//******************************************************************************
//  ShapeTester.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 1/1/2015
//  Course: CSC 112-001
//  Description:
//          Read the dimensions of various 3-D shapes from an input file shape.dat, then
//          displays pertinent information about each shape.
//
//  
//******************************************************************************

   
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      ShapeTester
//          ***********************************************************************************
//Variables&Objects: 
//            -width:     Double
//            -lenght:    Double
//            -height:    Double
//            -side:      Double
//            -radius:    Double
//            -scan:      Scanner
//            -shapeType: String
//          ************************************************************************************
//Methods:
//            +main(args: String[] :void 
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                     1) Instantiate scan to read the file "shapes.dat"
//                     2) Use white loop to read the file and determine what geometric figures are to be examine.
//                     3) For each statement, create an object as described, and print the object
//                     4) Display the shapes information
//                     5) Quitt the application
//  **********************************************************************************************
//*******************************************************************************
// Pseudocode 
// 1. Instantiate scan to read the file shapes.dat 
// 2. Use while loop to read file and determine what geometric figures are to be 
//    examined for properties
// 3. Displays pertinent information about each shape
//*******************************************************************************
import java.io.*;
import java.util.*;

public class ShapeTester
{  
 public static void main (String[] args) throws IOException
 
   {
     
      Scanner scan = new Scanner (new File("shapes.dat"));
      double width, length, height, side, radius;
      
      //---------------------------------------------------------------
      // Read the data from the input file
      //---------------------------------------------------------------
      while (scan.hasNext()) 
      {
         String shapeType = scan.next();
         
         //-------------------------------------------------------------
         //    Control loops for the different shapes
         //-------------------------------------------------------------

         if (shapeType.equalsIgnoreCase("prism"))
         {
            width = scan.nextDouble();
            length = scan.nextDouble();
            height = scan.nextDouble();
            System.out.println (new Prism (width, length, height));
         }
         else if (shapeType.equalsIgnoreCase("pentahedron"))
         {
            width = scan.nextDouble();
            length = scan.nextDouble();
            height = scan.nextDouble();
            System.out.println (new Pentahedron (width, length, height));
         }  
         else if (shapeType.equalsIgnoreCase("tetrahedron"))
         {
            side = scan.nextDouble();
            height = scan.nextDouble();
            System.out.println (new Tetrahedron (side, height));
         }
         else if (shapeType.equalsIgnoreCase("sphere"))
         {
            radius = scan.nextDouble();
            System.out.println (new Sphere (radius));
         }
         else if (shapeType.equalsIgnoreCase("cylinder"))
         {
            radius = scan.nextDouble();
            height = scan.nextDouble();
            System.out.println (new Cylinder (radius, height));
         }
         else if (shapeType.equalsIgnoreCase("circle"))
         {
            radius = scan.nextDouble();
            System.out.println (new Circle(radius));
            System.out.println();
         }
         else if (shapeType.equalsIgnoreCase("rectangle"))
         {
            width = scan.nextDouble();
            length = scan.nextDouble();
            System.out.println (new Rectangle(width, length));
            
            System.out.println();
         }

        else 
         {
           System.out.println();
           radius = scan.nextDouble();
           System.out.println (new Sphere(radius));
         }
      }//end while
   }//end method
}//end class
