package iostreams;

import java.util.Scanner;

public class Eg48 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String value = input.next();
		System.out.println("Using next() " + value);

	}

}
