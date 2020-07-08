package Bronze5;

import java.util.Scanner;

public class Main_1550 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n=0;
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			if('A'<=c&&c<='F')
				n+=(c-'A'+10)*Math.pow(16, (s.length()-1-i));
			else 
				n+=(c-'0')*Math.pow(16, (s.length()-1-i));
		}
		System.out.println(n);
	}
}
