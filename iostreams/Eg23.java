package iostreams;

import java.io.PrintStream;

public class Eg23 {

	public static void main(String[] args) {

		try {
			PrintStream output = new PrintStream("output.txt");
			int age = 23;
			output.printf("iam %d years old", age);
			output.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
