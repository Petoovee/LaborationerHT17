package laboration6;

import javax.swing.JOptionPane;

public class Car
{
	String brand, model;
	int horsePower;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setHorsepower(int horsePower)
	{
		this.horsePower = horsePower;
	}
	
	public void info()
	{
		JOptionPane.showMessageDialog(null, brand + "\n" + model + "\n" + horsePower + "hp");
	}
}
