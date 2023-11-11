package oops;

import kingdom.Organism;
import oops.inheritance.Department;
import oops.inheritance.Professor;
import oops.inheritance.Salary;
import oops.inheritance.Student;
import oops.inheritance.University;

/**
 * 
 * Object Oriented Programming in Java is governed by 4 main rules :
 * 
 * 	1. Encapsulation :
 * 		Encapsulation refers to isolating the properties or behavior of any class
 * 		from either outer classes or packages, it is a process to achieve abstraction
 * 		for both the Properties and Methods, in java it is attained by using access 
 * 		modifiers there are 4 access modifiers.
 * 		1. public	: same-class, same-package(non-subclass,subclass), different-package(subclass,non-subclass)
 * 		2. private	: same-class
 * 		3. default	: same-class, same-package(subclass, non-subclass)
 * 		4. protected: same-class, same-package(subclass, non-subclass), different-package(subclass)
 * 
 * 	2. Inheritance :
 * 		Inheritance refers to inheriting the properties and behavior of a parent class
 * 		in the child class and using those method as per need.
 * 		In oop inheritance is the key to establish relationship between any 2 entities or Objects
 * 		there are mainly 4 types of relations that can be maintained :
 * 		1. Association	: sure connections made by Field of the Object
 * 		2. Dependency	: dependency on object made by method parameter of the object
 * 		3. Composition	: sure connection but 1 to many made by inner classes, constructor initializing Fields
 * 		4. Aggregation	: loose connection for 1 to many, sometimes independent an Method returning Object, Object list.
 * 
 * 	3. Abstraction :
 * 		Abstraction refers to give only required functionality and states for the outer classes
 * 		or packages, abstraction can be attained by encapsulating the property and behavior
 * 		of classes and by using interface and abstract classes.
 * 		1. Interface : 
 * 			It refers to a public part of an object, in java there exist a feature named interface
 * 			Interface in java provides 100% abstraction as it lets you define a contract of interaction
 * 			between Objects, it is also known as the set of rule which is to be followed ones implemented.
 * 
 * 		2. Abstract Class:
 * 			Abstract class is also an feature in java which provides the functionality of defining
 * 			and declaring a method as per the need for the program.
 * 
 * 	4. Polymorphism :
 * 		Polymorphism means that a behavior can be implemented according to the need of the program
 * 		This is also achieved using interface and abstract classes, in this scenario you need to 
 * 		program to the interface or abstract class.
 * 
 * */

// For encapsulation
class Animal {
	
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

// For Encapsulation, to review the protected fields
class Plant extends Organism{
	public void showWeight() {
		System.out.println(weight);
	}
}

// For Abstraction, to expose only necessary states and behavior
class Airoplane {
	
	// to perform fly operation, no one needs to know how it is doing so
	class Pair {
		public int latitude;
		public int longitude;
	}
	private int speed;
	private int altitude;
	private Pair position;
	private float rollAngle;
	private float pitchAngle;
	private float yawAngle;
	
	public void Fly() {
		
		// using the fields 
		if(this.altitude > 1000) {
			this.speed = (int)(this.yawAngle + this.pitchAngle - this.rollAngle);
			this.speed *= this.position.latitude;
			this.speed -= this.position.longitude;
		}
		System.out.println(this.speed > 300 ? "fly" : "not fly");
	}
}

// For Polymorphism, program to the abstract class or interface
abstract class Pets {
	
	// implemented details are visible to the class extending Pets
	public String makeFriends() {
		return "according to breed they are Familiar";
	}
	
	// implemented details are known only for the class which extend to Pets
	abstract public String makeSound();
	
}
class Dogs extends Pets {

	@Override
	public String makeSound() {
		return "Bark";
	}
}
class Cats extends Pets {
	
	@Override
	public String makeSound() {
		return "Meow";
	}
}

public class Main {
	
	public static void Encapsulation() {
		
		// Encapsulation using access modifiers
		Animal dog = new Animal();
		
		// default field are accessible in same package, doesn't matter if this class extends to Animal
		System.out.println(dog.name);
		
		// public fields, methods are accessible in same class, different packages, everywhere without extensions
		System.out.println(dog.sex);
		
		// protected fields, are accessible in same class, same packages but different packages can only use them after extending
		System.out.println(dog.weight);
		
		// protected fields of Organism
		Organism org = new Organism();
		
		// weight property is protected so cannot hop out of package without extending
//		System.out.println(org.weight);
		
	}
	
	public static void Inheritance() {
		/**
		 * 
		 * There is a university having professor and student, an ER model is generated
		 * which tells us how the relationship between these entity is to be done.
		 * 
		 * 	1. A professor communicates with students : association
		 * 	2. Professor depends on salary : dependency
		 * 	3. University consists of departments : composition (certain)
		 * 	4. Department contains professors : aggregation (not certain)
		 * 
		 * */
		
		// having departments by default (certain)
		University iit = new University();
		
		// not certain that department consist of professor or not
		Department science = new Department();
		Department tech = new Department();
		
		// a professor will always have student with one to one
		Student st = new Student();
		Professor techWiser = new Professor(st);
		
		// the lecture is dependent on salary
		Salary techPacakge = new Salary();
		techWiser.takeLecture(techPacakge);
		
		// only tech department is having the professor techWiser
		tech.addProfessor(techWiser);
		
		// adding the departments in university
		iit.addDepartment(tech);
		iit.addDepartment(science);
		
	}
	
	public static void Abstraction() {
		
		// logic is not visible only fly and not fly is to be said
		Airoplane airoplane = new Airoplane();
		airoplane.Fly();
		
	}
	
	public static void Polymorphism() {
		
		// a pet can be a dog or a cat, accordingly it will behave
		Pets dog = new Dogs();
		Pets cat = new Cats();
		
	}
	
	public static void main(String[] args) {
		
		// OOPs concept
		Encapsulation();
		Inheritance();
		Abstraction();
		Polymorphism();
		
	}

}