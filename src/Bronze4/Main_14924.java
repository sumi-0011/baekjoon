package Bronze4;

import java.util.Scanner;

public class Main_14924 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int s,t,d;
		s = sc.nextInt();	//������ �ӵ�
		t = sc.nextInt();	//�ĸ��� �ӵ� t>s
		d = sc.nextInt();	//�Ÿ� 2*s�� ���
		
		int h = d/(2*s);
		System.out.println(t*h);
		
	}
}
