package Bronze4;

import java.util.Scanner;

public class Main_2530 {

public static void main(String srgs[]) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,m,h,s;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
	
	int k=c+d;
	s = k%60;
	m = k/60 + b;
	k=m/60;
	m = m%60;
	

	h =k+a;
	h = h%24;
	
	System.out.printf("%d %d %d",h,m,s);
	
	

}
}
