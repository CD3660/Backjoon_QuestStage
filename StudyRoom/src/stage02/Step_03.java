package stage02;

import java.util.Scanner;

public class Step_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();

		if (a%4==0) {
			if(a%100==0) {
				if(a%400==0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
	}
}