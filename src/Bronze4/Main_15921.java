package Bronze4;

import java.util.Scanner;

public class Main_15921 {
public static void main(String args[]) {
		
		//int[]�迭�� /n���� �������� 0....�̸� �Ҽ����� ����Ӱ� �����θ� ���´�!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] array = new double[n];
		double average = 0.0, e = 0.0; // ��հ� ���

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
			average += array[i];
		}
		if (n == 0) {
			System.out.println("divide by zero");
		} else {
			// ������ϵ��� ��հ�/ ������ϵ� ���� ���.
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
