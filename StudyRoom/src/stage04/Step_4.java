package stage04;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] Array1 = new int[9];

		for (int i = 0; i < 9; i++) {

			Array1[i] = scan.nextInt();

		}
		
		int a, b;
		a = Array1[0];
		b = 1;
		for (int i = 0; i < 9; i++) {
			if (Array1[i] > a) {
				a = Array1[i];
				b = i+1;
			}
		}
		System.out.println(a);
		System.out.println(b);

	}
}