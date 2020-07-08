package Bronze4;

import java.util.Scanner;

public class Main_2525 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,m,h;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		m = b+c;
		h = a + m/60;
		m = m%60;
		h = h%24;
		System.out.println(h + " " + m); 

		
		

	}
}
