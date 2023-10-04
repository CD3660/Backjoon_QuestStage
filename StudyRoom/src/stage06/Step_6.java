package stage06;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		String[] alp = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i=0; i<alp.length; i++) {
			str = str.replace(alp[i], "a");
		}

		System.out.println(str.length());
	}
}
