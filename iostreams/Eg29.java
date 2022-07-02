package iostreams;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Eg29 {

	public static void main(String[] args) {

		String data = "This is a line in the file";
		try {
			FileOutputStream file = new FileOutputStream("output.txt");
			OutputStreamWriter output = new OutputStreamWriter(file);
			output.write(data);
			output.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
