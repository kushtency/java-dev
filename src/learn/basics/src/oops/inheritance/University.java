package oops.inheritance;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	private List<Department> departments;
	
	public University() {
		this.departments = new ArrayList<Department>();
	}
	
	public void addDepartment(Department department) {
		this.departments.add(department);
	}

}
