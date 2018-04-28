package laboration8;

public class Contact
{
	private String name;
	private PhoneNumber phone;
	
	public Contact(String name, String home, String mobile, String work)
	{
		this.name = name;
		this.phone = new PhoneNumber(home, mobile, work);
//		this.phone.setHome(home);
//		this.phone.setMobile(mobile);
//		this.phone.setWork(work);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHome(String home)
	{
		this.phone.setHome(home);
	}
	
	public void setMobile(String mobile)
	{
		this.phone.setMobile(mobile);
	}
	
	public void setWork(String work)
	{
		this.phone.setWork(work);
	}

	public String getHome()
	{
		return this.phone.getHome();
	}
	
	public String getMobile()
	{
		return this.phone.getMobile();
	}
	
	public String getWork()
	{
		return this.phone.getWork();
	}
	
	public PhoneNumber getPhone()
	{
		return phone;
	}

	public void setPhone(PhoneNumber phone)
	{
		this.phone = phone;
	}
	
	public String toString()
	{
		return this.phone.toString();
	}
}
