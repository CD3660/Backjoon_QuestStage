package stage03;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=0;
		for (int i = scan.nextInt(); i > 0; i--) {

			
			a = a+i;
		}
		System.out.println(a);
	}
}