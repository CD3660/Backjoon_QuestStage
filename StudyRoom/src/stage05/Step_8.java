package stage05;

import java.util.Scanner;

public class Step_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String[] strArr = str.split(" ");
		int length=0;
		for (int i=0; i<strArr.length; i++) {
			if (strArr[i] != "") {
				length++;
			}
		}
		System.out.println(length);
	}
}