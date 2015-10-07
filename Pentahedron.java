//******************************************************************************
//  Title:  Pentahedron.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//******************************************************************************
//  Description:
//****************
//         Read the dimensions of a pentahedron from an input file.
//         Make appropiate calculations for the file using width, length and height to calculate area and Volume.
// 
//******************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:      Pentahedron
//          ***********************************************************************************
//Variables&Objects: 
//            -width:     Double
//            -lenght:    Double
//            -height:    Double
//          ************************************************************************************
//Methods:
//            +Pentahedron(double wid, double len, double hei):
//            +getheight():  double
//            +lengthFaceHeight():
//            +widthFaceArea():
//            +computeArea(): double
//            +lengthFaceArea()
//            +computeVolume()
//            +toString(): String
//          ************************************************************************************* 

public class Pentahedron extends Rectangle
{
   private double height;

   //---------------------------------------------------------------------------
   //  Sets up the Pentahedron by entering its width, height and length.
   //---------------------------------------------------------------------------
   public Pentahedron(double wid, double len, double hei)
   {
      super(wid, len);
      height = hei;
   }

   //---------------------------------------------------------------------------
   //  Returns the double value of the height.
   //---------------------------------------------------------------------------
   public double getHeight() 
   {
      return height;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the long face height.
   //---------------------------------------------------------------------------
   public double lengthFaceHeight() 
   {
      return Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2));
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the wide face height.
   //---------------------------------------------------------------------------
   public double widthFaceHeight() 
   {
      return Math.sqrt(Math.pow(height, 2) + Math.pow(length / 2, 2));
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the long face area.
   //---------------------------------------------------------------------------
   public double lengthFaceArea() 
   {
      return lengthFaceHeight() * length / 2;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the wide face area.
   //---------------------------------------------------------------------------
   public double widthFaceArea() 
   {
      return widthFaceHeight() * width / 2;
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the surface area.
   //---------------------------------------------------------------------------
   public double computeArea() 
   {
      return 2 * lengthFaceArea() + 2 * widthFaceArea() + super.computeArea();
   }

   //---------------------------------------------------------------------------
   //  Returns the calculated value of the volume.
   //---------------------------------------------------------------------------
   public double computeVolume() 
   {
      return super.computeArea() * height / 3;
   }

   //---------------------------------------------------------------------------
   //  Returns pertinent information about the pyramid.
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Pentahedron: width is " + form.format(width) + 
             ", length is " + form.format(length) + ", height is " + 
             form.format(height) + "\nperimeter of base is " + 
             form.format(computePerimeter()) + ", area is " + 
             form.format(computeArea()) +
             "\nvolume is " + form.format(computeVolume()) + "\n";
   }
}
