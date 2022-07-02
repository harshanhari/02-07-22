package iostreams;

import java.io.StringReader;

public class Eg40 {

	public static void main(String[] args) {

		String data = "This is a text read from the TestReader";
		System.out.println("Original data : " + data);
		char[] array = new char[100];
		try {
			StringReader input = new StringReader(data);
			input.skip(5);
			input.read(array);
			System.out.println("Data after skipping 5 charater : ");
			System.out.println(array);
			input.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
		
	}

}
