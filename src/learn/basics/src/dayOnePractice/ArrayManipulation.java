package dayOnePractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {

	
	public static String getPriceDetails() {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		// statements at which exceptions can be found.
		try {	
			for(int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			int idx = in.nextInt();
			in.close();
			return "The element is " + arr[idx];
		}catch(ArrayIndexOutOfBoundsException e) {
			return "Array index i of range";
		}catch(InputMismatchException e) {
			return "Input was not in the correct format";
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(getPriceDetails());
	}

}
