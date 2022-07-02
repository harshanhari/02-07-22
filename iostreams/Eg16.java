package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Eg16 {

	public static void main(String[] args) {

		Dog1 dog1 = new Dog1("Liza", "Labrador");
		try {
			FileOutputStream fileOut = new FileOutputStream("file.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(dog1);
			FileInputStream fileIn = new FileInputStream("file.txt");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			Dog1 newDog1 = (Dog1) objIn.readObject();
			System.out.println("Dog name : " + newDog1.name);
			System.out.println("Dog breed : " + newDog1.breed);
			objOut.close();
			objIn.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
