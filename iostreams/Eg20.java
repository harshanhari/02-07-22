package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Eg20 {

	public static void main(String[] args) {

		String data = "This is a line in the file";
		try {
			FileOutputStream file = new FileOutputStream("output.txt");
			BufferedOutputStream output = new BufferedOutputStream(file);
			byte[] array = data.getBytes();
			output.write(array);
			output.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
