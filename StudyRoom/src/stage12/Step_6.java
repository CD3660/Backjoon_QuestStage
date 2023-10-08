package stage12;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int five = n / 5;
		int rest = n % 5;
		int three = 0;
		while (rest != 0) {
			if (rest >= 3) {
				three++;
				rest -= 3;
			} else {
				five--;
				three++;
				rest += 2;
			}
		}
		if (five<0||three<0) {
			System.out.println(-1);
		} else {
			System.out.println(five + three);
		}
	}
}
