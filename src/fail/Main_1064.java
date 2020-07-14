package fail;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main_1064 {
	//부동 소수점 오류때문에 BigDecimal을 써봤지만 sqrt함수를 지원해주지 않아 컴파일 오류.. 포기
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigDecimal xa = sc.nextBigDecimal();
		BigDecimal ya = sc.nextBigDecimal();
		BigDecimal xb = sc.nextBigDecimal();
		BigDecimal yb = sc.nextBigDecimal();
		BigDecimal xc = sc.nextBigDecimal();
		BigDecimal yc = sc.nextBigDecimal();

		// 세점사이의 거리 측정 -> ex) (xa-xb)2+...
		BigDecimal r1, r2, r3;
		r1 = distance(xa, xb, ya, yb);
		r2 = distance(xa, xc, ya, yc);
		r3 = distance(xc, xb, yc, yb);
		MathContext mc = new MathContext(20);
		r1 = r1.sqrt(mc);
		r2 = r2.sqrt(mc);
		r3 = r3.sqrt(mc);
		
		BigDecimal min, max;
		min = r1.compareTo(r2) == -1 ? r1 : r2;
		min = min.compareTo(r3) == -1 ? min : r3;
		max = r1.compareTo(r2) == 1 ? r1 : r2;
		max = max.compareTo(r3) == 1 ? min : r3;

		if (min.compareTo(BigDecimal.ZERO) == 0) {
			// 값이 0이다 == 평행사변형 이 안된다.
			System.out.println(-1);
		} else if ((xa.compareTo(xb) == 0 && xb.compareTo(xc) == 0)
				|| (ya.compareTo(yb) == 0 && yb.compareTo(yc) == 0)) {
			System.out.println(-1);
		} else {
			System.out.println((max.subtract(min)).multiply(BigDecimal.valueOf(2.0)));
		}

	}

	public static BigDecimal distance(BigDecimal x1, BigDecimal x2, BigDecimal y1, BigDecimal y2) {
		BigDecimal x = x1.subtract(x2);
		BigDecimal y = y1.subtract(y2);

		x = x.multiply(x);
		y = y.multiply(y);
		// 빼서 제곱해서 리턴해줌
		BigDecimal result=x.add(y);
		return result;
	}

}
/*60퍼에서 틀림 -> 부동소수점 오류
 * 
 * import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double xa, xb, xc, ya, yb, yc;
		xa = sc.nextDouble();
		ya = sc.nextDouble();
		xb = sc.nextDouble();
		yb = sc.nextDouble();
		xc = sc.nextDouble();
		yc = sc.nextDouble();


		xa*=Math.pow(10, 10);
		ya*=Math.pow(10, 10);
		xb*=Math.pow(10, 10);
		yb*=Math.pow(10, 10);
		xc*=Math.pow(10, 10);
		yc*=Math.pow(10, 10);
		double[] r = new double[3];
		r[0] = Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2);
		r[1] = Math.pow(xc - xb, 2) + Math.pow(yc - yb, 2);
		r[2] = Math.pow(xa - xc, 2) + Math.pow(ya - yc, 2);
		r[0] = Math.sqrt(r[0]) * 2;
		r[1] = Math.sqrt(r[1]) * 2;
		r[2] = Math.sqrt(r[2]) * 2;
		Arrays.sort(r);
		if ((xa == xb && xb == xc) || (ya == yb && yb == yc) || (r[0] <= 0)) {
			System.out.println(-1);
		} else {
			double d = r[2] - r[0];
			d = d/Math.pow(10, 10);
			System.out.printf("%.10f",d);
		}

	}

}*/
