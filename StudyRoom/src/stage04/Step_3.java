package stage04;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int length = scan.nextInt();
		int[] Array1 = new int[length];

		for (int i = 0; i < length; i++) {

			Array1[i] = scan.nextInt();

		}
		int a = Array1[0];
		for (int i = 0; i < length; i++) {
			if (Array1[i] < a) {
				a = Array1[i];
			}
		}
		System.out.print(a+" ");
		int b = Array1[0];
		for (int i = 0; i < length; i++) {
			if (Array1[i] > b) {
				b = Array1[i];
			}
		}
		System.out.print(b);

	}
}