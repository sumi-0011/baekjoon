package Bronze4;

import java.util.Scanner;

public class Main_15726 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		System.out.println((long)Math.max(a*b/c, a/b*c));
	}

}
//소수점오차를 줄여야 한다래서BigDecimal도 써봤는데 답이 x
//int범위를 넘어가는게 문제여서 더 크고 소수연산가능한 double로 받은후 정수형중에서 int보다 큰
//long로 변환해 소수점 버리고 출력


