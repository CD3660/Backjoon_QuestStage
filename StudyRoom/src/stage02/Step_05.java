package stage02;

import java.util.Scanner;

public class Step_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		int c = a*60+b+1440 -45;
		
		if ( c < 1440) {
			System.out.print(c/60+" ");
			System.out.println(c%60);
		}
		else {
			System.out.print((c-1440)/60+" ");
			System.out.println((c-1440)%60);
		}
		
	}
}