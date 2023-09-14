package stage02;

import java.util.Scanner;

public class Step_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();

		if (60 <= a) {
			if (70 <= a) {
				if (80 <= a) {
					if (90 <= a) {
						System.out.println("A");
					} else {
						System.out.println("B");
					}
				} else {
					System.out.println("C");
				}
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
	}
}