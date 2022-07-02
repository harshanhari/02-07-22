package iostreams;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Eg26 {

	public static void main(String[] args) {

		char[] array = new char[100];
		try {
			FileInputStream file = new FileInputStream("input.txt");
			InputStreamReader input = new InputStreamReader(file);
			input.read(array);
			System.out.println("Data in the stream :");
			System.out.println(array);
			input.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
