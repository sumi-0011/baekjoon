package Bronze4;

import java.util.Scanner;
//꽤 까다로움

public class Main_4299 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int s, m;
		int k=0;
		s = sc.nextInt(); // 합
		m = sc.nextInt(); // 차
		int a, b; // a 가 더 크다고 가정
		if((s+m)%2 !=0 || m>s) {
			System.out.println(-1);
		}
		else {
			a = (s+m)/2;
			b=(s-m)/2;
			System.out.println(a + " " +b);
		}
	}
}
