package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Eg37 {

	public static void main(String[] args) {

		String data = "Yhis is a data in the file";
		try {
			FileWriter file = new FileWriter("output.txt");
			BufferedWriter output = new BufferedWriter(file);
			output.write(data);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
