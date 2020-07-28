package Bronze4;

import java.util.Scanner;

public class Main_5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		int d = sc.nextInt();
		
		int r1 = a%c==0? a/c : a/c+1;
		int r2 = b%d==0? b/d : b/d+1;
		

		int result =r1>r2?r1:r2;
		result = l-result;
		if (result < 0)
			System.out.println(0);
		else
			System.out.println(result);
	}

}
