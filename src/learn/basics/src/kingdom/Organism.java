package kingdom;

public class Organism {
	// when nothing is written before any field or method, java treats it as default
	String name = "lucy";
	
	// public specifier is used with both fields and method, it is available to everyone
	public String sex = "F";
	
	// protected specifier is used with fields, method, visible inside a package and the subclass for different package
	protected int weight = 25;
	
	// private specifier makes the field or method only visible to the class it is used in
	private int age = 5;
	
	// to give the access for age field, getter and setters are made which returns copy of private field
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
