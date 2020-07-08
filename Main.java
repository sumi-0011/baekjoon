
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1==n2 && n1 == n3) {
			System.out.println(10000+n1*1000);
		}
		else if(n1!=n2 && n1!=n3 && n2!=n3) {
			int max = n1 > n2 ? n1:n2;
			max = max > n3 ? max : n3;
			System.out.println(max*100);
		}
		else {
			if(n1==n2 || n1==n3) {
				System.out.println(n1*100+1000);
			}
			else
				System.out.println(n2*100 + 1000);
		}
		

	}
}
