package stage04;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int length = scan.nextInt();
		int ball = scan.nextInt();
		int[] Array1 = new int[length];

		for (int i = 0; i < ball; i++) {

			int a, b, c;
			a = scan.nextInt()-1;
			b = scan.nextInt()-1;
			c = scan.nextInt();
			for (int j = a; j<=b; j++) {
				Array1[j] = c;

		}

		}
		for (int i = 0; i < length; i++) {
		System.out.print(Array1[i]);
		}

	}
}