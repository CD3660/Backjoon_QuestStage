package stage01;

import java.util.Scanner;

public class Step_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int num2_1;
		int num2_10;
		int num2_100;
				
		num1=scan.nextInt();
		num2=scan.nextInt();
		num2_1=num2%10;
		num2_10=(num2%100)/10;
		num2_100=num2/100;
		
		System.out.println(num1*num2_1);
		System.out.println(num1*num2_10);
		System.out.println(num1*num2_100);
		System.out.println(num1*num2);
	}
}
