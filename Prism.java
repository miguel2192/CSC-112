//******************************************************************************
//  Title:  Prism.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//******************************************************************************
//  Description:
//****************
//         Read the dimensions of a Prism from an input file.
//         Make appropiate calculations for the file using width, length and height to calculate area and Volume.
// 
//******************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:      Prism
//          ***********************************************************************************
//Variables&Objects: 
//            -width:     Double
//            -lenght:    Double
//            -height:    Double
//          ************************************************************************************
//Methods:
//            +Prism(double wid, double len, double hei):
//            +getheight():  double
//            +computeArea(): double
//            +computeVolume()
//            +toString(): String
//          ************************************************************************************* 

public class Prism extends Rectangle
{
   private double height;

   //---------------------------------------------------------------------------
   //  Sets up the prism by entering its width, height and length.
   //---------------------------------------------------------------------------
   public Prism(double wid, double len, double hei)
   {
      super(wid, len);
      height = hei;
   }

   //---------------------------------------------------------------------------
   //  Returns the double value of the length.
   //---------------------------------------------------------------------------
   public double getHeight() 
   {
      return height;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the surface area.
   //---------------------------------------------------------------------------
   public double computeArea() 
   {
      return 2 * super.computeArea() + 2 * width * height + 2 * length * height;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the volume.
   //---------------------------------------------------------------------------
   public double computeVolume() 
   {
      return super.computeArea() * height;
   }

   //---------------------------------------------------------------------------
   //  Returns pertinent information about the prism.
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Prism: width is " + form.format(width) + 
             ", length is " + form.format(length) + ", height is " + 
             form.format(height) + "\nperimeter of base is " + 
             form.format(computePerimeter()) + ", area is " + 
             form.format(computeArea()) +
             "\nvolume is " + form.format(computeVolume()) + "\n";
   }
}
