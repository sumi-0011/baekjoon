package Bronze4;

import java.util.Scanner;

public class Main_10707 {
	public static void main(String args[]) {
		int a,b,c,d,p;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d =sc.nextInt();
		p = sc.nextInt();
		
		int x,y;
		x = a*p;
		y=b;
		if(p>c) {
			y +=(p-c)*d;
		}
		int min  = x < y ? x:y;
		System.out.println(min);
	}
}
