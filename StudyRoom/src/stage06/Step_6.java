package stage06;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int length = str.length();
		int change = 0;

		String[] alp = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < alp.length; i++) {
			if (str.contains(alp[i])) {
				str = str.replace(alp[i], "A");

			}
		}

	}

}
