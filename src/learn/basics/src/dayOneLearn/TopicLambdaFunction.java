package dayOneLearn;

// defining the lambda function, what and how many parameters to take
@FunctionalInterface
interface LambdaExample {
	String methodExmpl(int a, int b);
}

public class TopicLambdaFunction {

	public static void main(String[] args) {
		
		// referencing the lambda function to the class
		LambdaExample exmp = (a,b) -> {
			int result = a+b;
			return "this is the result: " + result;
		};

		// using object to call upon which method
		System.out.println(exmp.methodExmpl(4, 5));
	}

}
