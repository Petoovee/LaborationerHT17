package laboration7;

public class Employee {
	private String name, employer;
	private double wage;

	public Employee(String name, String employer, double wage) {
		this.name = name;
		this.employer = employer;
		this.wage = wage;
	}

	public Employee(String name, String employer, int wage) {
		this.name = name;
		this.employer = employer;
		this.wage = wage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployer() {
		return employer;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public String toString() {
		String toString = "name = " + name + ", employer = " + employer + ", wage = " + wage;
		return toString;
	}
}