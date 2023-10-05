package stage08;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt();
		int dotNum = 2;
		for (int i=0; i<test; i++) {
			dotNum=dotNum*2-1;
		}
		System.out.println(dotNum*dotNum);
	}
}