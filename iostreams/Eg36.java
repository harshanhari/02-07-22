package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class Eg36 {

	public static void main(String[] args) {

		char[] array = new char[100];
		try {
			FileReader file = new FileReader("input.txt");
			BufferedReader input = new BufferedReader(file);
			input.skip(5);
			input.read(array);
			System.out.println("Data after skipping 5 charaters : ");
			System.out.println(array);
			input.close();

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
