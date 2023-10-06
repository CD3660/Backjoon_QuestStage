package stage10;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		boolean x = a==b, y = b==c, z = a==c;
		if (a+b+c!=180) {
			System.out.println("Error");
		} else if (a==b&&b==c) {
			System.out.println("Equilateral");
		} else if (x||y||z) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
		
	}
}
