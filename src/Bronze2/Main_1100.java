package Bronze2;

import java.util.Scanner;

public class Main_1100 {
	public static void main(String args[]) {
		// 1075
		Scanner sc = new Scanner(System.in);
		char[][] array = new char[8][8];
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			String a = sc.next();
			for (int j = 0; j < 8; j++) {
				array[i][j] =a.charAt(j);
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((i%2==0 && j%2==0)||(i%2==1&&j%2==1)) {
					if(array[i][j]=='F')
						sum++;
				}
							
			}
		}
		System.out.println(sum);

	}
}
