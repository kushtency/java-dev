package dayOneLearn;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Exceptions are the errors that will stop the execution of program
 * they are the errors which are to be watched by either the program
 * or by us.
 * 
 * The Exception class in java represents all the exception that is
 * to be occurred in the code.
 * 
 * 	Exception -> Throwable -> Object
 * 
 * that's why exception can work on every Object as Object class is
 * the parent of Exception.
 * 
 * there are 2 types of inbuilt exception : 
 * 
 * 	1. Checked Exception :
 * 		Checked exceptions are called compile-time exceptions because
 * 		these exceptions are checked at compile-time by the compiler.
 * 
 * 	2. Unchecked Exception :
 * 		 The compiler will not check these exceptions at compile time.
 * 
 * in java we can create our own exception, use it to throw
 * and catch while doing operations.
 * 
 * 	1. create a class of the CustomException extending to the Exception class
 * 	2. implement a method which throws the CustomException
 * 	3. use this method in the try, catch block to catch the exception
 * 
 * Checked Exceptions :
 * 
 * 	1. ClassNotFoundException
 * 	2. InterruptedException
 * 	3. IOException
 * 	4. InstantiationException
 * 	5. SQLException
 * 	6. FileNotFoundException
 * 
 * Unchecked Exceptions :
 * 
 * 	1. ArithmeticException
 * 	2. ClassCastException
 * 	3. NullPointerException
 * 	4. ArrayIndexOutOfBoundsException
 * 	5. ArrayStoreException
 * 	6. IllegalThreadStateException
 * 
 * Exception handling increases code quality by improving the
 * robustness of the code and writing secure and error free code
 * 
 */

// creation of a Custom Exception which extends to Exception
class CustomException extends Exception {

	// important to make a constructor to initiate and display the statement
	public CustomException(String message) {
		super(message);
	}
	
}

public class TopicExceptionHandeling {
	
	public static Scanner in = new Scanner(System.in);
	
	// used custom exception by throwing its instance;
	public static void demoMethod() throws CustomException {
		throw new CustomException("this is custom Exception");
	}
	
	public static void main(String[] args) {
		
		// using try catch finally block
		int[] arr = null;
		try {
			arr = new int[5];
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(arr != null) {
				System.out.println(Arrays.toString(arr));
			}
		}
		
		// multiple catch block with try
		int idx = Integer.MIN_VALUE;
		int valAtIdx = -1;
		try {
			idx = in.nextInt();
			valAtIdx = arr[idx];
		} catch(InputMismatchException ime) {
			ime.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
		} finally {
			System.out.println(arr[valAtIdx]);
		}
		
		// custiom exception implemented in try catch blocks
		try {
			demoMethod();
		}catch(CustomException e) {
			e.printStackTrace();
		}finally {
			System.out.println("execute always");
		}
		
	}

}
