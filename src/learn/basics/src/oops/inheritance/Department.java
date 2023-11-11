package oops.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private List<Professor> professors = null;
	
	public Department() {
		// can have or not have professors independent from this list.
	}
	
	public void addProfessor(Professor prof) {
		if(this.professors == null) {
			this.createList();
		}
		this.professors.add(prof);
	}
	
	private void createList() {
		this.professors = new ArrayList<Professor>();
	}
}
