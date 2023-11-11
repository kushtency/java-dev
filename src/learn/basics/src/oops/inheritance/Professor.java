package oops.inheritance;

public class Professor {
	
	private Student st;
	
	// every professor have a student one to one
	public Professor(Student st) {
		this.st = st; 
	}
	
	// dependency of taking lecture on salary
	public String takeLecture(Salary salary) {
		if(salary != null) {
			return "doing work";
		}
		return "will not do any work";
	}
	
}
