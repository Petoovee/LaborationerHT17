package workshop5;

import java.util.Random;

public class Measuretable {
	private static float temp[] = new float[24];
	private static float min = 999, max = -999, mid;
	private static Random rand = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < temp.length; i++) {
			temp[i] = rand.nextInt(100000000) / 10000000 + 10;
		}

		for (int i = 0; i < temp.length; i++) {
			check(i);
			mid += temp[i];
		}
		mid = mid / temp.length;
		System.out.println("Min: " + min);
		System.out.println("Mid: " + mid);
		System.out.println("Max: " + max);
	}

	public static void check(int i) {
		if (temp[i] < min) {
			min = temp[i];
		}
		if (temp[i] > max) {
			max = temp[i];
		}
	}
}
