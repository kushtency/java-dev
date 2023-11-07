package dayOneLearn;

/**
 *
 * Any java file will be having one and only public class
 * and by convention that class should represent the name
 * of the java file, in which it is written
 * 
 */

public class TopicSyntax {
	
/**
 * 
 * Every Java Application will be started from the main
 * function, any function which we want to write, should
 * always be encapsulated in "class", now this function
 * is known as "method" of that particular class.
 * 
 * The entry-point, from where the program will be executed
 * should exactly be like :
 * 
 * 	public static void main(String[] args){
 * 	}
 * 
 * This represents the main method such as :
 * 	1. public :
 * 		Will make the main method to access from outside the
 * 		class.
 * 	2. static :
 * 		While executing JVM can call this method without making
 * 		the object of the class, and the memory is allocated
 * 		until the program is finished.
 * 	3. void :
 * 		it defines the return type of main method must be void
 * 		as per the JVM conventions, without void it will not run
 * 		it is a design convention.
 * 	4. main :
 * 		while execution first JVM will look for the method named main
 * 		and start execution.
 * 	5. String[] args:
 * 		"args" is basically an array of String, it signifies the Command
 * 		line arguments that are to be given while running the program,
 * 		String array is used as the String can be converted to anything, 
 * 		be it an integer, double, boolean, or char itself.
 * 
 */
	
	public static void main(String[] args) {
		
	}
	
}

/**
 * 
 * Here is another class which is not public, that's why
 * it can be created in this java file, the convention to
 * create a class are :
 * 	1. Pascal Case : 
 * 		First letter is capital, space is denoted by
 * 		capital letters. 
 * 		Ex: "Another Class" will be "AnotherClass"
 * 	2. Syntax :
 * 		"Access Specifier" "final/_" "class" "ClassName" {
 * 		}
 * 	3. Java Do not permit to make class of Name class
 * 	   because class is a keyword.
 * 
 */

class AnotherClass {
	
}