package stage06;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		for (int i = 0; i<test; i++) {
			for (int j=0; j<test-i-1;j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<test-1; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*test-2*i-3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}