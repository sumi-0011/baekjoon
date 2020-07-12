package Bronze4;

import java.util.Scanner;

public class Main_11470 {
	public static void main(String args[]) {
		int a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		int s = 0;
		while(a<0 && a<=b) {
			a++;
			s +=c;
		}
		if(a==0 && a<=b) {
			s+=d;
		
		}
		s +=(b-a)*e;
		System.out.println(s);
		
		
		
		
	}
}
