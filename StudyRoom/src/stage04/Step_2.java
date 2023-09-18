package stage04;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int length = scan.nextInt();
		int a = scan.nextInt();
		int[] Array1 = new int[length];

		for (int i = 0; i < length; i++) {

			Array1[i] = scan.nextInt();

		}

		for (int i = 0; i < length; i++) {
			if (Array1[i] < a) {
				System.out.print(Array1[i] + " ");
			}
		}

	}
}