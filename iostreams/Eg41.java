package iostreams;

import java.io.StringWriter;

public class Eg41 {

	public static void main(String[] args) {

		String data = "This is a text in the String";
		try {
			StringWriter output = new StringWriter();
			output.write(data);
			System.out.println("Data in the StringWriter : " + output);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
