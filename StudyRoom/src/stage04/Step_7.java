package stage04;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] Array1 = new int[30];

		for (int i = 0; i < 28; i++) {
			Array1[scan.nextInt()-1] = 1;
		}
		int a=0, b=0;
		for (int i = 0; i < 30; i++) {
			if (Array1[i] == 0&&a==0) {
				a = i+1;
			} 
			if (Array1[i]==0&&a!=0) {
				b= i+1;
			}
		}
		if (a < b) {
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println(b);
			System.out.println(a);
		}

	}
}