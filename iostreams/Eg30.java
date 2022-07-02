package iostreams;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Eg30 {

	public static void main(String[] args) {

		try {
			FileOutputStream file = new FileOutputStream("output.txt");
			OutputStreamWriter output1 = new OutputStreamWriter(file);
			OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));
			System.out.println("Charater encoding of output1 : " + output1.getEncoding());
			System.out.println("Charater encoding of output1 : " + output2.getEncoding());
			output1.close();
			output2.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
