package Silver4;

import java.util.Scanner;

public class Main_1002 {
	public static void main(String[] args) {
		int x1, x2, y1, y2, r1, r2;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			double d =Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2); // ���� �Ÿ�
		
			// System.out.println("d: "+d);
			// 1.��ġ�¿�
			if (d == 0 && r1 == r2) {
				System.out.println(-1);
			}

			// 2.�ο��� �����Ҷ�
			else if (d != 0 && d == Math.pow(r1 + r2, 2))
				System.out.println(1);
			// 3.�ο��� �����Ҷ�
			else if (d != 0 && d == Math.pow(r2-r1, 2))
				System.out.println(1);
			//4. �� ���� ���� �������ְ� ������ ������ 
			else if(d> Math.pow(r1 + r2, 2)) {
				System.out.println(0);
			}
			//5. �� ���� �ٸ� ���� ���ο� �ְ� �� ���� ������ ������.
			else if(( d<Math.pow(r2-r1, 2)) || (d==0 && r1!=r2))
				System.out.println(0);
			else 
				System.out.println(2);
		}

	}
}
