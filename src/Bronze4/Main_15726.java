package Bronze4;

import java.util.Scanner;

public class Main_15726 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		System.out.println((long)Math.max(a*b/c, a/b*c));
	}

}
//�Ҽ��������� �ٿ��� �Ѵٷ���BigDecimal�� ��ôµ� ���� x
//int������ �Ѿ�°� �������� �� ũ�� �Ҽ����갡���� double�� ������ �������߿��� int���� ū
//long�� ��ȯ�� �Ҽ��� ������ ���


