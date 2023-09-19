package stage05;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		String str = scan.next();
		int sum=0;
		for (int i=0; i<a; i++) {
			int b = Integer.parseInt(str.substring(i,i+1));
			sum += b;
		}
		System.out.println(sum);

	}
}