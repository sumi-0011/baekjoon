package Bronze4;

import java.util.Scanner;

public class Main_10156 {
public static void main(String args[]) {
		
		int n,m,k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		n = sc.nextInt();
		m = sc.nextInt();
		
		int sum = k*n;
		if(sum>m) {
			System.out.println(sum-m);
		}
		else
			System.out.println(0);
		
	}

}
