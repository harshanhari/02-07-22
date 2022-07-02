package iostreams;

import java.io.StringWriter;

public class Eg42 {

	public static void main(String[] args) {

		String data = "This is the original Data";
		try {
			StringWriter output = new StringWriter();
			output.write(data);
			StringBuffer stringBuffer = output.getBuffer();
			System.out.println("StringBuffer : " + stringBuffer);
			String string = output.toString();
			System.out.println("String : " + string);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
