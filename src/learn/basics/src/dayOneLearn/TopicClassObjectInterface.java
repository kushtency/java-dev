package dayOneLearn;

/**
 *
 * Java is object oriented language but it is not fully object oriented
 * it is partially object oriented due to 8 primitive data types, these
 * data types can be used directly, without making the object.
 * 
 * To Encapsulate these 8 types java made Wrapper classes as the name
 * suggest these classes makes the proper object of the upper 8 data
 * types and the provides some methods on them, as a result whole
 * collections framework in java is based on these Wrapper classes to
 * provide the object oriented functionality to the raw data Types.
 * 
 * Every object in java extends to Object class this class just states
 * that every thing which is initialized with new keyword and Wrapper
 * types is an object ( to be noticed that the primitive data types
 * are not object ), that is why java Wraps them around Wrapper class
 * to be used with the whole object oriented programming
 * 
 * To make these object java provides a blueprint for them defining the 
 * property using fields and behavior using methods, after defining these
 * in the class they can be used and modified according to the object
 * 
 * In java there also exists Interface, which acts in such a manner that it
 * provides abstraction which allows the users to create classes having different
 * implementation of the same method.
 * 
 */

interface sampleInterface {
	
}

public class TopicClassObjectInterface {
	
	public static void main(String[] args) {
		
		// primitive type
		boolean b = false;
		Boolean bl = false;
		
		try {
			
			// checking the value
			System.out.println(bl.equals(b));
			
			// checking the instance
			System.out.println(bl instanceof Boolean);
			
			// error because of the primitive data type
//			System.out.println(b instanceof Boolean);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
