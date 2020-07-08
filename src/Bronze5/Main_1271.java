package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_1271 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger n1 = new BigInteger("0");
		BigInteger n2 = new BigInteger("0");

		BigInteger result = new BigInteger("0");

		n1 = sc.nextBigInteger();
		n2 = sc.nextBigInteger();

		result = result.add(n1);

		result = result.divide(n2);
		System.out.println(result);
		result = new BigInteger("0");
		result = result.add(n1);
		result = result.remainder(n2);
		System.out.println(result);
	}

}