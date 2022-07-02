package iostreams;

import java.io.FileReader;
import java.nio.charset.Charset;

public class Eg32 {

	public static void main(String[] args) {
		try {
			FileReader input1 = new FileReader("input.txt");
			FileReader input2 = new FileReader("input.txt", Charset.forName("UTF8"));
			System.out.println("Charater encoding of input1 : " + input1.getEncoding());
			System.out.println("Charater encoding of input2 : " + input2.getEncoding());
			input1.close();
			input2.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
