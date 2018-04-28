package laboration7;

import laboration6.PaintWindow;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Exercise7m {
	private PaintWindow window;
	private Picture man1, man2;
	
    public void action1() {
        ImageIcon image1 = new ImageIcon("images/sommar.jpg");
        ImageIcon image2 = new ImageIcon("images/liggandegubbe.jpg");
        ImageIcon image3 = new ImageIcon("images/gubbe.jpg");

        window = new PaintWindow(image1);
        
        int width = window.getBackgroundWidth();
        int height = window.getBackgroundHeight();
        
        // image2.getIconHeight() ger bildens höjd
        man1 = new Picture(image2,0,(height-image2.getIconHeight())/2);
        // image3.getIconWidth() ger bildens bredd
        man2 = new Picture(image3,(width-image3.getIconWidth())/2, height-image3.getIconHeight());
        showPicture(man1);
        showPicture(man2);
    }

    public void showPicture(Picture picture) {
    	window.showImage(picture.getIcon(), picture.getX(), picture.getY());
    }

    public static void main(String[] args) {
        Exercise7m u7m = new Exercise7m();
        u7m.action1();
    }
}
