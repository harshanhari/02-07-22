package iostreams;

import java.io.ByteArrayInputStream;

public class Eg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] array = { 1, 2, 3, 4 };
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			input.skip(2);
			System.out.println("Input stream after skipping 2 bytes :");
			int data = input.read();
			while (data != -1) {
				System.out.println(data + ", ");
				data = input.read();

			}
			input.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
