package stage06;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] intArr1 = {1, 1, 2, 2, 2, 8};
		int[] intArr2 = new int[6];
		
		for (int i=0; i<6; i++) {
			intArr2[i] = scan.nextInt();
		}
		
		for (int i=0; i<6; i++) {
			intArr1[i] -= intArr2[i]; 
		}
		
		for (int i=0; i<6; i++) {
			System.out.print(intArr1[i]+" ");
		}
		
	}
}