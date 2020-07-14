package Bronze4;

import java.util.Scanner;

public class Main_16204 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m,k;
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		int a,b;//앞에 o인거 앞에 x인거
		int result=0;
		b = n-m;
		if(m>k) {
			result = k+b;
			System.out.println(result);
		}
		else if(m==k) {
			System.out.println(n);
		}
		else {
			result = m + (b-(k-m));
			System.out.println(result);
		}
		
		
	}
}
