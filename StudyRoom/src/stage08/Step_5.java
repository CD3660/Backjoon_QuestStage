package stage08;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int hex = 1;
		int step = 1;
		while (n > hex) {
			hex += 6*step;
			step++;
		}
		System.out.println(step);
	}
}