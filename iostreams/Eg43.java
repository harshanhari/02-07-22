package iostreams;

import java.io.PrintWriter;

public class Eg43 {

	public static void main(String[] args) {

		String data = "This is the text in the file";
		try {
			PrintWriter output = new PrintWriter("output.txt");
			output.print(data);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
