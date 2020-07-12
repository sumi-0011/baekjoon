package Bronze4;

import java.util.Scanner;

public class Main_5575 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[2][3]; 
		for(int n=0;n<3;n++) {
			for(int i=0;i<2;i++)	 {
				for(int j=0;j<3;j++) {
					array[i][j] = sc.nextInt();
				}	
			}
			int h=0,m=0,s=0;
			if(array[1][2] >= array[0][2]) {
				s = array[1][2] - array[0][2];
			}
			else {
				s = 60+array[1][2] - array[0][2];
				if(array[1][1] == 0) {
					array[1][0]--;
					array[1][1] = 59;
				}
				else {
					array[1][1]-=1;
				}
			}
			if(array[1][1] >= array[0][1]) {
				m = array[1][1] - array[0][1];
			}
			else {
				m = 60+array[1][1] - array[0][1];
				array[1][0] = (array[1][0] == 0) ? 11:array[1][0]-1;
			}
			h = array[1][0] - array[0][0];
			System.out.printf("%d %d %d\n",h,m,s);
			
			
			
		}
		
		
		
	}
}
