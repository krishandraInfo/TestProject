package info.inetsolv.SpringCore;

public class Employee {
	
	private Integer empId;
	private String name;
	private Double salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void getDetails() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
		System.out.println("thanks");
	}

}
