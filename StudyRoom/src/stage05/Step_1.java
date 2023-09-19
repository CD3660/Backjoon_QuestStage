package stage05;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int a = scan.nextInt();
		
		String alp = str.substring(a-1, a);
		System.out.println(alp);
	}
}