package stage03;

import java.util.Scanner;

public class Step_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = scan.nextInt(); i > 0; i--) {

			int a, b;

			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a+b);
		}
	}
}