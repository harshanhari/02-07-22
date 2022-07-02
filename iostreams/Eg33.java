package iostreams;

import java.io.FileWriter;

public class Eg33 {

	public static void main(String[] args) {

		String data = "This is the data in the output file";
		try {
			FileWriter output = new FileWriter("output.txt");
			output.write(data);
			output.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
