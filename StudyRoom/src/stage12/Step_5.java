package stage12;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int count = 0;
		int i = 0;
		while (count < n) {
			String str = ++i + "";
			if (str.contains("666")) {
				count++;
			}
		}
		System.out.println(i);
	}
}
