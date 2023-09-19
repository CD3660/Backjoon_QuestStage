package stage04;

import java.util.Scanner;

public class Step_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int length, test;
		length=scan.nextInt();
		test=scan.nextInt();
		int[] Arr1 = new int[length];

		for (int i = 0; i < length; i++) {
			Arr1[i] = i+1;
		}
		int a, b;

		
		for (int i = 0; i<test; i++) {
			a=scan.nextInt()-1;
			b=scan.nextInt()-1;
			int[] Arr2 = new int[length];
			for (int j = a; j<=b; j++) {
				Arr2[j] = Arr1[b-j+a];
			}
			for (int j = a; j<=b; j++) {
				Arr1[j] = Arr2[j];
			}
		}
		
		for (int i=0; i<length; i++) {
			System.out.print(Arr1[i]+" ");
		}

	}
}