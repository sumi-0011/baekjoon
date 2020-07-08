package Bronze2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_1076 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		BigInteger n1, n2, n3;
		BigInteger ten = new BigInteger("10");

		s1 = sc.next();
		s2 = sc.next();
		s3 = sc.next();
		n1 = function(1, s1);
		n2 = function(1, s2);
		n3 = function(2, s3);
		System.out.println(((n1.multiply(ten)).add(n2)).multiply(n3));
	}

	public static BigInteger function(int n, String s) {
		BigInteger ten = new BigInteger("10");
		BigInteger one = new BigInteger("1");
		BigInteger x1 = new BigInteger("0");
		BigInteger x2 = new BigInteger("10");
		int N = 0;
		switch (s) {
		case "black":
			N = 0;
			if (n == 1)
				return x1;
			if (n == 2)
				return one;
			break;
		case "brown":
			N = 1;
			if (n == 1)
				return one;
			if (n == 2)
				return ten;
			break;
		case "red":
			N = 2;
			break;
		case "orange":
			N = 3;
			break;
		case "yellow":
			N = 4;
			break;
		case "green":
			N=5;
			break;
		case "blue":
			N=6;
			break;
		case "violet":
			N=7;
			break;
		case "grey":
			N=8;
			break;
			
		case "white":
			N=9;
			break;
		}
		if (n == 1) {
			while (N != 0) {
				x1 = x1.add(one);
				N--;
			}
			return x1;
		}else if(n==2) {

			while(N!=1) {
				x2 = x2.multiply(ten);
				N--;
			}
			return x2;
		}
		return x1;
	}

}
