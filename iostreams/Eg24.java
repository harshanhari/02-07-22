package iostreams;

import java.io.FileReader;
import java.io.Reader;

public class Eg24 {

	public static void main(String[] args) {

		char[] array = new char[100];
		try {
			Reader input = new FileReader("input.txt");
			System.out.println("Is there data in the stream? " + input.ready());
			input.read(array);
			System.out.println("Data in the stream : ");
			System.out.println(array);
			input.close();

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
