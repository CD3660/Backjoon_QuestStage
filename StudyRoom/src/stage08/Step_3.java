package stage08;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt();
		int[] arr = new int[test];
		for (int i = 0; i < test; i++) {
			arr[i] = scan.nextInt();
		}
		int quat = 0, dime = 0, nick = 0, penny = 0;
		for (int i = 0; i < test; i++) {
			int temp = arr[i];
			quat = temp / 25;
			temp %= 25;
			dime = temp / 10;
			temp %= 10;
			nick = temp / 5;
			temp %= 5;
			penny = temp;
			System.out.println(quat + " " + dime + " " + nick + " " + penny);
		}

	}
}