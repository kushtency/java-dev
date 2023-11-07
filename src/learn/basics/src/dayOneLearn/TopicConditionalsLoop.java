package dayOneLearn;

/**
 *
 * The control flow can be altered by basically 3 types of statements :
 * 
 * 	1. Conditional Statements :
 * 		"if, else, else if, switch" these are the three conditional statements
 * 		that are being used to determine whether or not to execute some
 * 		statement or not
 * 		Ex: if(boolean){}
 * 
 * 		Ex: switch(value){
 * 				case valueToBeMatched:
 * 					//code
 * 					break;
 * 				default:
 * 					//code
 * 			} 		
 * 
 * 	2. Loop Statements
 * 		"for, while, do while" these are the three Loop statements work
 * 		as like in C++
 * 
 * 	3. Control Flow Statements
 * 		"return, break, continue" are the control flow statements used
 * 		in functions (return), and loops (break, continue).
 * 
 */

public class TopicConditionalsLoop {

	public static void main(String[] args) {
		
		// if, else if, if
		int num = 10;

		if (num > 0) {
		    System.out.println("The number is positive.");
		} else if (num < 0) {
		    System.out.println("The number is negative.");
		} else {
		    System.out.println("The number is zero.");
		}
		
		// switch statements
		int day = 3;
		String dayName;

		switch (day) {
		    case 1:
		        dayName = "Monday";
		        break;
		    case 2:
		        dayName = "Tuesday";
		        break;
		    case 3:
		        dayName = "Wednesday";
		        break;
		    
		    default:
		        dayName = "Invalid day";
		}

		System.out.println("Today is " + dayName);
		
		// for loop
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Iteration " + i);
		}
		
		// while loop
		int count = 0;

		while (count < 3) {
		    System.out.println("Count: " + count);
		    count++;
		}
		
		// do while loop, execute at least 1 times
		int num1 = 1;

		do {
		    System.out.println("Number: " + num1);
		    num1++;
		} while (num1 <= 3);
		
	}

}
