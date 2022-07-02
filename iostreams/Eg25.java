package iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Eg25 {

	public static void main(String[] args) {

		String data = "This is a line in the file";
		try {
			Writer output = new FileWriter("output.txt");
			output.write(data);
			output.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
