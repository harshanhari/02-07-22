package iostreams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Eg2 {

	public static void main(String[] args) {

		String data = "This ia a line of text inside the file";
		try {

			OutputStream out = new FileOutputStream("output.txt");
			byte[] dataBytes = data.getBytes();
			out.write(dataBytes);
			System.out.println("Data is written to the file");
			out.close();
		} catch (Exception e) {

			e.getStackTrace();

		}

	}

}
