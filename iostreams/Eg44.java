package iostreams;

import java.io.PrintWriter;

public class Eg44 {

	public static void main(String[] args) {

		try {
			PrintWriter output = new PrintWriter("output.txt");
			int age = 25;
			output.printf("iam %d years old", age);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
