package Silver4;

import java.util.Scanner;

public class Main_14606 {
	static int f = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n + 1];
		array[0] = n;
		fun(array, 0, 1);
		System.out.println(f);
	}

	public static int[] fun(int[] a, int c, int len) {
		if (a[c] == 1) {
			return fun(a, c + 1, len);
		}
		if (c == a.length - 1 || a[c] == 0) {
			return a;
		}
		int k = a[c];
		a[c] = k / 2;
		a[len] = k - a[c];
		f += a[c] * a[len];

		return fun(a, c, len + 1);

	}
}
