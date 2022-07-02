package iostreams;

import java.io.FileOutputStream;

public class Eg6 {

	public static void main(String[] args) {

		String data = "This ia a line in the file";
		try {
			FileOutputStream output = new FileOutputStream("output.txt");
			byte[] array = data.getBytes();
			output.write(array);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
