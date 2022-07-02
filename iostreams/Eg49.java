package iostreams;

import java.util.Scanner;

public class Eg49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String value = input.nextLine();
		System.out.println("Using nextLine() " + value);
		input.close();

	}

}
