//******************************************************************************
//   Book.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 12/15/2015
//  Course: CSC 112-001
//  Description:
//         Helper class of LibManager.java. It creates a book.
//
//  
//******************************************************************************
//         UML Diagram for main Application   
//         ************************************************************************************  
//           Application Class         
//          ***********************************************************************************     
//Class:      Book.java
//          ***********************************************************************************
//Variables&Objects: 
//            +prefix String
//            +title   String
//            +number    int
//          ************************************************************************************
//Methods:   getTitle()
//           getNumber()
//           getCat()
//          
//          ************************************************************************************* 

//   ********************************************************************************************
//       Program Logic:
//                     1) Helper class
//                     2) Creates a book
//                     3) return book
//
//  **********************************************************************************************    


import java.io.Serializable;

/**
 * Represents a course that might be taken by a student.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class Book implements Serializable, Comparable<Book>
{
	private String title;
	private int number;
	private String cat;
	//private String grade;
	
	/**
	 * Constructs the course with the specified information.
	 * 
	 * @param prefix the prefix of the course designation
	 * @param number the number of the course designation
	 * @param title the title of the course
	 * @param grade the grade received for the course
	 */
	public Book(String title, int number, String cat, String grade)
	{
		this.title = title;
		this.number = number;
		this.cat = cat;
		/*if (grade == null)
			this.grade = "";
		else
			this.grade = grade;*/
	}
	
	/**
	 * Constructs the course with the specified information, with no grade
	 * established.
	 * 
	 * @param prefix the prefix of the course designation
	 * @param number the number of the course designation
	 * @param title the title of the course
	 */
	public Book(String title, int number, String cat)
	{
		this(title, number, cat, "");
	}

	/**
	 * Returns the prefix of the course designation.
	 * 
	 * @return the prefix of the course designation
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Returns the number of the course designation.
	 * 
	 * @return the number of the course designation
	 */
	public int getNumber()
	{
		return number;
	}
	
	/**
	 * Returns the title of this course.
	 * 
	 * @return the prefix of the course
	 */
	public String getCat()
	{
		return cat;
	}
	
	/**
	 * Returns the grade for this course.
	 * 
	 * @return the grade for this course
	 */
	/*public String getGrade()
	{
		return grade;
	}**/
	
	/**
	 * Sets the grade for this course to the one specified.
	 * 
	 * @param grade the new grade for the course
	 */
	/*public void setGrade(String grade)
	{
		this.grade = grade;
	}*/
	
	/**
	 * Returns true if this course has been taken (if a grade has been received).
	 * 
	 * @return true if this course has been taken and false otherwise
	 */
	/*public boolean taken()//to be able to determine if there is a grade
	{
		return !grade.equals("");
	}*/
	
	/**
	 * Determines if this course is equal to the one specified, based on the
	 * course designation (prefix and number).
	 * 
	 * @return true if this course is equal to the parameter
	 */
	public boolean equals(Object other)
	{
		boolean result = false;
		if (other instanceof Book)
		{
			Book otherCourse = (Book) other;
			if (title.equals(otherCourse.getTitle()) &&
					number == otherCourse.getNumber())
				result = true;
		}
		return result;
	}



	/**
	 * Creates and returns a string representation of this course.
	 * 
	 * @return a string representation of the course
	 */
    
    
   public int compareTo(Book other)
   {
    int result = 0;
    
    result = title.compareTo(other.getTitle());
    if(result==0)
    
     result = number - other.getNumber();
     
     return result;
     
   }



	public String toString()
	{
		String result = title + "  " + number + "  " + cat;
		/*if (!grade.equals(""))
			result += "  " + grade + "  ";*/
		return result;
	}
}