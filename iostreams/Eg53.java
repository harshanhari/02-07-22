package iostreams;

import java.io.FileWriter;

public class Eg53 {

	public static void main(String[] args) {

		String data = "This is the data in the file";
		try {
			FileWriter output = new FileWriter("output.txt");
			output.write(data);
			System.out.println("Data is written into the file");
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
