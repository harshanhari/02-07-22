package iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Eg18 {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("input.txt");
			BufferedInputStream buffer = new BufferedInputStream(file);
			System.out.println("Available bytes at the begining  : " + buffer.available());
			buffer.read();
			buffer.read();
			buffer.read();
			System.out.println("Available bytes at the end " + buffer.available());
			buffer.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
