package Bronze4;

import java.util.Scanner;

public class Main_16486 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();	//c������ ���α���
		int d2 = sc.nextInt();	//������
		double PI = 3.141592;
		
		double round=d1*2;
		round += PI*d2*2;
		
		System.out.println(round);
		
	}
}
