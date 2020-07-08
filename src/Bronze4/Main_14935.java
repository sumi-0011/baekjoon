package Bronze4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_14935 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger x = sc.nextBigInteger();
		BigInteger old;
		int count1 = 0;
		boolean a = false;
		while(true) {
			count1++;
			if(count1==1000) {
				System.out.println("NFA");
				break;
			}
			old = x;
			x = function(x);
			if(old.equals(x)) {
				a = true;
				System.out.println("FA");
				break;
			}
			
		}
		

	}
	public static BigInteger function(BigInteger x) {
		BigInteger zero = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger count= new BigInteger("0");
		BigInteger one= new BigInteger("1");
		BigInteger y=new BigInteger("1");;
		while(!x.equals(zero)){
			count = count.add(one);
			y = x.remainder(ten);
			x = x.divide(ten);
		}
		x = count.multiply(y);
		return x;
		
	}
}
