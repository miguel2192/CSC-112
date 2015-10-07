//******************************************************************************
//  Title:  Sphere.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//******************************************************************************
//  Description:
//****************
//         Read the dimensions of a Sphere from an input file.
//         Make appropiate calculations for the file using radius to calculate area and perimeter.
// 
//******************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:      Sphere
//          ***********************************************************************************
//Variables&Objects: 
//            -radius:     Double
//            -form:      DecimalFormat
//          ************************************************************************************
//Methods:
//            +Sphere( double rad)
//            +getradius(): double
//            +computeSurfacearea(): double
//            +computeDiameter(): double
//            +toString(): String
//            +computeVolume(): double
//            +computeCircumference(): double
//          *************************************************************************************     
import java.text.*;

public class Sphere extends Circle
{
  protected DecimalFormat format = new DecimalFormat("0.##");
  
  
  
  //---------------------------------------------------------------------------
   //  Sets up the circle by entering its radius
   //---------------------------------------------------------------------------
   public Sphere( double rad) 
   {
      super(rad);
    
      
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
      return  4*Math.PI * Math.pow(radius, 2);
   }
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the perimeter.
   //---------------------------------------------------------------------------
   public double computeCircumference() 
   {
      return 2*Math.PI*radius;
   }
   //-----------------------------------------------------------------------------
   //Computes volume
   //--------------------------------------------------------------------------------
   public double computeVolume() 
   {
      return (4/3)* Math.PI*Math.pow(radius,3);
   }



  
   //---------------------------------------------------------------------------
   //  Returns pertinent information about the circle
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Sphere: diameter is " + format.format(computeDiameter()) + 
             ", circumference is " + format.format(computeCircumference()) +
             ", surface area is " + format.format(computeSurfacearea())+
             " and volume is " + format.format(computeVolume());
   }
}
  
 
