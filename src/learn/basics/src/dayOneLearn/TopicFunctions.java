package dayOneLearn;

/**
 * 
 * In java everything should be encapsulated in a class except a code block
 * that is why, whenever we are writing functions in the class these function
 * are known as methods, the syntax for writing a function is :
 * 
 * 	"Access modifier" "final,_" "static,_" "return type" "method name"("parameters") {
 * 		// function body
 * 	}
 * 
 * This method syntax indicates the following :
 * 
 * 		1. In this case "Access modifier" can be "public, private, protected"
 * 
 * 		2. "final,_" indicates that if the method can be overridden or not.
 * 
 * 		3. "static,_" indicates that this method can be used without making
 * 			an object of class also it can be used in the "static context"
 * 			meaning it is now the member of class directly associated with it.
 * 
 * 		4. "return type" indicates that what this function should return.
 * 
 * 		5. "method name" indicates the function name conventionally given in camel case.
 * 
 * 		6. "parameters" indicates the values on which the function depends upon.
 * 
 */

class Biran {
	
	// cannot be overridden while inheriting this class
	public final String doSomething(String time) {
		return "done something at this" + time;
	}
	
	// is not accessible to outer classes
	private void hasMethod() {
		System.out.println("this class has methods");
	}
	
	// accessible only those who inherit this class using extend
	protected void hasRealMethod() {
		System.out.println("this class really have methods");
	}
	
	// a class member method
	public static String directAccess() {
		return "can be access using the classname only no need to make object";
	}
	
}

class InheritBiran extends Biran {
	
	// this annotation determines that the overriding process can only apply on methods
	@Override
	protected void hasRealMethod() {
		System.out.println("now implementation is followed that is used in this class");
	}
	
}

public class TopicFunctions {

	public final static String thisMethod() {
		return "this method cannot be overridden also is static";
	}
	
	public static void main(String[] args) {
		
		// static methods
		System.out.println(thisMethod());
		
		// static method of class
		System.out.println(Biran.directAccess());
		
		// public members of class
		Biran b = new Biran();
		System.out.println(b.doSomething("2023"));
		
	}

}
