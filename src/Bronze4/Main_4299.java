package Bronze4;

import java.util.Scanner;
//�� ��ٷο�

public class Main_4299 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int s, m;
		int k=0;
		s = sc.nextInt(); // ��
		m = sc.nextInt(); // ��
		int a, b; // a �� �� ũ�ٰ� ����
		if((s+m)%2 !=0 || m>s) {
			System.out.println(-1);
		}
		else {
			a = (s+m)/2;
			b=(s-m)/2;
			System.out.println(a + " " +b);
		}
	}
}
