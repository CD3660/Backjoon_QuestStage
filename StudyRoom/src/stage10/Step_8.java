package stage10;

import java.util.Scanner;

public class Step_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a>=b+c) {
			System.out.println(2*(b+c)-1);
		} else if (b>=a+c) {
			System.out.println(2*(a+c)-1);
		} else if (c>=a+b) {
			System.out.println(2*(a+b)-1);
		} else {
			System.out.println(a+b+c);
		}
		
	}
}
