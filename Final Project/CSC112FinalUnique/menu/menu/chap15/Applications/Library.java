//******************************************************************************
//  Library.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 12/15/2015
//  Course: CSC 112-001
//  Description:
//         This is a helper class for the LibManager.java program. It provides
//         with many options to manage a library by allowing the user to add books,
//         remove books etc.
//
//
//******************************************************************************
//         UML Diagram for main Application
//         ************************************************************************************
//           Application Class
//          ***********************************************************************************
//Class:      Library.java
//          ***********************************************************************************
//Variables&Objects:
//            +record String
//            +prefix   String
//            +courseName String
//            +grade   String
//            +number    int
//          ************************************************************************************
//Methods:  load(String fileName)
//          addBook(Book book)
//          find(String title, int number)
//          getSize()
//          removeBook(Book book)
//          replace(Book target, Book newCourse)
//          save(String fileName)
//          toString()
//
//          *************************************************************************************

//   ********************************************************************************************
//       Program Logic:
//                     1) Helper class of LibManager.java
//                     2) Creates many options
//                     3) Allows user to manage a library
//**********************************************************************************************

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;

import jsjf.ArrayOrderedList;


public class Library implements Iterable<Book>, Serializable
{
	/**
	 *
	 */
	//private static final long	serialVersionUID	= 6351403329122962471L;


   public static Library load(String fileName) throws IOException,//loads the specified file
   		ClassNotFoundException
   {
   	/*
   	 * FileInputStream fis = new FileInputStream(fileName);
   	 * ObjectInputStream ois = new ObjectInputStream(fis);
   	 * ProgramOfStudy pos = (ProgramOfStudy) ois.readObject();
   	 * ois.close();
   	 */
      final Library pos = new Library();//creates a new object name pos
      final Scanner fileScan = new Scanner(new File(fileName));
      Scanner stringScan;
   
      String record = "";
      String prefix = "";
      int number = 0;
      String courseName = "";
      String grade = "";
   
      while (fileScan.hasNext())
      {
         record = fileScan.nextLine();
         stringScan = new Scanner(record);
         stringScan.useDelimiter("  ");
         prefix = stringScan.next();
         number = stringScan.nextInt();
         courseName = stringScan.next();
        /// grade = stringScan.next();
         pos.addBook(new Book(prefix, number, courseName, grade));
         stringScan.close();
      
      }
      System.out.println("\nFile " + fileName + " was loaded!\n");
      System.out.println("Here are its contents: ");
      fileScan.close();
      return pos;
   }

   private final ArrayOrderedList<Book>	list	= new ArrayOrderedList<Book>();

	/**
	 * Constructs an initially empty Program of Study.
	 */
   public Library()
   {
   
   }

	/**
	 * Adds the specified course to the end of the course list.
	 *
	 * @param course
	 *            the course to add
	 */
   public void addBook(Book course)//adds a book to the list
   {
      if (course != null)
      {
         this.list.add(course);
      }
   }

	/**
	 * Finds and returns the course matching the specified prefix and number.
	 *
	 * @param prefix
	 *            the prefix of the target course
	 * @param number
	 *            the number of the target course
	 * @return the course, or null if not found
	 */
   public Book find(String title, int number)//finds a book in the list
   {
      for (final Book course : this.list)
      {
         if (title.equals(course.getTitle())
         		&& (number == course.getNumber())) { 
            return course; }
      }
   
      return null;
   }

   public int getSize()//gets the size of the list
   {
   
      return this.list.size();
   }

	/**
	 * Returns an iterator for this Program of Study.
	 *
	 * @return an iterator for the Program of Study
	 */
   public Iterator<Book> iterator()
   {
      return this.list.iterator();
   }

   public void removeBook(Book course)//removes a book from the list
   {
      if (course != null)
      {
         this.list.remove(course);
      }
   }

	/**
	 * Adds the specified course after the target course. Does nothing if
	 * either course is null or if the target is not found.
	 *
	 * @param target
	 *            the course after which the new course will be added
	 * @param newCourse
	 *            the course to add
	 */
	/*
	 * public void addCourseAfter(Course2 target, Course2 newCourse)
	 * {
	 * if (target == null || newCourse == null)
	 * return;
	 * int targetIndex = list.indexOf(target);
	 * if (targetIndex != -1)
	 * list.add(targetIndex + 1, newCourse);
	 * }
	 */
	/**
	 * Replaces the specified target course with the new course. Does nothing if
	 * either course is null or if the target is not found.
	 *
	 * @param target
	 *            the course to be replaced
	 * @param newCourse
	 *            the new course to add
	 */
   public void replace(Book target, Book newCourse)//replaces an existing book from the list
   {
      if ((target == null) || (newCourse == null)) { 
         return; }
      this.list.remove(target);
      System.out.println(target + "has been removed \n");
   
      this.list.add(newCourse);
      System.out.println(newCourse + "has been added \n");
   
   }

	/**
	 * Saves a serialized version of this Program of Study to the specified
	 * file name.
	 *
	 * @param fileName
	 *            the file name under which the POS will be stored
	 * @throws IOException
	 */
   public void save(String fileName) throws IOException//saves contents and throws an IOException error
   {
   	/*
   	 * FileOutputStream fos = new FileOutputStream(fileName);
   	 * ObjectOutputStream oos = new ObjectOutputStream(fos);
   	 * oos.writeObject(this);
   	 * oos.flush();
   	 * oos.close();
   	 */
      final FileWriter fw = new FileWriter(fileName);
      final BufferedWriter bw = new BufferedWriter(fw);
      final PrintWriter pw = new PrintWriter(bw);
   
      for (final Book course : this.list)
      {
         pw.println(course);
      }
   
      pw.flush();
      pw.close();
   }

	/**
	 * Creates and returns a string representation of this Program of Study.
	 *
	 * @return a string representation of the Program of Study
	 */
   public String toString()//return a string
   {
      String result = "";
      for (final Book course : this.list)
      {
         result += course + "\n";
      }
      return result;
   }
}