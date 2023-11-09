package dayOnePractice;

public class ArrayCompatiblity {

	public boolean isCompatible(int[] arr1, int[] arr2) {
		boolean isSizeValid = false;
		boolean isGreater = true;
		
		if(arr1.length == arr2.length) {
			isSizeValid = true;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] < arr2[i]) {
				isGreater = false;
			}
		}
		
		return isSizeValid && isGreater;
	}
	
	public static void main(String[] args) {
		
	}

}
