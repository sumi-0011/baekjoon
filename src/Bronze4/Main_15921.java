package Bronze4;

import java.util.Scanner;

public class Main_15921 {
public static void main(String args[]) {
		
		//int[]배열을 /n으로 나눴을때 0....이면 소수점은 없어ㅣ고 정수로만 남는다!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] array = new double[n];
		double average = 0.0, e = 0.0; // 평균과 기댓값

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
			average += array[i];
		}
		if (n == 0) {
			System.out.println("divide by zero");
		} else {
			// 연습기록들의 평균값/ 연습기록들 중의 기댓값.
			average /= n;
			for (int i = 0; i < n; i++) {
				e += array[i] / n;
				
			}
			double a = average / e * 100;
			a = Math.round(a);
			a /= 100;

			
			if (e == 0) {
				System.out.println("divide by zero");
			} else {
				System.out.printf("%.2f", a);
			}
		}

	}
}
