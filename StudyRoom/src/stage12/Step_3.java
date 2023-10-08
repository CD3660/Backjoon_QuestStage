package stage12;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		
		int x, y;
		if (a==0) {
			y= c/b;
			x = (f-e*y)/d;
		} else if (d == 0) {
			y = f/e;
			x = (c-b*y)/a;
		} else {
			y = (c*d-f*a)/(b*d-a*e);
			x = (c - b*y)/a;
		}
		System.out.println(x +" "+y);
		
	}
}