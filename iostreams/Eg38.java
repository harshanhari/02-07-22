package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Eg38 {

	public static void main(String[] args) {

		String data = "This is a demo of flush method";
		try {
			FileWriter file = new FileWriter("flush.txt");
			BufferedWriter output = new BufferedWriter(file);
			output.write(data);
			output.flush();
			System.out.println("Data is flushed into the file");
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
