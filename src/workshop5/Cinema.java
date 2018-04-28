package workshop5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Cinema {
	private static int seats[][] = new int[10][10];
	private static Random rand = new Random();
	private static int desiredSeats, desiredCol, check = 0;

	public static void main(String[] arg) {
		for (int col = 0; col < seats.length; col++) {
			for (int row = 0; row < seats[col].length; row++) {
				seats[col][row] = rand.nextInt(2);
				seats[3][4] = 2;
				System.out.print(seats[row][col] + " ");
			}
			System.out.println("");
		}

		desiredCol = Integer.parseInt(JOptionPane.showInputDialog("Which column?")) - 1;
		desiredSeats = Integer.parseInt(JOptionPane.showInputDialog("How many seats?"));

		for (int i = 0; i < seats[desiredCol].length + 1 - desiredSeats; i++) {
			for (int y = 0; y < desiredSeats; y++) {
				check += seats[desiredCol][i];
			}

			if (check < 0) {
				System.out.println("In row " + (desiredCol + 1) + " there are seats between seat " + i + " and "
						+ (i + desiredSeats - 1));
			} else {
				System.out.println("In row " + (desiredCol + 1) + " there are no seat combination between seat " + i
						+ " and " + (i + desiredSeats));
			}
			check = 0;
		}
	}
}
