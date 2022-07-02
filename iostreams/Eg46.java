package iostreams;
import java.util.Scanner;

public class Eg46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer  : ");
		int data1 = input.nextInt();
		System.out.println("Using nextInt : " + data1);
		input.close();
	}

}
