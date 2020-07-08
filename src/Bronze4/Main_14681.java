package Bronze4;

import java.util.Scanner;

public class Main_14681 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if (x < 0 && y < 0) {
			System.out.println(3);
		} else if (x >= 0 && y < 0) {
			System.out.println(4);
		} else if (x < 0) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}

	}
}
