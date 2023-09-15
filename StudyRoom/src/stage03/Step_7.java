package stage03;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		c = scan.nextInt();
		
		for (int i = 0; i<c; i++) {
			a =scan.nextInt();
			b =scan.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (a + b));
		}
		
		
	}
}