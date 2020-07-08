package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_8437 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger b1 = new BigInteger("0");
		BigInteger b2 = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		BigInteger k = new BigInteger("2");

		b1 = sc.nextBigInteger();
		b2 = sc.nextBigInteger();
		b = b1.subtract(b2);
		b = b.divide(k);
		System.out.println(b.add(b2));
		System.out.println(b);
	}
}
