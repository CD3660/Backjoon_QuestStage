package stage01;

import java.util.Scanner;

public class Step_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
