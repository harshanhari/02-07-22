package iostreams;

import java.io.FileInputStream;

public class Eg4 {

	public static void main(String[] args) {

		try {
			FileInputStream input = new FileInputStream("input.txt");
			System.out.println("Available bytes in the begining is " + input.available());
			input.read();
			input.read();
			input.read();
			System.out.println("Available bytes the end is " + input.available());
			input.close();
		} catch (Exception e) {

			e.getStackTrace();
			// TODO: handle exception
		}
	}

}
