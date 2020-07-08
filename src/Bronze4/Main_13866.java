package Bronze4;

import java.util.Scanner;

public class Main_13866 {

	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		int sum=0;
		for(int i=0;i<4;i++) {
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		int min = sum;
		for(int i=0;i<3;i++) {
			for(int j = i+1;j<4;j++) {
				int one = array[i] + array[j];
				int k = sum-one;
				int min2 = k>one ? (k-one) : (one-k);
				min = min> min2	? min2 : min;
			}
		}
		System.out.println(min);
	}
}
