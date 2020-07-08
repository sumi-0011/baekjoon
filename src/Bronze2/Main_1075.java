package Bronze2;

import java.util.Scanner;

public class Main_1075 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f =sc.nextInt();
		
		//1.
		n = n/100;
		n = n*100;
		int r =n%f;
		if(r==0)
			System.out.println("00");
		else if((f-r)<10)
			System.out.printf("0%d",f-r);
		else
			System.out.printf("%d",f-r);
		
		
	}
}
