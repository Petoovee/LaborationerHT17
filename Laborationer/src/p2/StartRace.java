package p2;
import javax.swing.ImageIcon;

public class StartRace
{
    public static void main(String[] args)
    {
        PaintWindow window = new PaintWindow(new ImageIcon("images/background.png"));
//Disabled        Car c1 = new Car(new ImageIcon("images/CarBlue.GIF"));
//Disabled        Car c2 = new Car(new ImageIcon("images/CarRed.GIF"));
        Race race = new Race(window);
        race.action();
        if(args.length>0)
        {
            PaintWindow.pause(2000);
            window.dispose();
        }
    }
}
