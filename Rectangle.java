//******************************************************************************
//  Title:  Rectangle.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//******************************************************************************
//  Description:
//****************
//         Read the dimensions of a rectangle from an input file.
//         Make appropiate calculations for the file using width and length to calculate area and perimeter.
// 
//******************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:      Rectangle
//          ***********************************************************************************
//Variables&Objects: 
//            -width:     Double
//            -lenght:    Double
//            -form:      DecimalFormat
//          ************************************************************************************
//Methods:
//            +Rectangle(double wid, double len)
//            +getwidth():  double
//            +getlength(): double
//            +computeArea(): double
//            +computePerimeter(): double
//            +toString(): String
//          ************************************************************************************* 

 
import java.text.*;

public class Rectangle extends Shape
{
   protected double width;
   protected double length;
   protected static DecimalFormat form = new DecimalFormat("0.##");

   //---------------------------------------------------------------------------
   //  Sets up the rectangle by entering its width and length.
   //---------------------------------------------------------------------------
   public Rectangle(double wid, double len) 
   {
      width = wid;
      length = len;
   }

   //---------------------------------------------------------------------------
   //  Returns the double value of the width.
   //---------------------------------------------------------------------------
   public double getWidth() 
   {
      return width;
   }
  
   //---------------------------------------------------------------------------
   //  Returns the double value of the length.
   //---------------------------------------------------------------------------
   public double getLength() 
   {
      return length;
   }
   
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the area.
   //---------------------------------------------------------------------------
   public double computeArea() 
   {
      return length * width;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the perimeter.
   //---------------------------------------------------------------------------
   public double computePerimeter() 
   {
      return 2 * (length + width);
   }

   //---------------------------------------------------------------------------
   //  Returns pertinent information about the rectangle.
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Rectangle: width is " + form.format(width) + 
             ", length is " + form.format(length) +
             "\nperimeter is " + form.format(computePerimeter()) +
             ", area is " + form.format(computeArea());
   }
}
