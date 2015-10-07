//******************************************************************************
//  Title:  Cylinder.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//******************************************************************************
//  Description:
//****************
//         Read the dimensions of a Cylinder from an input file.
//         Make appropiate calculations for the file using radius and height to calculate diameter and surfacearea.
// 
//******************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:      Cylinder
//          ***********************************************************************************
//Variables&Objects: 
//            -radius:    Double
//            -height:    Double
//            -form:      DecimalFormat
//          ************************************************************************************
//Methods:
//            +Cylinder( double rad, double h) 
//            +getheight():  double
//            +computeSurfacearea(): double
//            +computeDiameter(): double
//            +toString(): String
//            +computeVolume(): double
//            +computeCircumference(): double
//          *************************************************************************************   
import java.text.*;

public class Cylinder extends Circle
{
  protected DecimalFormat format = new DecimalFormat("0.##");
  

  protected double height;
  
  //---------------------------------------------------------------------------
   //  Sets up the circle by entering its radius
   //---------------------------------------------------------------------------
   public Cylinder( double rad, double h) 
   {
      super(rad);
      height = h;
      
   }
    
     public double getHeight()
   {
      return height;
   }
   //-------------------------------------------------------------------------
   //Computes Diameter
  // **************************************************************************
   public double computeDiameter() 
   {
      return  2 * radius;
   }

     
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the area.
   //---------------------------------------------------------------------------
   public double computeSurfacearea() 
   {
      return 2*Math.PI*radius*height + 2*Math.PI * Math.pow(radius, 2);
   }
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the perimeter.
   //---------------------------------------------------------------------------
   public double computeCircumference() 
   {
      return 2*Math.PI*radius*height + 2*Math.PI * Math.pow(radius, 2);
   }
   //-----------------------------------------------------------------------------
   //Computes volume
   //--------------------------------------------------------------------------------
   public double computeVolume() 
   {
      return Math.PI*Math.pow(radius,2)*height;
   }



  
   //---------------------------------------------------------------------------
   //  Returns pertinent information about the circle
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Cylinder: diameter is " + format.format(computeDiameter()) + 
             ", circumference is " + format.format(computeCircumference()) +
             ", surface area is " + format.format(computeSurfacearea())+
             " and volume is " + format.format(computeVolume());
   }
}
  
 
