package Bronze4;

import java.util.Scanner;

public class Main_10162 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 1~10000초
		int a, b, c; // a=5,b=1,c=10초
		int n = t / 60;
		a = n / 5;
		b = n % 5;
		if ((t % 60) % 10 == 0) {
			c = (t % 60) / 10;
			System.out.printf("%d %d %d", a, b, c);

		} else {
			System.out.println(-1);
		}
	}
	//문제 잘 읽자
}
