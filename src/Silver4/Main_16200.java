package Silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Main_16200 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int count = 0, team = 0, s = array[0];
		boolean end = false;
		for (int i = 0; i < n; i++) {
			// �� �׷��� ���������
			if (s == count + 1) {
				team++;
				count = 0;
				end = true;
				if (i != n - 1) {
					s = array[i + 1];
				}
				// i�� �������ϋ� ->���� ū���� 1�ϋ��� ��� x

			} else {
				count++;
				end = false;
			}
		}
		if (end == false)
			System.out.println(team + 1);
		else
			System.out.println(team);
	}
}
