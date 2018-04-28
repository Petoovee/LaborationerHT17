package arrays;

public class IntegerArray {
	public static String toString(int[] array) // Returns the array as a String
	{
		String returnVal = "{";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				returnVal += array[i];
			} else {
				returnVal += array[i] + ",";
			}
		}
		returnVal += "}";
		return returnVal;
	}

	public static int max(int[] array) // Returns the highest value from the array
	{
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) // Returns the smallest value of the array
	{
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int maxPos(int[] array) {
		int maxPos = 0;
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxPos = i;
			}
		}
		return maxPos;
	}

	public static int minPos(int[] array) {
		int minPos = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minPos = i;
			}
		}
		return minPos;
	}

	public static int sum(int[] array) // Returns the sum of the array
	{
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	public static float average(int[] array) // Returns the average of the array
	{
		float average = (float) sum(array) / array.length;
		return average;
	}

	public static int range(int[] array) {
		int range = max(array) - min(array);
		return range;
	}

	public static void sortAsc(int[] array) {
		int[] arrayCopy = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = min(arrayCopy);
			arrayCopy[minPos(arrayCopy)] = max(arrayCopy);
		}
	}

	public static void sortDesc(int[] array) {
		int[] arrayCopy = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = max(arrayCopy);
			arrayCopy[maxPos(arrayCopy)] = min(arrayCopy);
		}
	}

	public static int[] copy(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}
}
