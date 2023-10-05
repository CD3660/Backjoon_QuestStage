package stage07;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		int[][] arr1 = new int[a][b];
		int[][] arr2 = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}

		int[][] arrShow = new int[a][b];
		for (int i = 0; i < a; i++) {
			if (i != 0) {
				System.out.println();
			}
			for (int j = 0; j < b; j++) {
				arrShow[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arrShow[i][j]);
				if (j != (b - 1)) {
					System.out.print(" ");
				}
			}
		}

	}
}
