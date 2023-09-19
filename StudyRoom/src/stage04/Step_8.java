package stage04;

import java.util.Scanner;

public class Step_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] Arr1 = new int[10];

		for (int i = 0; i < 10; i++) {
			Arr1[i] = scan.nextInt()%42;
		}
		
		int[] Arr2 = Arr1;
		for (int i = 0; i<10; i++) {
			for (int j = 0; j < i; j++) {
				if (Arr1[i] == Arr1[j]) {
					Arr2[i]=42;
				}
			}
		}
		int a=0;
		for (int i = 0; i<10; i++) {
			if (Arr2[i] == 42) {
				a++;
			}
		}
		System.out.println(10-a);

	}
}