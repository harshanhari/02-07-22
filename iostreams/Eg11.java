package iostreams;

import java.io.ByteArrayOutputStream;

public class Eg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "This is a line in the string.";
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = data.getBytes();
			out.write(array);
			String streamData = out.toString();
			System.out.println("OutputStream is : " + streamData);
			out.close();

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
