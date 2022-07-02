package iostreams;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Eg50 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the big Integer : ");
		BigInteger value1 = input.nextBigInteger();
		System.out.println("Using nextBigInteger() " + value1);
		System.out.println("Enter the big Decimal : ");
		BigDecimal value2 = input.nextBigDecimal();
		System.out.println("Using nextDecimal() " + value2);
		input.close();

	}

}
