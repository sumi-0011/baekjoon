package Bronze4;

import java.util.Scanner;

public class Main_10797 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			if (array[i] == n)
				sum++;
		}
		System.out.println(sum);

	}

}
