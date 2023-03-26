package Employee;

import Deparment.Department;

public class Employee {
	
	private String id;
	private String name;
	private Department Dept;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return Dept;
	}
	public void setDept(Department dept) {
		Dept = dept;
	}
	
}
