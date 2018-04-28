package laboration6;

public class Employee
{
/*//Should we've done something like this?
	Employee name = new Employee();
	Employee employer = new Employee();
	Employee wage = new Employee();
*/

	private String name, employer;
	private double wage;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmployer(String employer)
	{
		this.employer = employer;
	}
	
	public void setWage(double wage)
	{
		this.wage = wage;
	}
	
	public void info()
	{
		System.out.println("Name: " + name);
		System.out.println("Employer: " + employer);
		System.out.println("Wage: " + wage + " kr");
	}
}
