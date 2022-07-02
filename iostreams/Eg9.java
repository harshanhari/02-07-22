package iostreams;

import java.io.ByteArrayInputStream;

public class Eg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] array = { 1, 2, 3, 4 };
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			System.out.println("Available bytes at the begining : " + input.available());
			input.read();
			input.read();
			System.out.println("Available bytes at the end : " + input.available());
			input.close();

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
