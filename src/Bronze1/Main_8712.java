package Bronze1;

import java.util.Scanner;

public class Main_8712 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				// ¦�����϶��� �����ʿ��� ��������
				for (int j = n; j > 0; j--) {
					System.out.print(n * i + j + " ");

				}
			} else {
				// Ȧ�����϶��� ���ʿ��� ����������
				for (int j = 1; j <= n; j++) {
					System.out.print(n * i + j + " ");
				}
			}
			System.out.println();
		}

	}
}
