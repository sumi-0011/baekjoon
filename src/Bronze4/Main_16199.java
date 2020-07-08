package Bronze4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_16199 {

	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int n1,n2,n3;	//만 나이, 세는 나이, 연 나이
		if(array[0][1]<array[1][1] || 
				(array[0][1] == array[1][1] && array[0][2]<=array[1][2])) {
			//생일이 지난 경우
			System.out.println(array[1][0] - array[0][0]);
			System.out.println(array[1][0] - array[0][0]+1);
			System.out.println(array[1][0] - array[0][0]);
			
		}else {
			System.out.println(array[1][0] - array[0][0]-1);
			System.out.println(array[1][0] - array[0][0]+1);
			System.out.println(array[1][0] - array[0][0]);
		}
		
		
		
		
	}

}
