package iostreams;

import java.io.Closeable;
import java.io.FileInputStream;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream input = new FileInputStream("input.txt");
			input.skip(5);
			System.out.println("Input stream after skipping 5 bytes ");
			int i = input.read();
			while (i != -1) {
				System.out.println((char) i);
				i = input.read();
			}
			input.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
