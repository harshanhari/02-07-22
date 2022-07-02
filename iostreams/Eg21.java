package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Eg21 {

	public static void main(String[] args) {
		String data = "This is a line in the file";

		try {
			FileOutputStream file = new FileOutputStream("flush.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(file);
			buffer.write(data.getBytes());
			buffer.flush();
			System.out.println("Data is flushed into the file");
			buffer.close();
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
