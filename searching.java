/**
 * Searching demonstrates various search algorithms on an array 
 * of objects.
 *
 * @author Java Foundations
 * @version 4.0 
 */
public class Searching 
{
    /**
     * Searches the specified array of objects using a linear search
     * algorithm.
     *
     * @param data   the array to be searched
     * @param min    the integer representation of the minimum value 
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for
     * @return       true if the desired element is found
     */
    public static <T extends Comparable<T>>   
	boolean linearSearch(T[] data, int min, int max, T target)
    {
        int index = min;
        boolean found = false;

        while (!found && index <= max) 
        {
            found = (data[index].compareTo(target) == 0);
            index++;
        }
        return found;
    }

    /**
     * Searches the specified array of objects using a binary search
     * recursive algorithm.
     *
     * @param data   the array to be searched
     * @param min    the integer representation of the minimum value 
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for 
     * @return       true if the desired element is found
     */
    public static <T extends Comparable<T>>  
	    boolean binarySearch(T[] data, int min, int max, T target)
    {  
        boolean found = false;
        int midpoint = (min + max) / 2;  // determine the midpoint

        if (data[midpoint].compareTo(target) == 0)
            found = true;

        else if (data[midpoint].compareTo(target) > 0)
        {
            if (min <= midpoint - 1)
                found = binarySearch(data, min, midpoint - 1, target);
        }
        
        else if (midpoint + 1 <= max)
            found = binarySearch(data, midpoint + 1, max, target);
        return found;
    }  
    
    /**
     * Searches the specified array of objects using a binary search
     * iterative algorithm.
     *
     * @param data   the array to be searched
     * @param min    the integer representation of the minimum value 
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for 
     * @return       true if the desired element is found
     */
 
    public static <T extends Comparable<T>>  
		boolean binarySearch2(T[] data, int min, int max, T target)
    {  
        boolean found = false;
        int midpoint;
        
        while(min <= max && !found)
        {
            midpoint = (min + max) / 2;  // determine the midpoint
            if (data[midpoint].compareTo(target) == 0)
                found = true;
            else if (data[midpoint].compareTo(target) > 0)
                max = midpoint - 1;        
            else 
                min = midpoint + 1;
        }            
        return found;
    }
}
