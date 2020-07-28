package Bronze4;

import java.util.Scanner;

public class Main15873 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = 0, b = 0;
		// a가 10인경우
		if (s.length() == 3) {
			if (s.charAt(1) == '0') {
				a = 10;
				b = s.charAt(2) - '0';
			} else if (s.charAt(2) == '0') {
				b = 10;
				a = s.charAt(0) - '0';
			}
		} else if(s.length()==4) {
			a=10;
			b=10;
		}
		else {

			a = s.charAt(0) - '0';
			b = s.charAt(1) - '0';
		}
		System.out.println(a + b);
	}
}
