package dayOneLearn;


/**
 * 
 * Java Manages the memory using heap and stack, the heap memory
 * is dynamic and increases as per the application need, it stores
 * all the non-premitive data, like arrays, object, strings.
 * it allocates the memory for them while making a reference to the
 * stack memory, where a variable is pointing to the memory location
 * in heap. iff it is non-premitive.
 * 
 *  +-------+
 *  | stack |                   heap
 *  +-------+                ___________
 *  |  arr  |   -------->   /           \
 *  +-------+              /  arrMemory  \
 *  |  ...  |             /               \
 *  
 *  ones the need for arr is over, and it is not pointing in the heap
 *  Java's garbage collector will free the memory.
 *  
 * The memory in heap is allocated using (new) key word.
 * to make an object in java :
 * 
 *  	ObjectClassName nameOfTheObject = new OjectClassName();
 *  
 * This can be divided into 2 phases :
 * 	Phase 1 :
 * 		Left Hand Side of "=" represent that a variable of name
 * 		"nameOfTheObject" is made in the stack memory and is pointing to nothing.
 * 
 * 	Phase 2 :
 * 		Right Hand Side of "=" represent that the variable is now pointing
 * 		to a new memory location allocated in the heap memory.
 * 
 */


public class TopicRefrences {
	
	// passed by value but changed value for every variable pointing to that reference
	public static void changeName(Human human, String name) {
		human.name = name;
	}
	
	public static void main(String[] args) {
		
		// only in stack pointing to nothing can't be used
		Human willSmith;
		
		// object pointing to null
		Human jade = null;
		
		// properly allocated object
		Human falcon = new Human();
		Human f2 = falcon;
		Human f3 = f2;
		
		changeName(f3, "falcon");
		
		System.out.println(jade);
		System.out.println(falcon);
		System.out.print(falcon.name);
	}
}

class Human {
	public String name = "homosapein";
}
