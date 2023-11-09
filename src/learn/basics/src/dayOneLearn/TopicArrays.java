package dayOneLearn;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * Arrays are the non-primitive data types that is why
 * the reference for them is stored in the stack memory
 * while the exact memory location is in heap memory
 * 
 * for initializing an array we need its size (mandatory)
 * Syntax for initializing an array :
 * 	"Data type" [] "array name" = new "Data type"["size"]
 * 	"Data type" [] "array name" = {1,2,3,4,5}
 * 
 * The operations on the array are :
 * 	1. Read the value at an index
 * 	2. Update the value on an index
 * 	3. Delete the value on an index
 * 	4. Add the value in the predefined size
 * 
 * Java offers many methods and property for the arrays made from primitives :
 * 	1. the length can be determined by "length" property "arr.length"
 * 	2. to print an array we can use the "Arrays" class "Arrays.toString(arr)"
 * 	3. to sort an array we can use the "Arrays" class "sort" method "Arrays.sort(arr)" ascending
 * 	4. there is no method to reverse and swap in these types of arrays made with primitive DT
 * 
 * In Java, a method can only have parameters by using pass by value, there is no
 * pass by reference. But while passing the non-primitive data types the value now
 * comes from stack which by default points in heap memory, that makes the changes
 * in array whenever we pass it in the method. This holds true for all the 
 * non-primitive Data types.
 * 
 * 
 */

public class TopicArrays {

	public static void main(String[] args) {
		
		// initializing an array
		int[] arr = new int[5];
		
		// loop that can be used to write and read
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		}
		
		// loop only used to read the value
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.println();
		
		// sort in ascending order
		Arrays.sort(arr);
		
		// sort in descending order (need to convert the array to Integer array)
		Integer[] arr2 = new Integer[arr.length];
		for(int i = 0; i < arr2.length; i++) {
			
			// auto boxing will happen over here
			arr2[i] = arr[i];
			
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		
		// sort descending without converting to Integer array
		Arrays.sort(arr);
		reverse(arr);
		
		// printing without using loops
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
	public static void reverse(int[] arr) {
		int start = 0; int end = arr.length - 1;
		while(start < end) {
			
			// there is no method to swap in int[]
			int temp = arr[start]; arr[start] = arr[end]; arr[end] = temp;
			start++; end--;
			
		}
		
	}

}
