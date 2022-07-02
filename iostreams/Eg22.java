package iostreams;

import java.io.PrintStream;

public class Eg22 {

	public static void main(String[] args) {

		String data = "new data in the file";
		try {
			PrintStream output = new PrintStream("output.txt");
			output.print(data);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
