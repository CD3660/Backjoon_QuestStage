package stage03;

import java.util.Scanner;

public class Step_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b=1;
		a = scan.nextInt();
		
		for (int i = 0; i<a; i++) {
			for (int k =0; k<a-b; k++) {
				System.out.print(" ");
			}
			for (int j =0; j<b; j++) {
				System.out.print("*");
			}
			b++;
			System.out.println("");
		}
		
		
	}
}