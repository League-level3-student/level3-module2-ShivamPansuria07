
package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker   {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                // If the current element is bigger than the next...
                if( arr[k] > arr[ k+1 ] ) {
                    return false;
                }else {
                	return true;
                }
            }
        }
		return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    public static boolean doubleArraySorted(double[] arr) {
    	
    	// This for loop puts one value in the correct position
        for (int k = 0; k < arr.length - 1; k++) {
            // If the current element is bigger than the next...
            if( arr[k] > arr[ k+1 ] ) {
                return false;
            }else {
            	return true;
            }
        }
    
	return true;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    public static boolean charArraySorted(char[] arr3) {
    	for (int k = 0; k < arr3.length - 1; k++) {
            // If the current element is bigger than the next...
            if( arr3[k] > arr3[ k+1 ] ) {
                return true;
            }else {
            	return true;
            }
        }
    
	return false;
    }
    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    public static boolean charArraySorted(String[] arr3) {
    	for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3.length - 1; k++) {
                if( arr3[k].compareTo(arr3[ k+1 ]) > 0 ) {
                    return false;
                }else {
                	return false;
                }
            }
        }
		return false;
    }
}
