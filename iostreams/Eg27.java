package iostreams;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Eg27 {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("input.txt");
			InputStreamReader input1 = new InputStreamReader(file);
			InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));
			System.out.println("Charater encoding of input1 : " + input1.getEncoding());
			System.out.println("Charater encoding of input2 : " + input2.getEncoding());
			input1.close();
			input2.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
