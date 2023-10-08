package stage11;

import java.util.Scanner;

public class Step_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int n0=scan.nextInt();
		int c=scan.nextInt();
		int a=scan.nextInt();
		
		if(n1<=c&&(n1*a+n0)<=a*c) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}