package iostreams;

import java.io.StringReader;

public class Eg39 {

	public static void main(String[] args) {

		String data = "This is a text read from the TestReader";
		char[] array = new char[100];
		try {
			StringReader input = new StringReader(data);
			input.read(array);
			input.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
