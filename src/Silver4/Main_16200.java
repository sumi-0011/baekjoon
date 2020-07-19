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
			// 한 그룹이 만들어질떄
			if (s == count + 1) {
				team++;
				count = 0;
				end = true;
				if (i != n - 1) {
					s = array[i + 1];
				}
				// i가 마지막일떄 ->제일 큰수가 1일떄임 상관 x

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
