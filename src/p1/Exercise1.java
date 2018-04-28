package p1;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {
	/*
	 * Metoden beräknar totala biljettpriset och det genomsnittliga biljettpriset
	 * för ett antal vuxna, barn och pensionärer.
	 **/
	public void exercise1a() {
		long deadbeats, squeakers, oldies, total; // Beh�ver ju inte begr�nsas med lille int
		double pris, genomsnittspris; // Decimaler! Eller bara h�ga priser?
		deadbeats = Long.parseLong(JOptionPane.showInputDialog("How many adults?"));
		squeakers = Long.parseLong(JOptionPane.showInputDialog("How many children?"));
		oldies = Long.parseLong(JOptionPane.showInputDialog("How many seniors?"));
		pris = (deadbeats * 110) + (squeakers * 60) + (oldies * 80);
		total = deadbeats + squeakers + oldies;
		genomsnittspris = (double) Math.round((pris / total) * 100) / 100; // F�r att skriva ut de genomsnittliga
																			// kostnaden med tv� decimalers precision
		JOptionPane.showMessageDialog(null, "The total price for all " + total + " passengers is " + pris
				+ " averaging to " + genomsnittspris + " per \"person\"");
	}

	public void exercise1b() {
		String uddatal = "";
		for (long x = 1; x <= 100; x++) {
			if (x % 2 != 0) {
				uddatal += String.valueOf(x) + " ";
			}
		}
		JOptionPane.showMessageDialog(null, uddatal);
	}

	// public void exercise1c() {...}
	public void exercise1c() {
		long[] array = new long[4];
		for (long i : array) {
			i = Long.parseLong(JOptionPane.showInputDialog("Mata in ett tal"));
			if (i > 0) {
				System.out.println("Talet " + i + " �r posetivt");
			} else if (i == 0) {
				System.out.println("Talet " + i + " �r noll");
			} else if (i < 0)
				System.out.println("Talet " + i + " �r negativt");
			else {
				System.out.println("Talet " + i + " �r varken posetivt, negativt eller noll");
			}
		}
	}

	// public void exercise1d() {...}
	public void exercise1d() {
		String values = "";
		long min = Long.parseLong(JOptionPane.showInputDialog("Min?"));
		long max = Long.parseLong(JOptionPane.showInputDialog("Max?"));
		long x = min;
		while (x <= max) {
			if (min > max) {
				break;
			} else if ((x - min) % 7 == 0) {
				values += String.valueOf(x) + ", ";
			}
			x++;
		}
		JOptionPane.showMessageDialog(null, values);
	}

	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3;
		int dy = 0;
		int x = 500;
		int y = rand.nextInt(height - 100); // Bildens höjd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while (true) {
			pw.showImage(image, x, y);
			// PaintWindow.pause(1); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			if (x < 0 || x > 500) {
				dx = -dx;
			}
			/*
			 * if(y<0 || y>200) { dy = -dy; }
			 */ }
	}

	// public void exercise1f() {...}
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = rand.nextInt(3);
		int dy = rand.nextInt(3);
		int x = rand.nextInt(500);
		int y = rand.nextInt(height - 100); // Bildens höjd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while (true) {
			pw.showImage(image, x, y);
			// PaintWindow.pause(1); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			if (x < 0 || x > 500) {
				dx = -dx;
			}
			if (y < 0 || y > 500) {
				dy = -dy;
			}
		}
	}
}
