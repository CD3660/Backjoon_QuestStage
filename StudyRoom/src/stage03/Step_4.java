package stage03;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		a= scan.nextInt();
		
		for (int i = scan.nextInt(); i>0; i--) {
			int b,c;
			b= scan.nextInt();
			c= scan.nextInt();
			a=a-b*c;
		}
		if (a == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}