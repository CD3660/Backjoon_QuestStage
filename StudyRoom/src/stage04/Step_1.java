package stage04;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		int[] Array1 = new int[length];
		
		for (int i=0; i<length; i++) {
			
			Array1[i] = scan.nextInt();
			
		}
		
		int a =0, b=scan.nextInt();
		
		for (int i = 0; i<length; i++) {
			if (Array1[i]==b) {
				a++;
			}
		}
		
		System.out.println(a);
		
		
	}
}