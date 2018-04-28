package laboration7;

public class Address
{
	String street, town;
	int postalCode;
	
	public Address(String street, int postalCode, String town)
	{
		this.street = street;
		this.postalCode = postalCode;
		this.town = town;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public int getPostalCode()
	{
		return postalCode;
	}
	
	public String getTown()
	{
		return town;
	}
	
	public String toString()
	{
		String toString = street + " " + postalCode + " " + town;
		return toString;
	}
}
