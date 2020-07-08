package Bronze4;

import java.util.Scanner;

public class Main_10179 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			double k = sc.nextDouble();
			k = k*0.8;
			k = Math.round(k*100)/100.0;
			System.out.printf("$%.2f\n",k);
		}
		
	}
}
