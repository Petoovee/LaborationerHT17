package p2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;

public class Race
{
	private PaintWindow window;
	private Boolean raceOver = false;
	private int nbrOfCars = Integer.parseInt(JOptionPane.showInputDialog("How many racers are there today?"));
	private Car[] car = new Car[nbrOfCars];
	private int[] carXSpeed = new int[nbrOfCars]; //The speeds of each car
	private int[] carYSpeed = new int[nbrOfCars];
	private int[] carNbr = new int[nbrOfCars]; //Which car is which
	Random rand = new Random();
	
	public Race(PaintWindow window) //Constructor
	{
		this.window = window;
	}
	
	
	public void action()
	{
		System.out.println(nbrOfCars +" cars are racing today");
//		int space = window.getBackgroundHeight(); //Holds a temporary value for referencing where the current height limit is
		
		int ii = 0;
		for(int i : carNbr) //A makeshift ticker to keep track of which car is which!
		{
			i = ii++;
			
			//Assigns a random icon to each car
			int nbr = rand.nextInt(2);
			if (nbr == 0)
			{
				car[i] = new Car(new ImageIcon("images/CarBlue.GIF"));
				System.out.println("Car " +i +" assigned blue color!"); //Debugging
			}
			else 
			{
				car[i] = new Car(new ImageIcon("images/CarRed.GIF"));
				System.out.println("Car " +i +" assigned red color!"); //Debugging
			}
			
			car[i].moveTo(window.getBackgroundWidth() - car[i].getImage().getIconWidth() , window.getBackgroundHeight() - (window.getBackgroundHeight()/nbrOfCars)*(i+1)); //Positions each car
			System.out.println("Car " +i +" positioned at X:" +car[i].getX() +" Y:" +car[i].getY()); //Debugging
			window.showImage(car[i].getImage(),  car[i].getX(), car[i].getY()); //Update it
			System.out.println("Car " +i +" updated"); //Debugging
			carXSpeed[i] = 0; //Sets the horizontal speed of the cars to 0
			carYSpeed[i] = 0; //Sets the vertical speed of the cars to 0
		}
		
		while(raceOver == false)
		{
			ii = 0;
			for (int i : carNbr) //Cycles through each car
			{
				i = ii++;
				carXSpeed[i] = carXSpeed[i] + rand.nextInt(2); //Accelerates the car horizontally
				move(i); //Moves the car
				window.showImage(car[i].getImage(),  car[i].getX(), car[i].getY()); //Update it
//				System.out.println("Car " +i +" moved"); //Debugging
				if (car[i].getX() <= 0) //Checks if the current car is at or beyond the finish line
				{
					raceOver = true;
	                JOptionPane.showMessageDialog(null, "Car " + i + " won!");
	                break; //To stop the while-loop from opening the victory-prompt twice
				}
			}
			PaintWindow.pause(50);
		}
	}
	
	public void move(int i) //Accelerates the cars
	{
		car[i].moveTo(car[i].getX() - carXSpeed[i] , car[i].getY() - carYSpeed[i]);
	}
}