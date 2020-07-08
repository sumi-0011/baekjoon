package Bronze4;

import java.util.Scanner;

public class Main_14924 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int s,t,d;
		s = sc.nextInt();	//기차의 속도
		t = sc.nextInt();	//파리의 속도 t>s
		d = sc.nextInt();	//거리 2*s의 배수
		
		int h = d/(2*s);
		System.out.println(t*h);
		
	}
}
