package stage11;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		
		System.out.println(a*(a-1)*(a-2)/6);
		System.out.println(3);
	}
}