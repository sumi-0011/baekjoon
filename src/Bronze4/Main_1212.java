package Bronze4;

import java.io.IOException;
import java.util.Scanner;

public class Main_1212 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s="";
		do {
			int k = n%10;
		
			for(int i=0;i<3;i++) {
				s = (k%2) +s;
				k/=2;
			}
		}while((n=n/10)!=0);
		for(int i=0;i<3;i++) {
			if(s.charAt(i)=='0') {
				s = s.substring(1, s.length());
			}
			else 
				break;
		}
		System.out.println(s);
	}
}
