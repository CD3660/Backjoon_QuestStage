package stage02;

import java.util.Scanner;

public class Step_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		d = a*60+b+c;
		
		if (d<1440) {
			System.out.print(d/60 + " ");
			System.out.println(d%60);
		}
		else {
			System.out.print((d-1440)/60 + " ");
			System.out.println((d-1440)%60);
		}
	}
}