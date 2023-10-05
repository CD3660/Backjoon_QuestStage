package stage08;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int div = 1;
		int step = 1;
		while (n > div) {
			div += ++step;
		}
		
		int temp = div-n;
		if(step%2==0) {
		System.out.println((step-temp) + "/" + (temp+1));
		} else {
			System.out.println((temp+1) + "/" + (step-temp));
		}
	}
}