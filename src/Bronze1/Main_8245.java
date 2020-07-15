package Bronze1;

import java.util.Scanner;

public class Main_8245 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] array = new char[n][m];
		
		for(int i=0;i<n;i++	 ) {	//14
			String a = sc.next();
			for(int j=0;j<m;j++) {	//9
				array[i][j]= a.charAt(j);
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(array[j][i]);
			}
			System.out.println();
		}
		
	}
}
