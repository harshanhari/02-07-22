package iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Eg19 {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("input.txt");
			BufferedInputStream buffer = new BufferedInputStream(file);
			buffer.skip(5);
			System.out.println("Input stream after skipping 5 bytes : ");
			int i = buffer.read();
			while (i != -1) {
				System.out.println((char) i);
				i = buffer.read();

			}
			buffer.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
