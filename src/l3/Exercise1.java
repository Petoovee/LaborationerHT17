package l3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println(readNumbers());
	}

	public static int readNumbers() {
		int returnVal = 0;
		try {
			FileInputStream FIS = new FileInputStream("files/heltal.dat");
			DataInputStream DIS = new DataInputStream(FIS);
			System.out.println(DIS);
			returnVal = DIS.readInt();
		} catch (IOException FileNotFoundException) {
			System.out.println("Deus vult");
		}
		return returnVal;
	}
}