package Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11948 {

public static void main(String srgs[]) {
	Scanner sc = new Scanner(System.in);
	int[] array = new int[4];
	int[] array2 = new int[2];
	int sum=0;
	for(int i=0;i<array.length;i++) {
		array[i] = sc.nextInt();
	}
	int max2 = 0;
	for(int i=0;i<array2.length;i++) {
		array2[i] = sc.nextInt();
		max2 = max2 > array2[i] ? max2:array2[i];
	}
	Arrays.sort(array);
	sum = array[2]+array[3] +array[1]+ max2;
	System.out.println(sum);

	
}
}
