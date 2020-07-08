package Bronze4;

import java.util.Scanner;

public class Main_3004 {

public static void main(String srgs[]) {
	Scanner sc = new Scanner(System.in);
	int n,k;
	n = sc.nextInt();
	int max = 0;
	for(int i=0;i<=n;i++) {
		int j=n-i;
		k = (i+1) * (j+1);
		max = max > k	? max:k	;
	}
	System.out.println(max);
	

}
}
