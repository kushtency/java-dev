package dayOneLearn;

/**
 * 
 * There are 2 main Data types in java :
 * 	1. Primitive :
 * 
 * 		int			4 byte		None
 * 		boolean		1 bit		true,false
 * 		float		4 byte		F,f
 * 		double		8 byte		None
 * 		long		8 byte		L,l
 * 		char		2 byte		None
 * 		byte		1 byte		None
 * 		short		2 byte		None
 * 
 * 	2. Non-Primitive :
 * 		Objects
 * 		Static Arrays
 * 		String
 * 
 * Operations are perform accordingly for the data types
 * java is strictly typed language, that is why the operations
 * can only be done on the same data types, java supports
 * two type of types conversions :
 * 
 * 	1. implicit conversion :
 * 		this is done by java itself from smaller size to bigger
 * 		while doing operations
 * 			Ex : int val = 42; double dbVal = val;
 * 
 * 	2. explicit conversion :
 * 		this is done by us to specify that we want to convert from
 * 		bigger data type to smaller ones, the data is loss in this
 * 		process
 * 			Ex : double dbVal = 42.09; int val = (int)dbVal;
 */


public class TopicDataTypes {

	public static void main(String[] args) {
		int i = 10; boolean b = true;
		float f = 10.9F; double db = 98.7;
		char ch = 'C'; byte by = 23;
		short sh = 78; long ln = 89;
		
		System.out.println(Integer.SIZE + " " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println(Float.SIZE + " " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println(Double.SIZE + " " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
		System.out.println(Character.SIZE + " " + Character.MIN_VALUE + " " + Character.MAX_VALUE);
		System.out.println(Byte.SIZE + " " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println(Short.SIZE + " " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
		System.out.println(Long.SIZE + " " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
		
	}

}
