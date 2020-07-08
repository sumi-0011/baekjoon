package Bronze4;

import java.util.Scanner;

public class Main_10039 {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			array[i] = sc.nextInt();
			if(array[i]<40)
				array[i] = 40;
			sum+=array[i];
		}
		System.out.println(sum/5);
		
	}
}
