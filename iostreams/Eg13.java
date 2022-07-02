package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Eg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data1 = 5;
		String data2 = "This is programiz";
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			output.writeInt(data1);
			output.writeObject(data2);
			FileInputStream fileStream = new FileInputStream("file.txt");
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			System.out.println("Intiger data : " + objStream.readInt());
			System.out.println("String data : " + objStream.readObject());
			output.close();
			objStream.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
